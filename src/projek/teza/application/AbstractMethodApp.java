package projek.teza.application;

import projek.teza.data.Animal;
import projek.teza.data.Cat;
import projek.teza.data.Dog;

public class AbstractMethodApp {
    public static void main(String[] args) {
       Animal animal = new Dog();
       animal.name ="Teza";
       animal.run();

       Animal cat = new Cat();
       cat.name = "Puss";
       cat.run();
    }
}
