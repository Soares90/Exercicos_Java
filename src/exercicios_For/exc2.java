package exercicios_For;

import java.util.Scanner;

public class exc2 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int dentro=0,fora=0,x,y;

        System.out.println("Digite a quantidade de números que serão inserido:");
        x = leia.nextInt();

        for (int i=0;i<x;i++){
            System.out.println("Digite um número:");
            y = leia.nextInt();
            if (y >=10 && y <= 20){
                dentro++;
            }
            else{
                fora++;
            }

        }

        System.out.println(dentro+" Dentro do intervalo");
        System.out.println(fora+" Fora do intervalo");


        leia.close();
    }



}
