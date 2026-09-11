package exercicios_For;

import java.util.Scanner;

public class exc7 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        double quadrado,cubo;


        System.out.println("Digite um número:");
        int x = leia.nextInt();

        for (int i=1;i<=x;i++){
            quadrado = Math.pow(i,2);
            cubo = Math.pow(i,3);
            System.out.printf("%d|%.0f|%.0f%n",i,quadrado,cubo);

        }





        leia.close();
    }



}
