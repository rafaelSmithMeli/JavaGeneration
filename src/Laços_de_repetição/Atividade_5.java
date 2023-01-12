package Laços_de_repetição;

import java.util.*;

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

