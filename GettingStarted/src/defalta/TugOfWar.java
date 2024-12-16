package defalta;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar {
    public static void main(String[] args) throws Exception {

        // Create objects for the buttons and LEDs
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        // Set the addresses for each device
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Open connections to the devices
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        // Counter for the button presses
        int countRd = 0; 
        int countGn = 0;
        // Indicates if the  button has been pressed in this iteration
        boolean redButtonPressed = false; 
        boolean greenButtonPressed = false; 

        // Game loop where players must press their button 10 times
        while (countRd < 10 && countGn < 10) {

            // Check if the red player pressed their button
            if (redButton.getState() && !redButtonPressed) { // If the red button is pressed and not counted yet
                countRd += 1; // Increment the red button counter
                redLED.setState(true); // Turn on the red LED
                redButtonPressed = true; // Mark that the button was pressed
            } else if (!redButton.getState()) {
                redButtonPressed = false; // Reset the button press state if it's no longer pressed
                redLED.setState(false); // Turn off the red LED if the button is not pressed
            }

            // Check if the green player pressed their button
            if (greenButton.getState() && !greenButtonPressed) { // If the green button is pressed and not counted yet
                countGn += 1; // Increment the green button counter
                greenLED.setState(true); // Turn on the green LED
                greenButtonPressed = true; // Mark that the button was pressed
            } else if (!greenButton.getState()) {
                greenButtonPressed = false; // Reset the button press state if it's no longer pressed
                greenLED.setState(false); // Turn off the green LED if the button is not pressed
            }          
            Thread.sleep(10); 
        }

        // Once a player wins, blink both LEDs once
        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(1000); // Both LEDs on for 1 second
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(1000); // Both LEDs off for 1 second

        // The winner blinks their LED 5 times
        if (countRd == 10) { // If the red player wins
            for (int i = 0; i < 5; i++) {
                redLED.setState(true);
                Thread.sleep(500); 
                redLED.setState(false);
                Thread.sleep(500);
            }
        } else if (countGn == 10) { // If the green player wins
            for (int i = 0; i < 5; i++) {
                greenLED.setState(true);
                Thread.sleep(500); 
                greenLED.setState(false);
                Thread.sleep(500);
            }
        }
        redButton.close();
        redLED.close();
        greenButton.close();
        greenLED.close();
    }
}
