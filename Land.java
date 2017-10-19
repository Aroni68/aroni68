package java;

public class Land extends Mammal{

	public Land() {
		System.out.println("created land object");
	}
	public void canMove() {
		System.out.println("canMove is called from land");
	}
	public void canSwim()
	{
		System.out.println("canSwim is called from land");
	}
}
