package programs;

public class ArrayProgram4 {

	public static void main(String[] args) {
		int [] arr= {1,2,94,54,98,98,6,86,4};
		int fmax=arr[0];
		int smax=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=fmax) //1>=1 //2>=1 //94>=2 //54>=94//98>=94//98>=9
			{
				if(arr[i]!=fmax) { //1!=1 //2!=1 // 94!=2 //98!=94 //98!=98
					smax=fmax;    //smax=1 // smax=2 // smax=94
				}
				fmax=arr[i]; //fmax=1 // fmax=2 // smax=94 // fmax= 98 // fmax= 98
				
			}
			else if(fmax==smax|| arr[i]>smax) { //2==94, 54>2 , //94==98 ,6>94
				smax=arr[i];  //smax=54
			}
		}
		
        System.out.println("first max value==>" + fmax);
        System.out.println("second max value==>"  + smax);
	}

}
