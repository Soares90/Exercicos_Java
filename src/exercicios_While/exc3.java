package exercicios_While;

import java.util.Scanner;

public class exc3 {

    public static void main(String[]args) {


        Scanner leia = new Scanner(System.in);

        int alcool=0, gasolina=0, diesel=0,escolha=0;


        while(escolha != 4) {
            System.out.println("Tabela");
            System.out.println("1.Álcool");
            System.out.println("2.Gasolina");
            System.out.println("3.Diesel");
            System.out.println("4.FIM");
            System.out.println("Qual sua preferência?");
            escolha = leia.nextInt();

            if (escolha == 1){
                alcool++;
                System.out.printf("%n%n%n%n%n");
            }
            else if(escolha == 2){
                gasolina++;
                System.out.printf("%n%n%n%n%n");
            }
            else if(escolha == 3){
                diesel++;
                System.out.printf("%n%n%n%n%n");
            }
            else if (escolha != 4) {
                System.out.printf("%n%n%n%n%n");
                System.out.println("Tente novamente...");
            }

        }

        if(escolha == 4){
            System.out.printf("%n%n%n%n%n");
            System.out.println("Muito Obrigado!");
            System.out.println("Alcool:"+alcool);
            System.out.println("Gasolina:"+gasolina);
            System.out.println("Diesel:"+diesel);
        }


    }

}
