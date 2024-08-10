import java.util.Scanner;
public class Array{
	public static void main(String[] args){
		int array[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integer values");
		
		for(int i=0;i<array.length;i++){
			array[i] = sc.nextInt();
		}

		System.out.println("Array elements: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
	}
}