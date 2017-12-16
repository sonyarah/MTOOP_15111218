//before konstructor
public class Mahasiswa{
	String nama;

	public void printNama(){
	System.out.println (nama);
	}

	public static void main (String[]args){
		Mahasiswa mhs = new Mahasiswa(); 
		//mhs.nama = "Onyee"; //akan muncul null jika di hapus
		mhs.printNama();
	}
}