package java;

public class Mammal extends Animal {

	public Mammal() {
		System.out.println("created mammal object");
	}
	public void canMove() {
		System.out.println("canMove is called from mammal");
	}
	public void canSwim()
	{
		System.out.println("canSwim is called from mammal");
	}
}
