package assigment;

public class Postdecre {

	public static void main(String[] args) {
		int a=6;
		int b=0;
		int c=0;
		int d=0;
		b=a++ + --a;
		System.out.println(a);
		System.out.println(b);
		c=++b + a++ - ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		d=c-- + ++c;
        System.out.println(d);
        System.out.println(c);

	}

}
