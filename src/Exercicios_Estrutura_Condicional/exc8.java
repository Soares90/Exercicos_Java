package Exercicios_Estrutura_Condicional;
import java.util.Scanner;
import java.util.Locale;
public class exc8 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        double salario,total,subtotal8porcento=80,subtotal18porcento=270;


        System.out.println("Digite seu salário:");
        salario = leia.nextDouble();

        if (salario >= 0 && salario <= 2000){
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000){
            total =  (salario - 2000)*0.08;
            System.out.printf("R$%.2f",total);
        }
        else if (salario >= 3000.01 && salario<= 4500){
            total = ((salario-3000)*0.18) + subtotal8porcento;
            System.out.printf("R$%.2f",total);
        }
        else if (salario >4500) {
            total = ((salario-4500)*0.28) +subtotal8porcento + subtotal18porcento;
            System.out.printf("R$%.2f",total);
        }
        leia.close();
    }

}
