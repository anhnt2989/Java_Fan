import java.util.Scanner;

public class Define {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan();

        Fan1.setAll(3, true, 10, "yellow");
        System.out.println("Re-set status of fan1: ");
        Fan1.setStatus(scanner.nextBoolean());
        System.out.println("Re-set speed of fan1: ");
        Fan1.setSpeed(scanner.nextInt());
        System.out.println("Re-set color of fan1: ");
        Fan1.setColor(scanner.next());
        System.out.println("Re-set radius of fan1: ");
        Fan1.setRadius(scanner.nextDouble());
        System.out.println("Fan1\'s info: ");
        Fan1.fanIs();

        Fan2.setAll(2, false, 5, "blue");
        System.out.println("Re-set status of fan2: ");
        Fan2.setStatus(scanner.nextBoolean());
        System.out.println("Re-set speed of fan2: ");
        Fan2.setSpeed(scanner.nextInt());
        System.out.println("Re-set color of fan2: ");
        Fan2.setColor(scanner.next());
        System.out.println("Re-set radius of fan2: ");
        Fan2.setRadius(scanner.nextDouble());
        System.out.println("Fan2\'s info: ");
        Fan2.fanIs();
    }
}
