import java.util.Random;


public class Stories{
	public static void main ( String[] args){

		Random random = new Random();

		String[] subjects = {"satomi", "vickii"};
		String[] places = {"ginza","yokohama"};
		String[] done = {"eat","play"};
	


String story = " ";
 int num = random.nextInt(2);
story = story + subjects[ num ];

num = random.nextInt(2);
story = story + places[ num ];

num = random.nextInt(2);
story = story + done[ num];

System.out.println( story);
}}
