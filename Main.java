package project;
import java.util.Scanner;

class SmartDevice {
 String name;
 boolean isOn;

 SmartDevice(String name) {
     this.name = name;
     this.isOn = false;
 }

 void turnOn() {
     isOn = true;
     System.out.println(name + " is ON");
 }

 void turnOff() {
     isOn = false;
     System.out.println(name + " is OFF");
 }
}
class SmartSpeaker extends SmartDevice {

 SmartSpeaker(String name) {
     super(name); 
 }

 void voiceCommand(String command) {
     if (!isOn && !command.equalsIgnoreCase("turn on")) {
         System.out.println("Cannot process command. " + name + " is OFF.");
         return;
     }

     switch (command.trim().toLowerCase()) {
         case "turn on":
             turnOn();
             break;

         case "play music":
             System.out.println(" Playing music...");
             break;

         case "stop music":
             System.out.println(" Music stopped.");
             break;

         case "turn off":
             turnOff();
             break;

         default:
             System.out.println("Unknown command.");
     }
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     SmartSpeaker speaker = new SmartSpeaker("Living Room Speaker");
     System.out.println("----> M Sri Priya Dharshini<--------");
     System.out.println("---->Regno:211240020364<-----");
     System.out.println("Type a voice command for the Smart Speaker (type 'exit' to quit):");

     while (true) {
         System.out.print("Command: ");
         String command = scanner.nextLine();

         if (command.equalsIgnoreCase("exit")) {
             System.out.println("Exiting Smart Speaker...");
             break;
         }

         speaker.voiceCommand(command);
     }

     scanner.close();
 }
}
