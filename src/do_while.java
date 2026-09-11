import java.util.Scanner;

public class do_while {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int senha;


        do {
            System.out.println("Digite a senha:");
            senha = leia.nextInt();
            if (senha!=123){
                System.out.println("Tente novamente...");
            }
        }while (senha!=123);


    }




}
