public class Define {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan();

        Fan1.setAll(3, true, 10, "yellow");
        System.out.println("Fan1\'s info: ");
        Fan1.fanIs();

        Fan2.setAll(2, false, 5, "blue");
        System.out.println("Fan2\'s info: ");
        Fan2.fanIs();
    }
}
