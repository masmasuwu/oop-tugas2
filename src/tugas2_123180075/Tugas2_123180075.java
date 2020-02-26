package tugas2_123180075;
import Bangun.*;
import java.util.Scanner;

public class Tugas2_123180075 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int menu;
        int sisi, panjang, lebar, tinggi, jarijari;
        System.out.println("====MENU====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Kubus");
        System.out.println("5. Limas Persegi");
        System.out.println("6. Limas Persegi Panjang");
        System.out.println("7. Balok");
        System.out.println("8. Tabung");
        System.out.println("9. Kerucut");
        System.out.print("Pilih : ");
        menu = input.nextInt();
        switch(menu)
        {
            case 1:
                System.out.print("Masukkan sisi : ");
                sisi = input.nextInt();
                Persegi p = new Persegi(sisi);
                System.out.println("===Hasil===");
                System.out.println("Luas Persegi : "+p.hitungLuas());
                System.out.println("Keliling Persegi : "+p.hitungKeliling());
                break;
            case 2:
                System.out.print("Masukkan panjang : ");
                panjang = input.nextInt();
                System.out.print("Masukkan lebar : ");
                lebar = input.nextInt();
                PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                System.out.println("===Hasil===");
                System.out.println("Luas Persegi Panjang : "+pp.hitungLuas());
                System.out.println("Keliling Persegi  Panjang: "+pp.hitungKeliling());
                break;
            case 3:
                System.out.print("Masukkan jari-jari : ");
                jarijari = input.nextInt();
                Lingkaran c = new Lingkaran(jarijari);
                System.out.println("===Hasil===");
                System.out.println("Luas Lingkaran : "+c.hitungLuas());
                System.out.println("Keliling Lingkaran : "+c.hitungKeliling());
            case 4:
                System.out.print("Masukkan sisi : ");
                sisi = input.nextInt();
                Kubus k = new Kubus(sisi);
                System.out.println("===Hasil===");
                System.out.println("Luas Permukaan Kubus : "+k.hitungLuasPermukaan());
                System.out.println("Volume Kubus : "+k.hitungVolume());
                break;
            case 5:
                System.out.print("Masukkan alas : ");
                int si = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                int t = input.nextInt();
                LimasPersegi l = new LimasPersegi(si, t);
                System.out.println("===Hasil===");
                System.out.println("Luas Permukaan Limas : "+l.hitungLuasPermukaan());
                System.out.println("Volume Permukaan Limas : "+l.hitungVolume());
                break;
            case 6:
                System.out.print("Masukkan panjang : ");
                panjang = input.nextInt();
                System.out.print("Masukkan lebar : ");
                lebar = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                tinggi = input.nextInt();
                LimasPersegiPanjang lp = new LimasPersegiPanjang(panjang, lebar, tinggi);
                System.out.println("===Hasil===");
                System.out.println("Luas Permukaan Limas : "+lp.hitungLuasPermukaan());
                System.out.println("Volume Permukaan Limas : "+lp.hitungVolume());
                break;
            case 7:
                System.out.print("Masukkan panjang : ");
                panjang = input.nextInt();
                System.out.print("Masukkan lebar : ");
                lebar = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                tinggi = input.nextInt();
                Balok b = new Balok(panjang, lebar, tinggi);
                System.out.println("===Hasil===");
                System.out.println("Luas Permukaan Balok : "+b.hitungLuasPermukaan());
                System.out.println("Volume Permukaan Balok : "+b.hitungVolume());
                break;
            case 8:
                System.out.print("Masukkan jari-jari : ");
                jarijari = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                tinggi = input.nextInt();
                Tabung ta = new Tabung(jarijari, tinggi);
                System.out.println("===Hasil===");
                System.out.println("Luas Permukaan Tabung : "+ta.hitungLuasPermukaan());
                System.out.println("Volume Permukaan Tabung : "+ta.hitungVolume());
                break;
            case 9:
                System.out.print("Masukkan jari-jari : ");
                jarijari = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                tinggi = input.nextInt();
                Kerucut kr = new Kerucut(jarijari, tinggi);
                System.out.println("===Hasil===");
                System.out.println("Luas Permukaan Kerucut : "+kr.hitungLuasPermukaan());
                System.out.println("Volume Permukaan Kerucut : "+kr.hitungVolume());
                break;
                
        }
    }   
}