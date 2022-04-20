package projek.teza.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Drive Bus");
    }


    public Integer getTire() {
        return 5;
    }


    public String getBrand() {
        return "Mercedes";
    }


    public boolean isBig() {
        return false;
    }
}
