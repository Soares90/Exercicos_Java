package Exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class exc1 {

        public static void main(String[] args){

            Scanner leia = new Scanner(System.in);

            System.out.println("Digite um número:");
            int numero = leia.nextInt();

            if (numero >= 0){
                System.out.println("Não é negativo");
            }
            else {
                System.out.println("Negativo");
            }


            leia.close();


        }

}
