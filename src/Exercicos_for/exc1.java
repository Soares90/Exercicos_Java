package Exercicos_for;

import java.util.Scanner;

public class exc1 {

    public static void main(String[]args){

        Scanner leia = new Scanner (System.in);




        System.out.println("Digite um número");
        int x = leia.nextInt();

        System.out.println("Esses números são os impares:");
        for (int i=0;i<x;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }







        leia.close();
    }




}
