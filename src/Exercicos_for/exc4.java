package Exercicos_for;

import java.util.Scanner;

public class exc4 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        double resultado,x1,x2;

        System.out.println("Digite quantos calculos serão feitos:");
        int qtndCal = leia.nextInt();

        for (int i=0;i<qtndCal;i++){
            System.out.println("Digite os números do cáculos:");
            x1 = leia.nextInt();
            x2 = leia.nextInt();

            resultado = x1 /x2;

            if (x2==0){
                System.out.println("Divisão Impossivel");
            }
            else{
                System.out.println(resultado);
            }

        }



        leia.close();
    }



}
