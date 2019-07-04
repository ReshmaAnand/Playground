import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=a/100;
    int c=a%10;
    int res=b+c;
    System.out.println(res);
	}
}