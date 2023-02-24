import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    String a = "ohayo";
    String b;
    String aux;
      
    System.out.println("Digite uma palavra: ");
    b = input.nextLine();

    aux = b;
    b = a;
    a = aux;
    

    System.out.println("A = " + a);
    System.out.println("B = " + b);
  
  }
}