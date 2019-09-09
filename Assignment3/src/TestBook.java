
public class TestBook {

	public static void main(String[] args) {
		System.out.println("Book Title"+"\t\t"+"Price");
		
		Book b1=new Book("Java Programming",350.50);
		System.out.println(b1.getBname()+"\t"+b1.getBprice());
		Book b2=new Book("Let Us C",200.00);
		System.out.println(b1.getBname()+"\t"+b1.getBprice());
		
	}
	
}
