import java.util.Locale;

public class declarandovariavel {
    
    public static void main(String[]args){

        String nome = "Nicolas";
        int idade = 21;
        double altura = 1.81;
        double salario = 250.95034;
        double salarioAnual = 900.5641561026;

        System.out.print("Nicolas ");
        System.out.print("Soares ");
        System.out.println("Matos");
        System.out.println("Idade:"+idade);
        System.out.println("Altura:"+altura);
        System.out.printf("Atual salário diário:R$% .2f--%n",salario);
        /*Dependo do local as casas podem ser sepradas por , ou .
        o programa se baseia nas infromações do pc mas...*/
        Locale.setDefault(Locale.US);//com esse comando e ele muda a localização do app fazendo os proximos comandos serem baseados na localização dele
        System.out.printf("Atual salário diário:R$% .2f%n",salario);
        System.out.printf("Resultado Anual de Renda: R$%.4f reais%n",salarioAnual);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,salario);

    }

}
