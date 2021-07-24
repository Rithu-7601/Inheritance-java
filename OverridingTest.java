class A1{
	int a =10, b= 20;
	void display() {
		System.out.println("in class A1 - >"+a+ " | "+b);
	}
}
class B1 extends A1 {
	
	int a = 30, b= 21;
	@Override //annotation
	void display() {
		System.out.println("in class B1 -> "+super.a+" | "+super.b+" | "+this.a+" | "+this.b);
		super.display();//to call the display method of super class
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		
		B1 obj = new B1();
		System.out.println(obj.a+"  "+obj.b);
		obj.display();
	}

}


//output
//30  21
//in class B1 -> 10 | 20 | 30 | 21
//in class A1 - >10 | 20