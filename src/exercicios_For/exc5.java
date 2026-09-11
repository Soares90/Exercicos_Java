package exercicios_For;

import java.util.Scanner;

public class exc5 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int x,y=1,z=1;


        System.out.println("Digite o fatorial:");
        x = leia.nextInt();

        for (int i=1;i<x;i++){
            z *=x-i;
            y=x*z;
        }
        System.out.println(y);


        leia.close();
    }

}
