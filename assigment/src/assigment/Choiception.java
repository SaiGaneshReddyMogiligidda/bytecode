package assigment;
import java.util.*;

public class Choiception {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice =0;
		do
		{
			System.out.println("1.chocolate");
			System.out.println("2.Biscuit");
			System.out.println("3.cooldrink");
			System.out.println("4.exit");
			System.out.println("Enter a choice");
			choice=s.nextInt();
			switch (choice)
			{
				case 1:System.out.println("chovloate");
				case 2:System.out.println("Biscuit");
				case 3:System.out.println("cooldrink");
				case 4:System.out.println("Exit");
				
				
					}
		}while (choice!=4);
		// TODO Auto-generated method stub

	}

}
