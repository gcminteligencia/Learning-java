package learning.java.begin;

public class Ex006Loops {
    public static void main(String[] args){
        // while, do while, for
        int countWhile = 0;
        System.out.println("-------While-------\n");
        while (countWhile <= 7){
            System.out.println("Number: "+countWhile);
            countWhile++;

        }

        System.out.println("-------For-------\n");
        for (int i=0; i<=4;i++){
            System.out.println("i: "+i);
        }

        System.out.println("-------Do while-------\n");
        int countDoWhile = 0;
        do {
            System.out.println("Counter do "+ ++countDoWhile);

        } while (countDoWhile < 3);
    }
}
