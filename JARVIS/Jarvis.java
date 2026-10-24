import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;


public class Jarvis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       JARVIS STARTED");
        System.out.println("================================");
        System.out.println("Hello! I am Jarvis.");
        System.out.println("How can I help you?");

        while (true) {

            System.out.print("\nYou: ");
            String command = sc.nextLine().toLowerCase();

            if (command.equals("hello")) {
                System.out.println("Jarvis: Hello Anny! 👋");

            } else if (command.equals("how are you")) {
                System.out.println("Jarvis: I am fine! What about you?");
        }  else if (command.equals("i am fine")) {
                System.out.println("Jarvis: That's great to hear!");
        } else if (command.equals("what is your name")) {
                System.out.println("Jarvis: My name is Jarvis. 🤖");

            } else if (command.equals("java")) {
                System.out.println("Jarvis: Java is a powerful programming language. ☕");
            } else if(command.equals("open google")) {
                System.out.println("Jarvis: Opening Google... 🌐");
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com"));
                } catch (Exception e) {
                    System.out.println("Jarvis: Sorry, I couldn't open Google.");
                }
            } else if (command.equals("open youtube")) {
                System.out.println("Jarvis: Opening YouTube... 🎥");
                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com"));
                } catch (Exception e) {
                    System.out.println("Jarvis: Sorry, I couldn't open YouTube.");
                }
            } else if (command.equals("open github")) {
                System.out.println("Jarvis: Opening GitHub... 🐙");
                try {
                    Desktop.getDesktop().browse(new URI("https://www.github.com"));
                } catch (Exception e) {
                    System.out.println("Jarvis: Sorry, I couldn't open GitHub.");
                }

            } else if (command.equals("exit")) {
                System.out.println("Jarvis: Goodbye! 🤖");
                break;

            } else {
                System.out.println("Jarvis: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}