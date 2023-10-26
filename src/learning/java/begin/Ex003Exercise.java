package learning.java.begin;

/*
* Crie variáveis para os campos descritos abaixo e imprima a mensagem a seguir:
* Eu <name>, moro no endereco <adress>, confirmo que recebi o salario de R$<salary> na data de <date>
*
* */

public class Ex003Exercise {
    public static void main(String[] args){
        String name = "Angell Belger";
        String address = "4931 NW Front Ave, Portland, OR 97210, United State";
        double salary = 2000000.00;
        String date = "01/01/2030";
        String msg = "Me, "+name+", living on address: "+address+"\nI receive the amount of money, in " +
                "value R$"+salary+", on date:"+date+"";
        System.out.println(msg);
    }
}
