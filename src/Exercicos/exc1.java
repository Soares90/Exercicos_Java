package Exercícos;
import java.util.Scanner;
public class exc1 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);
        int num1,num2,soma;

        System.out.println("Digite um número:");
        num1 = leia.nextInt();
        System.out.println("Digite outro:");
        num2 = leia.nextInt();
        soma = num1 + num2;

        System.out.printf("Soma dos números: %d",soma);

        leia.close();
    }




}
