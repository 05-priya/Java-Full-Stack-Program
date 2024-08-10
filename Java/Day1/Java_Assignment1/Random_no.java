import java.util.Random;
public class Random_no{
	public static void main(String args[]){
	Random rand = new Random();
	int randomNumber = rand.nextInt(100);
	System.out.print("The random number is: "+randomNumber);
}
}