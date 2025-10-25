import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int harga = 0;
        int kembali = 0;
        int jumlah = 0;
        
        System.out.println("======= MENU TOKO SERBA ADA =======");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu :");
        int pilih = sc.nextInt();
        
        if (pilih == 1){
            System.out.println("====== Menu Makanan ======");
            System.out.println("1. Nasi Goreng : Rp.15000");
            System.out.println("2. Mie Ayam    : Rp.12000");
            System.out.println("3. Sate Ayam   : Rp.18000");
            System.out.print("Pilih Makanan :");
            int makan = sc.nextInt();
                  System.out.print("Masukkan Jumlah : ");
                    jumlah = sc.nextInt();
            if (makan == 1){
                 harga = 15000;
                    
                    int total = harga * jumlah;
                    System.out.println("Total Harga :Rp."+total);
            
                    System.out.print("Masukkan uang :Rp.");
                    int uang = sc.nextInt();
                    if (uang >= total){
                        kembali = uang - total;
                        System.out.println("Kemballian :Rp."+kembali);
                    }else if (uang < total){
                        System.out.println("Uang Anda Tidak Cukup");
                    
                    
            }else if (makan == 2){
                harga = 12000;
//                 System.out.print("Masukkan Jumlah : ");
//                    jumlah += sc.nextInt();
                    
                     total = harga * jumlah;
                    System.out.println("Total Harga :Rp."+total);
                    
                    System.out.print("Masukkan uang :Rp.");
                     uang = sc.nextInt();
                    if (uang >= total){
                         kembali = uang - total;
                        System.out.println("Kemballian :Rp."+kembali);
                    
                    }else if (uang < total){
                        System.out.println("Uang Anda Tidak Cukup");
//                    }else{
//                        System.out.println("Tidak Valid");
                    }
            }else if (makan == 3){
                harga = 18000; 
//                System.out.print("Masukkan Jumlah : ");
//                    jumlah += sc.nextInt();
                    
                    total = harga * jumlah;
                    System.out.println("Total Harga :Rp."+total);
                    
                    System.out.print("Masukkan uang :Rp.");
                    uang = sc.nextInt();
                    if (uang >= total){
                         kembali = uang - total;
                        System.out.println("Kemballian :Rp."+kembali);
                    }else if (uang < total){
                        System.out.println("Uang Anda Tidak Cukup");
//                    }else{
//                        System.out.println("Tidak Valid");
//                    }
            }else if (pilih == 2){
                        System.out.println("===== MINUMAN ======");
                        System.out.println("1. ES TEH :Rp.5000");
                        System.out.println("2. KOPI SUSU :Rp.12000");
                        System.out.println("3. JUS JERUK :rP.10000");
                        System.out.println("Pilih minum : ");
                        int minum = sc.nextInt();
                        
                        if (minum == 1){
                            harga = 5000;
                            total = harga * jumlah;
                             System.out.println("Total harga :Rp."+total);
                             System.out.println("Masukkan uang :Rp.");
                             uang = sc.nextInt();
                               if (uang >= total){
                         kembali = uang - total;
                        System.out.println("Kemballian :Rp."+kembali);
                    }else if (uang < total){
                        System.out.println("Uang Anda Tidak Cukup");
                    }
                        }else if (minum == 2){
                             harga = 8000;
                            total = harga * jumlah;
                             System.out.println("Total harga :Rp."+total);
                             System.out.println("Masukkan uang :Rp.");
                             uang = sc.nextInt();
                               if (uang >= total){
                         kembali = uang - total;
                        System.out.println("Kemballian :Rp."+kembali);
                    }else if (uang < total){
                        System.out.println("Uang Anda Tidak Cukup");
                    }
                        }else if (minum == 3){
                              harga = 10000;
                            total = harga * jumlah;
                             System.out.println("Total harga :Rp."+total);
                             System.out.println("Masukkan uang :Rp.");
                             uang = sc.nextInt();
                               if (uang >= total){
                         kembali = uang - total;
                        System.out.println("Kemballian :Rp."+kembali);
                    }else if (uang < total){
                        System.out.println("Uang Anda Tidak Cukup");
                             
                        }
                        }else if (pilih == 3){
                            System.out.println("KELUAR");
                        }
            }else{
                System.out.println("Tidak Valid");
            }
                   
                    System.out.println("\nTERIMAKASIH TELAH BERBELANJA !!");
                }
            }
        }
    }

}