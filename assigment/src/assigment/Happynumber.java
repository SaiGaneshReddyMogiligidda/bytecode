package assigment;
import java.util.Scanner;


public class Happynumber {
public static int getSquareSum(int num) {
		        int sum = 0;
		        while (num > 0) {
		            int digit = num % 10;         
		            sum += digit * digit;         
		            num /= 10;                    
		        }
		        return sum;
		    }

		  //happy number
		    public static boolean isHappy(int num) {
		        int slow = num;
		        int fast = getSquareSum(num);
		        while (fast != 1 && slow != fast) {
		            slow = getSquareSum(slow);
		            fast = getSquareSum(getSquareSum(fast));
		        }

		        return fast == 1;
		    }

		  
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number to check if it is a Happy Number: ");
		        int number = sc.nextInt();

		        if (isHappy(number)) {
		            System.out.println(number + " is a Happy Number!");
		        } else {
		            System.out.println(number + " is NOT a Happy Number.");
		        }

		        sc.close();
		    }
		

	}


