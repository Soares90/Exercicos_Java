package Exercicos_for;

import java.util.Scanner;

public class exc3 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        double quantidadeCasos,media=0,x1,x2,x3;


        System.out.println("Digite quantos casos terão:");
        quantidadeCasos = leia.nextInt();

        for (int i =0;i<quantidadeCasos;i++){
            System.out.println("Digite o números da média: "+i);
            x1 = leia.nextDouble();
            x2 = leia.nextDouble();
            x3 = leia.nextDouble();

            media = ((x1*2)+(x2*3)+(x3*5))/10;

            System.out.printf("%.1f%n",media);
        }



        leia.close();

    }



}
