import java.util.Scanner;
public class ArraySum{
	public static void main(String[] args){
		int array[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integer values");
		
		for(int i=0;i<array.length;i++){
			array[i] = sc.nextInt();
		}

		int sum=0;
		for(int i=0;i<array.length;i++){
                    sum=sum+array[i];
			
		}
                    System.out.print("Sum of all array elements: "+sum);
		
	}
}