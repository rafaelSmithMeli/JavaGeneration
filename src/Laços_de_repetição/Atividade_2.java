package Laços_de_repetição;

import java.util.*;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, impar = 0, par = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o " + cont + "° número:");
            num = ler.nextInt();

                if (num % 2 == 0) {
                par++;}
                if (num % 2 == 1){
                    impar++;}


        }
        System.out.println("Total de números pares:" + par + "\n Total de números ímpares:" +impar);
    }
}