
import java.util.Scanner;
public class fibo{
public static void main(String args[]){
int n;
int n1=0;
int n2=1;
int n3=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

System.out.println("Fibonacci series : ");
if(n==1){
    System.out.print(n1+" ");
}
else if(n==2){
    System.out.print(n1+" "+n2);
}
else if(n>2){
    System.out.print(n1+" "+n2+" ");
    for(int i=2;i<n;i++){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(n3+" ");
    }
}


}
}
