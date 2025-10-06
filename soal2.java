public class soal2{
  public static void main(String[] args){
    int perkalian = 1;

    for (int i = 1;i <= 10;i++) {
      if (i % 2 == 1) {
        System.out.printf("%d x %d = %d",perkalian,i,perkalian*i);
      }
    }
  }
}
