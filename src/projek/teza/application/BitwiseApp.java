package projek.teza.application;

public class BitwiseApp {
    public static void main(String[] args) {

        byte a = 3;
        byte b;
        String a_byte, b_byte;

        a_byte = String.format("%8s", Integer.toBinaryString(a).replace(' ', '0'));
        System.out.printf("%s = %d \n", a_byte, a);
        // enter
        System.out.println("=================");
        b = (byte) (a << 1);
        b_byte = String.format("%8s", Integer.toBinaryString(b).replace( ' ', '0'));
        System.out.printf("%s = %d \n", b_byte, b);
    }
}
