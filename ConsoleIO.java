import java.util.Scanner;

public class ConsoleIO {

    private Scanner scanner;

    public ConsoleIO() {
        setScanner(new Scanner(System.in));
    }

    private void setScanner(Scanner scanner) {
        if (scanner != null) {
            this.scanner = scanner;
        }
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void printLine(String message) {
        System.out.println(message);
    }
}
