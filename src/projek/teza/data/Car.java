package projek.teza.data;

public interface Car extends  HasBrand{
    void drive();

    Integer getTire();

   default boolean isBig(){
       return false;
   }
}
