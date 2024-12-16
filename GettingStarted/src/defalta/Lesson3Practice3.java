package defalta;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class Lesson3Practice3 {
    // Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception {

        // Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        // Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // Initialize counters for button presses
        int redButtonPressCount = 0;
        int greenButtonPressCount = 0;

        // Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
        boolean lastRedButtonState = false; // Track the last state of the red button
        boolean lastGreenButtonState = false; // Track the last state of the green button

        while (true) {

            // Check the red button
            if (redButton.getState()) {
                redLED.setState(true);
                if (!lastRedButtonState) {
                    // Button was just pressed, increment counter
                    redButtonPressCount++;
                    System.out.println("Red button pressed. Total presses: " + redButtonPressCount);
                }
            } else {
                redLED.setState(false);
            }
            lastRedButtonState = redButton.getState(); // Update the last state for the red button

            // Check the green button
            if (greenButton.getState()) {
                greenLED.setState(true);
                if (!lastGreenButtonState) {
                    // Button was just pressed, increment counter
                    greenButtonPressCount++;
                    System.out.println("Green button pressed. Total presses: " + greenButtonPressCount);
                }
            } else {
                greenLED.setState(false);
            }
            lastGreenButtonState = greenButton.getState(); // Update the last state for the green button

            Thread.sleep(150); 
        }
    }
}