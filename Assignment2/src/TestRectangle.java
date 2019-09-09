import java.util.*;
public class TestRectangle {

	public static void main(String[] args){
		TestRectangle t=new TestRectangle();
		Rectangle arr[]=t.accept();
		//Rectangle r1=new Rectangle();
		t.display(arr);
	}
	public Rectangle[] accept(){
		Scanner sc=new Scanner(System.in);
		Rectangle arr[]=new Rectangle[5];
		for(int i=0;i<5;i++){
		System.out.println("Enter the length and breadth");
		int length=sc.nextInt();
		int breath=sc.nextInt();
		arr[i]=new Rectangle(length,breath);
		}
		return arr;
	}
	public void display(Rectangle arr[]){
		for(Rectangle r3:arr){
			System.out.println("area is"+r3.getArea()+"\t");
}
	}
}