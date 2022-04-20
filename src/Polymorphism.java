public class Polymorphism {
    public static void main(String[] args) {


        //OOP menggunakan polymophism
        //polymorphism adalah perubahan bentuk dari objek ke objek lain yaitu polymorphism
        //polumorphism masih berhubungan erat dengan inheritance
        //inheritance adalah OOP turunan method class dari parent class untuk ke atau beberapa child class

        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");


        employee = new Manager("Teza");
        employee.sayHello("Ana");

        employee = new VicePresident("Anggun");
        employee.sayHello("Ari");

        //method polymorphism
        sayHello(new Employee("Teza"));
        sayHello(new VicePresident("za"));
        sayHello(new Manager("Tz"));

    }
    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicepresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicepresident.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello MG "+ manager.name);
        } else {
            System.out.println("Hello "+ employee.name);
        }
    }

}
