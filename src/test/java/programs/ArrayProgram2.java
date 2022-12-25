package programs;

public class ArrayProgram2 {
	
	public static void main(String[] args)
	{
		int[] arr= {8,3,4,32,2,4,5};
		 for (int i=0; i<arr.length; i++) {
		 for(int j=0; j<arr.length-1; j++) {
			 if(arr[i]<arr[j]) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
		 }
        //   int sum=1;
          // for(int i=0; i<3;i++) {
        	 //  sum=sum+arr[i];
         //  }
         //  System.out.println(sum);
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]+" ");
		System.out.println(arr[arr.length-1]);
		
	}
	}
}