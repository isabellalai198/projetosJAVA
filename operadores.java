import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n1;
    int n2;

    int menos;
    int soma;
    int divisao;
    int multiplicacao;
    int restodivisao;

    System.out.println("Digite o primeiro número: ");
    n1 = input.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = input.nextInt();

    menos= n1 - n2;
    System.out.println("Menos = " + menos);

    soma= n1 + n2;
    System.out.println("Soma = " + soma);

    divisao= n1 / n2;
    System.out.println("Divisão = " + divisao);

    multiplicacao= n1 * n2;
    System.out.println("Multiplicação = " + multiplicacao);

    restodivisao= n1 % n2;
    System.out.println("Resto da divisão = " + restodivisao);

    System.out.println("Potência = " + Math.pow(n1, n2));


  }
}