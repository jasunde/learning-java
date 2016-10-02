
public class Song {
	String timeSignature;
	String songName;
	String key;
	
	public Song(String name) {
		songName = name;
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
	}

	public static void main(String[] args) {
		Song song1 = new Song("foo");
		
		song1.setTimeSignature("4/4");
		song1.setKey("A major\n");
		song1.printSong();

		Song song2 = new Song("baz");
		
		song2.setTimeSignature("3/4");
		song2.setKey("F# minor");
		song2.printSong();
	}
}
