/*Hello World dfjajdjlaj*/
import java.util.Scanner;

public class Biodata {

    public static void main(String[] args) {
        //deklarasi veriable
        String Nama;
        String Nim;
        String Kelas;
        String Alamat;
	String Gender;
	String NoTelepon;
        //memberikan nilai pada variable secara dinamis
        //memanggil class scanner
        Scanner input_bio=new Scanner (System.in);
        //nama
        System.out.print("Nama:");
        Nama="Riyan";
        //nim
        System.out.print("Nim:");
        Nim="1917";
        //Kelas
        System.out.print("Kelas:");
        Kelas="12";
        //Alamat
        System.out.print("Alamat:");
        Alamat="Jakarta";
	//Gender
        System.out.print("Gender:");
        Gender="Laki";
	//NoTelepon
        System.out.print("NoTelepon:");
        NoTelepon="0217232";
        //cetak nama, nim, kelas, dan alamat
        System.out.println("Nama"+Nama);
        System.out.println("Nim"+Nim);
        System.out.println("Kelas"+Kelas);
        System.out.println("Alamat"+Alamat);
	System.out.println("Gender"+Gender);
	System.out.println("NoTelepon"+NoTelepon);
    }
    
}
