package Exercícos;
import java.util.Scanner;


public class exc2 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);
        double area,raio;

        System.out.println("Digite a raio do círculo:");
        raio = leia.nextDouble();

        area = 3.14159 * Math.pow(raio,2);

        System.out.printf("%.4f",area);




    }




}
