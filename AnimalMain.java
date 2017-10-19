package java;
public class AnimalMain {
	
	static void doSomething(Animal T) {
		System.out.print("Passed a: ");
		try {
			if(T instanceof Birds) {
				System.out.println("Birds");
			}
			else if(T instanceof Insectes) {
				System.out.println("Insectes");
			}
			else if(T instanceof Water) {
				System.out.println("Water");
			}
			else if(T instanceof Land) {
				System.out.println("Land");
			}
			else if(T instanceof ovrivious) {
				System.out.println("ovrivious");
			}
			else if(T instanceof Mammal) {
				System.out.println("mammal");
			}
		
			else{
				throw new Throwable();
			}
		}
		catch(Throwable t) {
			System.out.println("value not found");
		}
	}
	
	void func(Animal ... s) {
		for(Animal a : s) {
			doSomething(a);
		}
	}
	
	

		public static void main(String[] args) {
			
			Birds b=new Birds();
			func(b);
			
		}
	}
	

