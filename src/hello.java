import java.util.Scanner;

public class hello {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao ho va ten");
    String hoVaTen = sc.nextLine();
    System.out.println("Nhap vao mssv");
    int mssv = sc.nextInt();
    
    System.out.println("hovaTen: " + hoVaTen);
    System.out.println("MSSV: " + mssv);
    }
}