package Exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class exc4 {
    public static void main(String[]args) {
        Scanner leia = new Scanner(System.in);

        int comeco, termino, duracao;

        System.out.println("Digite que horas começou:");
        comeco = leia.nextInt();

        System.out.println("Digite que horas terminou:");
        termino = leia.nextInt();

        if (comeco < termino){
            duracao = termino - comeco;
        }
        else{
            duracao = 24 - comeco - termino;
        }

        System.out.printf("O jogo durou %d horas",duracao);

        leia.close();
    }

}
