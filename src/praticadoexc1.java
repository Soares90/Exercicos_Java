import java.util.Locale;

public class praticadoexc1 {
    
    public static void main(String[]args){


        String produto1 = "Geladeira";
        String produto2 = "Celular";

        double preco1 = 6.230;
        double preco2 = 3.564;

        double preco3 = 1194.22;
        double preco4 = 683.18;

        int idade = 18;
        char genero = 'F';

        System.out.printf("%s com cinza seminova por apenas R$%.3f%n",produto1,preco1);
        System.out.printf("%s com cinza seminova por apenas R$%.3f%n%n",produto2,preco2);

        System.out.printf("Convertendo para dolar:%n%n");

        Locale.setDefault(Locale.US);
        System.out.printf("%s com cinza seminova por apenas $%.2f%n",produto1,preco3);
        System.out.printf("%s com cinza seminova por apenas $%.2f%n%n",produto2,preco4);

        System.out.printf("Obs: Somente acima de %d anos do genêro %c ganha desconto %n",idade,genero);

        System.out.printf("%s, é necessario %.2f para ser feito ",produto1,preco1);


    }

}
