import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    double cotDolar, valDolar, valReal;

    System.out.print("Conversor de Dolar em Real. /n/n");
    System.out.print("Digite a cotação do dolar: ");
    cotDolar = entrada.nextDouble();
    System.out.print("Digite o valor em dolares: ");
    valDolar = entrada.nextDouble();
    valReal = cotDolar*valDolar;
    System.out.print("O valor em reais é: " +valReal+"/n");
    entrada.close();
  }
}