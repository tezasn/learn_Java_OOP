class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //membuat constructor untuk class
    Person(String name, String address){
    //untuk mengatasi masalah variabel shadowing kita menggunakan kata kunci this pada setiap fieldnya
    this.name = name;
    this.address = address;
    }

    //Membuat constructor overloading untuk Person
    Person(String paramName){
        this(paramName, null);
    }

    Person(){
        this(null);
    }


    void sayHello(String paramName){
        System.out.println("Hello "+ paramName+" My name is "+ this.name);
    }
}


