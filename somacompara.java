import java.util.Scanner;

class Main{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int n1;
    int n2;
    int n3;

    int soma;

    System.out.println("Digite o primeiro número: ");
    n1 = input.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = input.nextInt();
    System.out.println("Digite o terceiro número: ");
    n3 = input.nextInt();

    if (n1 > n2 && n1 > n3){
      System.out.println(n1+ "É maior");
      }
      if (n2 > n3 && n2 > n1){
        System.out.println(n2+ "É maior");
       }
      if (n3 > n1 && n3 > n2){
        System.out.println(n3+ "É maior");
      }   
    soma= n1+n2+n3;
    System.out.println(soma);  
  }
  
}