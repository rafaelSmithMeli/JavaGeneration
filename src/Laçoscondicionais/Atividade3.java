package Laçoscondicionais;

import java.util.*;

public class Atividade3 {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        int cod, qtd;
        double valor;

        System.out.println("\n--Digite 1 para Cachorro-quente --");
        System.out.println("--Digite 2 para X-Salada--");
        System.out.println("--Digite 3 para X-Bacon--");
        System.out.println("--Digite 4 para Bauru--");
        System.out.println("--Digite 5 para Refrigerante--");
        System.out.println("\n--Digite 6 para Suco de laranja--");
        cod = ler.nextInt();

        switch (cod) {
            case 1:
                System.out.println("Imforme a quantidade:");
                qtd = ler.nextInt();
                valor = (qtd * 10.00);
                System.out.printf("Cachorro-quente R$: " + valor);
                break;
            case 2:
                System.out.println("Imforme a quantidade:");
                qtd = ler.nextInt();
                valor = (qtd * 15.00);
                System.out.printf("X-Salada R$: " + valor);
                break;
            case 3:
                System.out.println("Imforme a quantidade:");
                qtd = ler.nextInt();
                valor = (qtd * 18.00);
                System.out.printf("X-Bacon R$: " + valor);
                break;
            case 4:
                System.out.println("Imforme a quantidade:");
                qtd = ler.nextInt();
                valor = (qtd * 12.00);
                System.out.printf("Bauru R$: " + valor);
                break;
            case 5:
                System.out.println("Imforme a quantidade:");
                qtd = ler.nextInt();
                valor = (qtd * 8.00);
                System.out.printf("Refrigerante R$: " + valor);
                break;
            case 6:
                System.out.println("Imforme a quantidade:");
                qtd = ler.nextInt();
                valor = (qtd * 13.00);
                System.out.printf("Suco de Laranja R$: " + valor);
                break;

            default:
            System.out.printf("Código inválido,escolha um número de 1 a 6.");


        }

    }
}
