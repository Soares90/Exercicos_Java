package exercicios_Estrutura_Condicional;
import java.util.Scanner;
public class exc5 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int codigo,quantidade;
        double total;

        System.out.println("-----------------------------");
        System.out.println("Código|Especificação|Preço");
        System.out.println("-----------------------------");
        System.out.println("1     Cachorro Quente R$ 4,00");
        System.out.println("2     X-Salada        R$ 4,50");
        System.out.println("3     X-Bacon         R$ 4,50");
        System.out.println("4     Torrada Simples R$ 2,00");
        System.out.println("4     Refrigerante    R$ 1,50");
        System.out.println("-----------------------------");
        System.out.println("Digite o produto que deseja através do código:");
        codigo = leia.nextInt();
        System.out.println("Agora digite a quantidade");
        quantidade = leia.nextInt();

        if (codigo == 1){
            total = 4.00 * quantidade;
            System.out.printf("O total:%.2f",total);

        }
        else if (codigo == 2){
            total = 4.50 * quantidade;
            System.out.printf("O total:%.2f",total);

        }
        else if (codigo == 3) {
            total = 4.50 * quantidade;
            System.out.printf("O total:%.2f",total);

        }
        else if (codigo == 4) {
            total = 2.00 * quantidade;
            System.out.printf("O total:%.2f",total);

        }
        else if (codigo == 5) {
            total = 1.50 * quantidade;
            System.out.printf("O total:%.2f",total);
        }
        else{
            total = 0.00;
            System.out.println("Erro, tente novamente");
        }


        leia.close();



    }

}
