import java.util.Scanner;
public class estruturacondicional2 {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        double preco = 90;
        double desconto = (preco < 20.0) ? preco * 0.3 : preco * 0.5;

        System.out.println(desconto);
    }


}
