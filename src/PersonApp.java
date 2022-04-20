public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Tezasn", "Kab.Tangerang");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);


        Person person2 = new Person("Budi" );
        person2.sayHello("Ana");

        Person person3;
        person3 = new Person();
        person3.name = "Joko";
        person3.sayHello("Agung");


    }
}
