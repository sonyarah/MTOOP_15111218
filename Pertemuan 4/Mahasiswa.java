//pertemuan 4 part 2
public class Mahasiswa {
	public static void main (String[]args){
	System.out.println ("Ini adalah method utama");

	Mahasiswa sonya = new Mahasiswa (); 
	sonya.printNama(); //sonya itu objek yang dapat digunakan untuk pemanggilan method lain.
	System.out.println (sonya.calculateumur());
}

public void printNama() { //membuat method lain-prosedur
	System.out.println ("Sonya");
}

public int calculateumur(){ //membuat fungsi lain harus ada type datanya terlebih dahulu, jadi bisa digunakan untuk menghitung.
	int tahun_lahir = 1995; //dan isinya pun harus ada fungsinya juga
	int tahun_sekarang = 2017;

	int umur;
	umur = tahun_sekarang - tahun_lahir;

	return umur; //mengembalikan hasil dari penghitungan/ prosesnya yang nanti akan dipanggil.
	//dipanggil siapa? dipanggil oleh objek yang manggil karena masih bagian dari class Mahasiswa.
}

}