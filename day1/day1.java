package quiz;

import java.util.Scanner;

public class day1 {
	public static void main(String[] args) {
		//Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
		//Square all numbers k (0 <= k <= n) between 0 and n. 
		//Count the numbers of digits d used in the writing of all the k**2. 
		//Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count.
		
		int n = 0;
		int d = 0;
		String tmp = "";
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("n(n >= 0) : ");
			n = scan.nextInt();
			if(!(n >= 0)) {
				continue;
			}else {
				System.out.println("d(0 <= d <= 9) : ");
				d = scan.nextInt();
				if(!(d >= 0 && d <= 9)) {
					continue;
				}else {
					break;
				}
			}
		}
		
		for(int k=0; k<= n; k++) {
			tmp += Integer.toString(k*k);
		}
		
		for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == Character.forDigit(d, 10)) {
            	count++;
            }
        }
		
		System.out.println("count : " + count);
	}
}
