class Manager extends  Employee {
    String address;
    Manager(String name){
    super(name);
    }
    Manager(String name, String address){
        super(name);
        this.address = address;
    }

    void sayHello(String name){
        System.out.println("Hello"+ name + "My name is manager "+ this.name);
    }
}
