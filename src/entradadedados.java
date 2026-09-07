
import java.util.Scanner;
import java.util.Locale;


public class entradadedados {
    
    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        String nomeCompleto,nome,comp1,comp2,comp3;
        int numeroInt,idade;
        double numeroDouble,numeroDouble2,peso;
        char inicial;




        System.out.println("Digite seu nome completo:");
        nomeCompleto = leia.nextLine();
        System.out.println("Pronto:"+nomeCompleto);
        System.out.println("Agora digite um número inteiro:");
        numeroInt = leia.nextInt();

        System.out.printf("E aqui está também: %d%n", numeroInt);
        System.out.println("Escreva um número com vírgula:");
        numeroDouble = leia.nextDouble();
        System.out.printf("E olha só aqui ->%.2f%n",numeroDouble);
        Locale.setDefault(Locale.US);
        System.out.println("Escreva um número com vírgula,de novo..:");
        numeroDouble2 = leia.nextDouble();
        System.out.printf("Olha aí:%.2f%n",numeroDouble2);
        System.out.println("Percebeu a diferença?");
        System.out.printf("Digite qualquer coisa:");
        inicial = leia.next().charAt(0);
        System.out.printf("Inicial:%c%n",inicial);
        System.out.println("Agora fale seu nome, idade e peso:");
        nome = leia.next();
        idade = leia.nextInt();
        peso = leia.nextDouble();
        leia.nextLine();//Para consumir o Enter sobrando
        System.out.println("Segue suas informações:");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println("Agora digite os comprimentos:");
        comp1 = leia.nextLine();
        comp2 = leia.nextLine();
        comp3 = leia.nextLine();
        System.out.println("Resposta:");
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp3);

        leia.close();

    }


}
