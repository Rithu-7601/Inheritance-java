class A2 {
	//constructor
	A2(int n){
		
		System.out.println("class A2 constructor");
	}
}
class B2 extends A2{
	//constructor
	B2(){
		super(5);
		System.out.println("class B2 constructor");
	}
}



public class SuperConstructors {

	public static void main(String[] args) {
		
		B2 obj = new B2();
	}

}
//output
//class A2 constructor
//class B2 constructor

