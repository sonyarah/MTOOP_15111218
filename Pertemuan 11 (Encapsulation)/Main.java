public class Main{
	public static void main(String[] args){
		A a = new A();

		B b = new B();

		b.setAaInA ("Ini A");
		System.out.println (a.getAa());
		System.out.println (b.getAaInA());
	}
}