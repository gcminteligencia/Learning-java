package learning.java.begin;

public class Ex001HelloWorld {
    public static void main(String[] args){

        byte cell = 8;
        short shortNumber = 16;
        int x = 32;
        long bigNumber = 64;
        float salary = 4.99F;
        double intrinsic = 3.1415;
        char gender = 'm';
        boolean sentence = true;

        System.out.println("Primitive Types\nByte = "+cell+" bits\nShort = "+shortNumber+" bits\nInt = "+x+" bits\nLong = "+bigNumber+" bits");
        System.out.println("Float Ex: R$"+ salary);
        System.out.println("Double Ex: Pi = "+intrinsic);
        System.out.println("Char Ex: Gender = "+gender);
        System.out.println("Boolean Ex: The sky is blue = "+sentence);
    }
}