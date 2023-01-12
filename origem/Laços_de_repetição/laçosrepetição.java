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
package Laços_de_repetição;

import java.util.*;

public class Atividade_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = 0, me = 0, idd = 0;

        while (num >= 0) {
            System.out.println("Digite uma idade:");
            num = ler.nextInt();

            if (num > 50) {
                idd++;
                System.out.println(idd);
            } else if (num < 21 && num >= 0) {
                me++;


            }

        }
        System.out.println("Idades maiores de 50: " + idd + "\nIdades menores que 21: " + me);


    }
}
public class Atividade_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = 0, soma = 0;
        do {
            System.out.println("Digite um número:");
            num = ler.nextInt();

            if (num >= 0) {
                soma = num + soma;

            }


        } while (num != 0);
        System.out.println("A soma dos números positivos é: " + soma);
    }
}
