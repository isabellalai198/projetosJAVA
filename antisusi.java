import java.util.Scanner;

class Main{
  
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int n1;
    int n2=2;

    n2++;
    System.out.println("N2: "+ n2);
    n2--;
    n2--;
    System.out.println("N2: "+ n2);

    System.out.println("Digite o primeiro número: ");
    n1 = input.nextInt();

    n1++;
    System.out.println("N1 : "+ n1);
    n1--;
    n1--;
    System.out.println("N1 : "+ n1);
  
  }
}  