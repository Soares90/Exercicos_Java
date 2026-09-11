import java.util.Scanner;

public class metodos {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        int num1,num2,num3,menor;

        System.out.println("Digite 3 números:");
        num1 = leia.nextInt();
        num2 = leia.nextInt();
        num3 = leia.nextInt();

        menor = menornumero(num1,num2,num3);

        apareceresultado(menor);

        leia.close();
    }

    public static int menornumero(int num1,int num2,int num3){

        int resultado;

        if (num1 < num2 && num1 < num3){
            resultado = num1;
        }
        else if (num2 < num3){
            resultado = num2;
        }
        else{
            resultado = num3;
        }


        return resultado;

    }

    public static void apareceresultado(int menor){
        System.out.println("Menor número: "+menor);
    }
}
