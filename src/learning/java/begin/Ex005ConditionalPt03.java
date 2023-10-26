package learning.java.begin;

public class Ex005ConditionalPt03 {

    public static void main(String[] args){
        double salary = 2000000.00;
        double donate = salary * 0.01;
        String charity = salary >= 2000000 ? "Donate R$"+donate+"":"No donate";
        System.out.println(charity);
    }

}
