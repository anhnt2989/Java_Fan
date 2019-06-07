class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {

    }

    int getSpeed() {
        return this.speed;
    }

    boolean getStatus() {
        return this.on;
    }

    double getRadius() {
        return this.radius;
    }

    String getColor() {
        return this.color;
    }

    int setSpeed(int speed) {
        return this.speed = speed;
    }

    boolean setStatus(boolean status) {
        return this.on = status;
    }

    double setRadius(double radius) {
        return this.radius = radius;
    }

    String setColor(String color) {
        return this.color = color;
    }


    void setAll(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.on = status;
        this.radius = radius;
        this.color = color;
    }

    void fanIs() {
        if (this.on) {
            System.out.println("Fan is on!"
                    + "\n" + "Current speed is: " + speed
                    + "\n" + "Color of fan is: " + color
                    + "\n" + "Radius of fan is: " + radius);
        } else {
            System.out.println("Fan is off!"
                    + "\n" + "Color of fan is: " + color
                    + "\n" + "Radius of fan is: " + radius);
        }
    }
}
