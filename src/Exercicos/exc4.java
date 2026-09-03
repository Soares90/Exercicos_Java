package Exercícos;
import java.util.Scanner;
import java.util.Locale;
public class exc4 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int numeroFuncionario;
        double horasTrabalhadas,valorPorHora,salarioDiario,salarioSemanal,salarioMensal;


        System.out.println("Digite qual é seu número colaborador:");
        numeroFuncionario = leia.nextInt();
        System.out.println("Quantas horas diárias você trabalha?");
        System.out.println("Digite aqui:");
        horasTrabalhadas = leia.nextDouble();
        System.out.println("Quanto que você ganha por hora trabalhada?");
        System.out.println("Digite aqui:");
        valorPorHora = leia.nextDouble();

        salarioDiario = valorPorHora * horasTrabalhadas;
        salarioSemanal = 5 * salarioDiario;
        salarioMensal = 20 * salarioDiario;

        System.out.printf("Colaborador: %d%n",numeroFuncionario);
        System.out.printf("Seu salário atual diário é de R$%.2f%n", salarioDiario);
        System.out.printf("Seu salário atual semanal é de R$%.2f%n", salarioSemanal);
        System.out.printf("Seu salário atual mensal é de R$%.2f", salarioMensal);

    }


}
