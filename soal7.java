import java.util.Scanner;
public class soal7{
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
      do {
         System.out.println("masukan angka : ");
         int angka = input.nextInt();

         if (angka <= 0) {
           System.out.println("bukan bilangan positif");
         } else {
           System.out.println("bilangan positif");
           break;
         }
        
      } while(true);
    }
}
