package Exercicios_Estrutura_Condicional;
import java.util.Scanner;
import java.util.Locale
public class exc8 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        double salario,total;


        System.out.println("Digite seu salário:");
        salario = leia.nextDouble();

        if (salario >= 0 && salario <= 2.000){
            System.out.println("Isento");

        }
        else if (salario >= 2.000 && salario <= 3.000){
            total =  (salario - 2.000)*0.08;
        }
        else if (salario >= 3.001 && salario<= 4.500){

        }








        leia.close();
    }

}
