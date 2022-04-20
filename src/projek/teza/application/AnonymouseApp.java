package projek.teza.application;

import projek.teza.data.Anonymouse;

public class AnonymouseApp {
    public static void main(String[] args) {
        Anonymouse english = new Anonymouse() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello "+ name);
            }

        };

        Anonymouse indonesia = new Anonymouse() {
            @Override
            public void sayHello() {
                System.out.println("Hai");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hai " + name);
            }
        };

        english.sayHello();
        english.sayHello("Teza");

        indonesia.sayHello();
        indonesia.sayHello("Ana");
    }
}
