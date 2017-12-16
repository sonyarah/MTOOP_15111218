public class Hewan{
	String makan;

	Hewan(String makan){
	this.makan = makan;
	}
}

	class Ayam extends Hewan {

	public Ayam (String makan){
	super (makan);
	System.out.println(makan);
		}
	}
	public static void main (String[] args){
		Hewan hwn = new Hewan("makan");
}