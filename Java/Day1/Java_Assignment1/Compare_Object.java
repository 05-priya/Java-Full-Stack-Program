import java.util.Scanner;
public class Compare_Object{
	public static void main(String [] args){
	Compare_Object obj1 = new Compare_Object();
	Compare_Object obj2 = new Compare_Object();
	if(obj1.equals(obj2)){
		System.out.print("The two objects are equal");
	}else{
	System.out.print("The two objects are not equal");
		}
	}
}