package defalta;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;
import com.phidget22.DigitalOutput;

public class HotOrCold {
public static void main(String[] args) throws Exception{

    //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    DigitalOutput redLED = new DigitalOutput();
    DigitalOutput greenLED = new DigitalOutput();
    // Set the port addresses for the Phidget devices
    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);
    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);
    //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
    temperatureSensor.open(1000);
    redLED.open(3000);
    greenLED.open(3000);

    //Use your Phidgets | This code will print the temperature every 150ms
    while (true) {
    	if(temperatureSensor.getTemperature() > 20 && temperatureSensor.getTemperature() < 24.87) {
    	redLED.setState(false);
    	greenLED.setState(true);
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        Thread.sleep(150);
    }else {
    	greenLED.setState(false);
    	redLED.setState(true);
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        Thread.sleep(150);
    }
}
}
}
