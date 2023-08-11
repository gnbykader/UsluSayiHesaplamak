import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n,k,total = 1;
		Scanner inp = new Scanner(System.in);
		System.out.print("Ussu girilecek sayi: ");
		n = inp.nextInt();
		System.out.print("Us olacak sayi: ");
		k = inp.nextInt();
		
		for (int i = 1; i <= k; i++) {
			total*= n;
		}
		System.out.println("Uslu sayinin cevabi: "+total);

	}

}
