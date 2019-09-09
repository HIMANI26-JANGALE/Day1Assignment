
public class Rect {
	private float lenght;
	private float width;
	private float area;
	private float perimeter;
	Rect(){
		this.lenght=1;
		this.width=1;
	}
	public Rect(int lenght, int width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}
	public float getLenght() {
		return lenght;
	}
	public float getWidth() {
		return width;
	}
	
	public void setLenght(float lenght) {
		if(lenght>0.0 && lenght<20.0)
			
		this.lenght = lenght;
	}
	public void setWidth(float width) {
		if(width>0.0 && width<20.0)
		this.width = width;
	}
	public float getArea() {
		return (lenght*width);
	}
	public float getPerimeter() {
		return (2*(lenght+width));
	}
	
	
	
}
