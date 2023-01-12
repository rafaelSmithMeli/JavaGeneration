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


