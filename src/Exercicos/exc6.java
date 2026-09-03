package Exercicos;
import java.util.Scanner;
public class exc6 {

    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);

        double a,b,c,trianguloRetangulo,circulo,trapezio,quadrado,retangulo;

        System.out.println("Digite o valores de A,B e C:");
        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();

        trianguloRetangulo = (a*c)/2;
        circulo = 3.14159 * Math.pow(c,2);
        trapezio = ((a+b)*c)/2;
        quadrado = Math.pow(b,2);
        retangulo = a*b;

        System.out.printf("Área do Triângulo Retângulo:%.3f%n",trianguloRetangulo);
        System.out.printf("Área do Circulo:%.3f%n",circulo);
        System.out.printf("Área do Trapézio:%.3f%n",trapezio);
        System.out.printf("Área do Quadrado:%.3f%n",quadrado);
        System.out.printf("Área do Retângulo:%.3f",retangulo);


        leia.close();

    }


}
