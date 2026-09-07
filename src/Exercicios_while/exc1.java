package Exercicios_while;

import java.util.Scanner;

public class exc1 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int senha;

            System.out.println("Digite a senha:");
            senha = leia.nextInt();

            while(senha != 2002 && senha !=1){
                    System.out.println("Senha incorreta...");
                    System.out.println("Tente novamente ou digite 1 para encerrar");
                    senha = leia.nextInt();
            }
            if (senha == 2002){
                System.out.println("Acesso Permitido");
            }
            else if (senha == 1) {
                System.out.println("Encerrado");
            }


        leia.close();
    }






}
