
class T {
	void display() {
		System.out.println("insdie class A");
	}
}

class U extends T {
	@Override
	void display() {
		System.out.println("inside class B");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
	//A obj = new A();// super class object
		//B obj = new B();
	T obj =	new U();
	obj.display();
	}

}
//output
// inside class b
