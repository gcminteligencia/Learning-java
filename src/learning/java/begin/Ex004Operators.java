package learning.java.begin;

public class Ex004Operators {
    public static void main(String[] args){
        /*
        * ------- Ordem de precedência -------
        *
        *  ++, -- (pós fixo)
        *
        *  ++, --, !, +(unário) -(unário), cas()
        *
        *  *, /, %
        *
        *  +, -
        *
        * >>, >>>, <<
        *
        * >, >=, <, <=, instanceof
        *
        * ==, !=
        *
        * &
        *
        * |
        *
        * &&
        *
        * ||
        *
        * ?:
        *
        * =, op= (atribuição ou atribuição com cálculo ex: +=, -=)
        *
        * */
        float number01 = 7;
        float number02 = 10;
        float number03 = 100;
        float number04 = 2;
        float equal = number01 + number02 / ++number04 * number03;
        System.out.println(equal);
    }
}
