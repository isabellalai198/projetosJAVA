import java.util.Scanner;

class Main{

  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    double base;
    double altura;
    double area;

  System.out.println("Base do triângulo: ");
  base = input.nextInt();

  System.out.println("Altura do triângulo: ");
  altura = input.nextInt();

  System.out.println("Área do trângulo: ");
  area = input.nextInt();

  area = base * altura /2;
  System.out.println("A área do triângulo é igual a " + area);
    
  }
}