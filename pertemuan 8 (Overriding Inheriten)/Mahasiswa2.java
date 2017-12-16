//kontructor
public class Mahasiswa2{
	
	Mahasiswa2(){
		this.nama ="onya"; //this menyebutkan nama method/fungsi pada kelas tersebut
		this.printNama();
	}
	String nama;
	
	public void printNama(){
	System.out.println (nama);
	}

	public static void main (String[] args){
		Mahasiswa2 mhs = new Mahasiswa2();
	}
}
