
public class Rectangle {
	private int length;
	private int breath;
	private float area;
	Rectangle(){	
	}
	public Rectangle(int length, int breath) {
	
		this.length = length;
		this.breath = breath;
	}
	public int getLength() {
		return length;
	}
	public int getBreath() {
		return breath;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	public int getArea(){
		return(length*breath);
	}
	
}
