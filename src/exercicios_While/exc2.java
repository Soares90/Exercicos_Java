package exercicios_While;

import java.util.Scanner;

public class exc2 {

    public static void main(){

        Scanner leia = new Scanner (System.in);

        int x,y;

        System.out.println("Digite o valor x e y:");
        x = leia.nextInt();
        y = leia.nextInt();

        while (x!=0 && y!=0){

            if (x > 0 && y >0){
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }

            System.out.println("Digite o valor x e y:");
            x = leia.nextInt();
            y = leia.nextInt();

        }
        if (x == 0 || y ==0){
            System.out.println("");
        }






        leia.close();

    }



}
