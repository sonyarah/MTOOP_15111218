public class Sonya extends Mahasiswa {
	protected String getNama(){
	return super.getNama();
	}

	public void printNama(){
		System.out.println (getNama());
	}

	public static void main (String[] args){
		Sonya sonya = new Sonya();
		sonya.printNama();
	}
}