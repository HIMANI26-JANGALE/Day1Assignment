
public class Book {
	private String bname;
	private double bprice;
	Book(){
	}
	public Book(String bname, double bprice) {
		super();
		this.bname = bname;
		this.bprice = bprice;
	}
	public String getBname() {
		return bname;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	
}
