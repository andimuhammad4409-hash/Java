public class soal6{
  public static void main(String[] args){
    int hari_pertama = 1000;
    int hari_mulai = 1;

    do {

      System.out.println("hari-"+ hari_mulai+" sebanyak : "+ hari_pertama);
      hari_pertama += 1000;
      hari_mulai++;
    }while(hari_mulai <= 100);
  }
}
