import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class WhatsAppSpammer {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        // Wait 5 seconds for user to focus WhatsApp chat input box
        System.out.println("You have 5 seconds to click the WhatsApp message box...");
        Thread.sleep(5000);

        for (int i = 0; i < 100; i++) {
            String message =("Hi babee, I love you so much ");
            typeMessage(robot, message);
            pressEnter(robot);
            Thread.sleep(100); // Small delay between messages
        }

        System.out.println("Messages sent!");
    }

    public static void typeMessage(Robot robot, String message) {
        for (char c : message.toCharArray()) {
            typeChar(robot, c);
        }
    }

    public static void typeChar(Robot robot, char c) {
        try {
            boolean upperCase = Character.isUpperCase(c);
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

            // Handle characters needing shift
            if (keyCode == KeyEvent.VK_UNDEFINED) {
                System.out.println("Cannot type character: " + c);
                return;
            }

            // Handle special characters manually
            switch (c) {
                case ' ':
                    keyCode = KeyEvent.VK_SPACE;
                    break;
                case ',':
                    keyCode = KeyEvent.VK_COMMA;
                    break;
                case '.':
                    keyCode = KeyEvent.VK_PERIOD;
                    break;
                case '!':
                    keyCode = KeyEvent.VK_1;
                    upperCase = true;
                    break;
                // Add more cases as needed
            }

            if (upperCase || isShiftNeeded(c)) {
                robot.keyPress(KeyEvent.VK_SHIFT);
            }

            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);

            if (upperCase || isShiftNeeded(c)) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }

            Thread.sleep(10); // Small delay to simulate real typing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void pressEnter(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
}
