package assigment;

public class Forloopoddnumber {

	public static void main(String[] args) {
		int count=0;
		
		for (int i=1;i<=10;i++) {
			if (i%2!=0) {
				System.out.println(i);
				count++;
				
			}
			if(count==3) {
				break;
				
			
			}else {
				continue;
			}
			
		}
		// TODO Auto-generated method stub

	}

}
