package programs;

public class Pattern4 {

	public static void main(String[] args) {
		//int n=4;
		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				if(i>=j)
				{
		System.out.print("* ");
			}else {
			System.out.print(" ");
		}
	
			}
			System.out.println();
		}
	
	}

}
