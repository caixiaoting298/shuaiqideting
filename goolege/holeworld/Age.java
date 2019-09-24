import java.util.Scanner;
public class Age{
	public static void main(String[] args){
		System.out.print("input you age:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		age=age/15;
		switch(age){
			case 0:
			System.out.print("hello,xiaojiejie");
			break;
			default: 
			System.out.print("hello dajiejie");
			break;
		}
	}
}