package exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class exc3 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int num1,num2;


        System.out.println("Digite 2(dois) números:");
        num1 = leia.nextInt();
        num2 = leia.nextInt();

        if (num1 % num2 == 0 || num2 % num1 ==0){
            System.out.println("São multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }

        leia.close();
    }



}
