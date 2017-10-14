import java.util.Scanner;

class Inputoutput {
  public static void main (String [] args) {
    String data;

    Scanner scan = new Scanner (System.in); //scan untuk memanggil kelas Scanner

    System.out.print("Masukkan data: ");
    data = scan.nextLine(); //proses menerima inputan scan
    System.out.println(data);
  }
}
