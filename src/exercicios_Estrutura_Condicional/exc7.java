package exercicios_Estrutura_Condicional;
import java.util.Locale;
import java.util.Scanner;
public class exc7 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        double x,y;

        System.out.println("Digite os valores de X e Y:");
        x = leia.nextDouble();
        y = leia.nextDouble();

        if (x > 0 && y >0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else{
            System.out.println("Tente novamente");
        }


        leia.close();

    }

}
