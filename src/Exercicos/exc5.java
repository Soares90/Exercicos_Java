package Exercícos;
import java.util.Scanner;
public class exc5 {
    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int codigoDaPeca1,codigoDaPeca2,qtnd1,qtnd2;
        double valorUnitario1,valorUnitario2,total;

        System.out.println("Digite o código,valor e a quantidade da peça 1:");
        codigoDaPeca1 = leia.nextInt();;
        valorUnitario1 = leia.nextDouble();
        qtnd1 = leia.nextInt();
        System.out.println("Agora, digite o código,valor e a quantidade da peça 2:");
        codigoDaPeca2 = leia.nextInt();;
        valorUnitario2 = leia.nextDouble();
        qtnd2 = leia.nextInt();

        total = (valorUnitario1*qtnd1)+(valorUnitario2*qtnd2);

        System.out.printf("O total da compra foi R$%.2f:",total);


    }




}

