
public class Inventory {

	public static void main(String[] args) {
		
		Product prod = new Product(111, "laptop", 2, 8000f);
		System.out.println("Product Id: "+prod.getProdId());
		System.out.println("Product Name: "+prod.getProdName());
		
		System.out.println("type of prod= "+prod.getClass().getName());//clicking f3 in product.java file
		System.out.println(prod); //toString()
	}

}
//output
//Product Id: 111
//Product Name: laptop
//type of prod= Product
//Product [prodId=111, prodName=laptop, qty=2, unitPrice=8000.0]