import java.lang.reflect.Array;
import java.util.Arrays;

public class Song {
	private String timeSignature;
	String songName;
	String key;
	static short instanceCounter;
	short id;
	
	public Song(String name) {
		songName = name;
		instanceCounter++;
		id = instanceCounter;
		System.out.println("This song is called " + name + ".\n");
	}
	
	public void setTimeSignature(String time) {
		timeSignature = time;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getTimeSignature() {
		System.out.println("The time signature of " + songName + " is " + timeSignature + ".");
		return timeSignature;
	}
	
	public void printSong() {
		System.out.println("Name: " + songName);
		System.out.println("Time Signature: " + timeSignature);
		System.out.println("Key: " + key);
		System.out.println("ID: " + id);
		System.out.print("\n");
	}

	public static void arrayPowers(int[] arr) {
		for(int y : arr) {
			Integer a = y;
			System.out.println(a + " to the power of " + a + " is " + Math.pow(a, a) + ".");
		}
	}

	public static void main(String[] args) {
//		Song song1 = new Song("foo");
//		
//		song1.setTimeSignature("4/4");
//		song1.setKey("A major");
//		song1.printSong();
//
//		Song song2 = new Song("baz");
//		
//		song2.setTimeSignature("3/4");
//		song2.setKey("F# minor");
//		song2.printSong();
		
		int x = 0;
		
//		while(x < 10) {
//			System.out.println("value of x: " + x);
//			x++;
//		}
		
//		for(x = 0; x < 10; x++) {
//			if(x == 6) {
//				continue;
//			}
//			System.out.println("value of x: " + x);
//		}
		
//		do{
//			System.out.println("value of x: " + x);
//			x++;
//			if(x == 7) {
//				break;
//			}
//		}while (x < 10);
		
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		
		arrayPowers(arr);
		
		Arrays.sort(arr);
		
		arrayPowers(arr);
		
//		char[] word = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
//		String word1 = "hello world";
//		int l;
//		
//		for(x = 0, l = word.length; x < l; x++) {
//			System.out.print(Character.toChars(Character.codePointAt(word1, x)));
//		}
		
	}
}
