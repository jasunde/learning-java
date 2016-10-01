
public class Basic {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Basic obj = new Basic("foo");
		
	}

	public Basic(String name) {
		System.out.println("This basic object is called " + name + ".");
	}
}
