import java.util.*;
public class Complex{
	private float real,img;
	Complex(){
	}

	public Complex(float real, float img) {
		this.real = real;
		this.img = img;
	}

	public float getReal() {
		return real;
	}

	public float getImg() {
		return img;
	}

	public void setReal(float real) {
		this.real = real;
	}

	public void setImg(float img) {
		this.img = img;
	}
	public static Complex sum(Complex c1,Complex c2){
		Complex temp=new Complex();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static Complex sub(Complex c1,Complex c2){
		Complex temp=new Complex();
		temp.real=c1.real-c2.real;
		temp.img=c1.img-c2.img;
		return temp;
	}
/*	public static void  getdata(Complex c1,Complex c2){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part");
		float n1=sc.nextFloat();
		System.out.println("Enter the imaginary part");
		float n2=sc.nextFloat();
	}*/
	public static void display(Complex temp){
		System.out.println("Sum is:"+temp.real+"+"+temp.img+"i");

	}

	public static void main(String args[]) {
		Complex c1=new Complex(3,2);
		Complex c2=new Complex(3,2);
		Complex c= sum(c1,c2);
		c.display(c);
		Complex temp=sub(c1,c2);
		temp.display(temp);
	}
		
	
}
