package Exercicios_Estrutura_Condicional;

import java.util.Scanner;

public class exc2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = leia.nextInt();

        if (numero % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }


        leia.close();
    }


}
