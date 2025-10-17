import java.util.Scanner;

public class latihankompleks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int diskon = 0;
        int total = 0;
        int semua = 0;
        int totall = 0;
//        int poin = 0;
        
        System.out.print("Masukkan jumlah Barang : ");
        int jumlah = sc.nextInt();
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Barang ke-"+i+":");
            sc.nextLine();
            System.out.print("Nama Barang : ");
            String nama = sc.nextLine();
            System.out.print("Harga Satuan : ");
            int harga = sc.nextInt();
            System.out.print("Jumlah Pembelian : ");
            int beli = sc.nextInt();
            
            semua = harga * beli;
            total += harga * beli;
            
        }
        System.out.println("==========HASIL AKHIR============");
        if (total > 1000000){
            System.out.println("Total harga sebelum diskon : Rp."+total);
            System.out.println("Jumlah Diskon : 10% ");
            diskon = total * 10/100;
            totall = total - diskon;
            System.out.println("Total setelah diskon : Rp."+totall);
        }else if (total >= 500000 && total <=1000000){
             System.out.println("Total harga sebelum diskon : Rp."+total);
            System.out.println("Jumlah Diskon : 5% ");
            diskon = total * 5/100;
            totall = total - diskon;
            System.out.println("Total setelah diskon : Rp. "+totall);
        }else{
            System.out.println("Total Harga sebelum diskon : Rp."+total);
            System.out.println("Jumlah Diskon : 0% ");
            diskon = total * 0/100;
            totall = total - diskon;
            System.out.println("Total belanja setelah Diskon : Rp. "+totall);
        }
            
           int poin = totall / 100000;
            System.out.println("Jumlah poin yang didapat : "+poin);
             
        }
    }