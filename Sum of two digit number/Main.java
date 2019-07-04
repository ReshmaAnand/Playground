import java.util.*;
class Main {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n/10;
    int b=n%10;
    int sum=a+b;
    System.out.println(sum);
	}
}