import java.util.Scanner;
public class ASCIIValue{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a letter: ");
	char letter = sc.next().charAt(0);
	System.out.print((int)letter);
	}

}