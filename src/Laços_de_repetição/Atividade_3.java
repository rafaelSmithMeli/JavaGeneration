package Laços_de_repetição;

import java.util.*;

public class Atividade_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = 0,  me = 0,idd = 0;

        while (num >= 0) {
            System.out.println("Digite uma idade:");
            num = ler.nextInt();

            if (num > 50)
            {
                idd++;
                System.out.println(idd);
            }

            else if (num < 21 && num >= 0 )
            {
                me++;


            }

        }
        System.out.println("Idades maiores de 50: " + idd + "\nIdades menores que 21: " + me);


    }
}