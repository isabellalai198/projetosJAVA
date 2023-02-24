import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Agora vamos para o cadastro!  (•◡•) /");
    String linha = s.nextLine();
    System.out.print("Nome completo:");
    String linha1 = s.nextLine();
    System.out.print("Idade:");
    int i = s.nextInt();
    System.out.print("Conte um pouco sobre você:");
    String linha2 = s.nextLine();
    String linha3 = s.nextLine();
    System.out.print("Então seu nome completo é " + linha1 + "!!!");
    String linha4 = s.nextLine();
    System.out.print("Você tem " + i + " anos");
    String linha5 = s.nextLine();
    System.out.print("Gostei de você... Até a proxima ᕙ(^▿^-ᕙ)" + linha2 + "!!!");

  }
}