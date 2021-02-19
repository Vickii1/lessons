import java.util.Scanner;

public class ScopeTest{
	static Scanner sc = new Scanner(System.in);


	public static void main( String [] args){
		System.out.print( "input something >");
		String name = sc.nextline();
		System.out.println( name );


		methodA();
	}

piblic static void methodA(){
	System.out.print( "input something >");
		String name = sc.nextline();
		System.out.println( name );
}
}