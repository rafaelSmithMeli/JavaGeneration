package Laçoscondicionais;

import java.util.*;

public class atividadeum {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c, soma;

        System.out.println("Digite o número A:");
        a = ler.nextInt();
        System.out.println("Digite o número B:");
        b = ler.nextInt();
        System.out.println("Digite o número C:");
        c = ler.nextInt();
        soma = (a + b);


        if (soma > c) {
            System.out.printf("%d + %d = %d > %d    \n A soma de A+B é maior que C!! ", a, b, soma, c);
        } else if (soma < c) {
            System.out.printf("%d + %d = %d < %d    \n A soma de A+B é menor que C!! ", a, b, soma, c);
        } else {
            System.out.printf("%d + %d = %d = %d    \n A soma de A+B é igual a C!! ", a, b, soma, c);
        }
    }

}

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

package Laçoscondicionais;

import java.io.IOException;
import java.util.*;

public class Atividade6 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        String palavra1 = leitor.next();
        String palavra2 = leitor.next();
        String palavra3 = leitor.next();
        if (palavra1.equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }

}
