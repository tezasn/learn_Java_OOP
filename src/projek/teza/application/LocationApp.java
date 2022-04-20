package projek.teza.application;

import projek.teza.data.City;

public class LocationApp {
    public static void main(String[] args) {
        var city = new City();
        city.name = "Teza";

        System.out.println(city.name);
    }
}
