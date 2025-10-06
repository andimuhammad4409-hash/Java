public class soal3{
  public static void main(String[] args){
    int sumbangan_awal = 10000;
   
    for (int i = 1 ;i <= 10;i++) {
      System.out.println("peserta ke-"+i+" menyumbang "+sumbangan_awal);

      sumbangan_awal *= 2;
    }
  }
}
  
