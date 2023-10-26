package learning.java.begin;

public class Ex006LoopsPt02 {
    public static void main(String[] args){
        System.out.println("Hello, world.");

        long counter = 0;
        while (counter <= 1000000){
            counter++;

            if (counter % 2 == 0){
                System.out.println("Even number: "+counter);

            }
        }
    }
}
