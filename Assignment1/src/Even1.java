import java.util.*;
public class Even {
	private int n;
	public static void main(String[] args) {
	System.out.println("Enter the no upto you want even no list");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		if(i%2==0){
			System.out.println("Even no. list"+i);
		}
	}
	}

}
