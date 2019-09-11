package gcm.basics;

import java.util.Objects;

/*
 * This is the general type Car
 */
public class Car {

    // Instance variables, set in constructor
    private String color;
    private int doors;
    private int speed;
    private String plates;

    // Class variables
    private static int TAXES_CONSTANT = 25;

    // Constructor of cars
    public Car(String color, int doors, int speed, String plates){
        this.color = color;
        this.doors = doors;
        this.speed = speed;
        this.plates = plates;
    }
    // Method that calculates treveled Km in an amount of time
    public int calculateTraveledKm(int time){
        // Local variable
        int result = this.speed * time;
        return result;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public String getPlates() {
        return plates;
    }

    @Override
    public String toString() {
        String message = "This is the rsult message";
        message.length();
        String endMessage = " . The end.";
        message.concat(endMessage);
        String helloMessage = "hola";
        boolean result = helloMessage.equalsIgnoreCase("HoLa");
        message.contains("ss");
        return "Car{" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object currentObject) {
        if (this == currentObject) return true;
        Car car = (Car) currentObject;
        return Objects.equals(getPlates(), car.getPlates());
    }

}
