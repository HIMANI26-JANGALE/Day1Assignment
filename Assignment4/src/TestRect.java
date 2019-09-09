
import java.util.Scanner;
public class TestRect{

	public static void main(String[] args){
		TestRect t=new TestRect();
		Rect arr[]=t.accept();
		//Rectangle r1=new Rectangle();
		t.display(arr);
	}
	public Rect[] accept(){
		Scanner sc=new Scanner(System.in);
		Rect arr[]=new Rect[5];
		for(int i=0;i<5;i++){
		System.out.println("Enter the length and breadth");
		int length=sc.nextInt();
		int breath=sc.nextInt();
		arr[i]=new Rect(length,breath);
		}
		return arr;
	}
	public void display(Rect arr[]){
		for(Rect r3:arr){
			System.out.println("Area"+"\t"+"Perimeter");
			System.out.println(r3.getArea()+"\t"+r3.getPerimeter());
		}
	}
}