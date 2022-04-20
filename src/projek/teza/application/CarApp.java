package projek.teza.application;

import projek.teza.data.Avanza;
import projek.teza.data.Car;
public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        car.drive();
        System.out.println("Avanza mempunyai " + car.getTire()+ " ban");
    }
}
