package projek.teza.data;

public class Avanza implements Car, IsMaintenance{

    @Override
    public boolean isBig() {
        return Car.super.isBig();
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    public String getBrand(){
        return "Toyota";
    }
    public void drive(){
        System.out.println("Drive Avanza");
    }

    public Integer getTire(){
        return 4;
    }

}
