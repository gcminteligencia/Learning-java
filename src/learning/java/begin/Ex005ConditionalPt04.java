package learning.java.begin;

public class Ex005ConditionalPt04 {
    /*
    * Income tax 2020/2021              Progressive rate up to 45%
    *
    * 0 to £12,570                        0%
    * Between £12,571 and £37,700         20% (base rate)
    * Between £37,701 and £150,000        40% (high rate)
    * Over £150,000                       45% (additional fee)
    * */
    public static void main(String[] args){
        double salary = 2000000;
        String msg = "";
        double tax = 0;

        if (salary <= 12570){
            tax = 0;
        }else if (salary > 12570 && salary <= 37700){
            tax = salary * 0.2;
        }else if (salary > 37700 && salary <= 150000){
            tax = salary * 0.4;
        }else{
            tax = salary * 0.45;
        }

        System.out.println("You need to pay £"+tax);
    }
}
