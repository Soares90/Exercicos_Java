package Exercícos;
import java.util.Scanner;
public class exc3 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int a,b,c,d,resultado;

        System.out.println("Digite quatro números diferentes:");
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();
        resultado = (a*b-c*d);
        System.out.printf("Resultado:%d",resultado);



    }



}
