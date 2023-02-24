import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    int C;
    int K;
    double F;
    double Re;
    double R;

    double valor;

    System.out.println("Digite um valor: ");
    C = input.nextInt();

    K = C + 273;
    F = C + 1.8 + 32;
    Re = C * 4/5;
    R = C + 1.800 + 491.67;
    
    System.out.println("O valor de Fahrenheit: "  + F);
    System.out.println("O valor Kelvin é: " + K);
    System.out.println("O valor de Réumur: " + Re);
    System.out.println("O valor Rankine é: " + R);

  }
}  
    

   
    