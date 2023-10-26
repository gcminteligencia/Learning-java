package learning.java.begin;

public class Ex005ConditionalPt02 {
    public static void main(String[] args){
        System.out.println("-------Football Category-------");

        int age = 14;
        String category = "";

        if (age < 8){
            category = "Very young, call you mommy.";
        }else if (age >= 8 && age <= 12){
            category = "Sub 12";

        }else if (age > 12 && age <= 15){
            category = "Sub 15";

        }else if (age > 15 && age <= 17){
            category = "Sub 17";

        }else{
            category = "Adult";
        }

        System.out.println("Your category is: "+category);
    }
}
