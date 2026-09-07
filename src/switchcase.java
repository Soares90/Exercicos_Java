import java.util.Scanner;
public class switchcase {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int escolha;
        String dia;



        System.out.println("Digite o dia da semana");
        escolha = leia.nextInt();

        switch (escolha){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;

        }

        System.out.printf("Dia da Semana: %s",dia);




        leia.close();




    }



}
