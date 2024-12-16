package defalta;

import com.phidget22.DigitalInput;

public class Leson2Practice3 {
    // Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception {

        // Create | Here you've created a DigitalInput object for your button.
        DigitalInput redButton = new DigitalInput();

        // Address | This tells your program where to find the device you want to work with.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        // Open | Open establishes a connection between your object and your physical Phidget.
        redButton.open(1000);

        // Variable to track the previous state of the button
        boolean lastState = redButton.getState();

        // Use your Phidgets | This code checks the state of the button and only prints when the state changes.
        while (true) {
            boolean currentState = redButton.getState();

            // Print only if the state has changed
            if (currentState != lastState) {
                System.out.println("Button State: " + currentState);
                lastState = currentState; // Update the last state
            }

            Thread.sleep(150);
        }
    }
}
