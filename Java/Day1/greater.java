import java.util.Scanner;
public class greater{
public static void main(String args[]){
int a;
int b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();

if(a>b){
System.out.print(a+" "+"is greater than"+" "+b);
}
else{
System.out.print(b+" "+"is greater than"+" "+a);
}
}
}