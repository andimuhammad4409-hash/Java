import java.util.Scanner;
public class soal4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.print("masukan sandi : ");
      String sandi = input.nextLine();

      if (sandi.equals("rahasia123")) {
        System.out.println("sandi benar");
        break;
      } else {
        System.out.println("sandi salah, coba lagi ");
      }
    }
  }
}
