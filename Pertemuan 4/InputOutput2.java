//pertemuan ke4 
import java.util.Scanner;

public class InputOutput2 {
public static void main (String[] args) 
{

Scanner input = new Scanner (System.in); 
	String nama; //tipe data string dengan variabel nama
	char jeniskelamin;
	int tinggibadan;
	boolean menikah;

		System.out.print ("Masukan Nama: ");
		nama = input.nextLine(); 

		System.out.print ("Masukkan Jenis Kelamin : ");
		jeniskelamin = input.next().charAt(0); //hanya mengambil karakter pertama

		System.out.print ("Masukkan Tinggi Badan: ");
		tinggibadan = input.nextInt(); 

		System.out.print ("Masukkan Status Menikah: ");
		menikah = input.nextBoolean(); //hanya diisi true or false

		//memanggil kembali yang udah di input
		System.out.println (" ");
		System.out.println ("Nama 		: " +nama);
		System.out.println ("Jenis Kelamin 	: " +jeniskelamin);
		System.out.println ("Tinggi Badan 	: " +tinggibadan);
		System.out.println ("Status Menikah 	: " +menikah);

} 
} //nextInt buat tydat integer, nextBoolean buat tydat boolean, next().charAt(jangan lupa ngisi untuk karakter yang mau diambil)