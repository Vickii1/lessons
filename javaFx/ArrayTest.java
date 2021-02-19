import java.util.Scanner;
public class ArrayTest{
	public static void main(String[] args){
		Scanner sc = new Scanner( System.in);

		String[] name =new String [3];
		
		for(int i =0; i<3; i++ ) {
           System.out.println("input name");
           name[i] = sc.nextLine();
			}
		for (int i =0;i<3; i++){
			System.out.println(name[i]);
		}

		}
}

