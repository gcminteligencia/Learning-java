package learning.java.begin;

public class Ex005Conditional {
    public static void main(String[] args){
        int x = 5;
        int y = 4;
        String oddOrEven = "";

        if (y % 2 == 0){
            oddOrEven = "Even";
        }else {
            oddOrEven = "Odd";
        }

        System.out.println("The number "+y+" is "+oddOrEven+"");
    }
}
