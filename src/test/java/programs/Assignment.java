package programs;
import java.util.Arrays;
public class Assignment
{   
    public static void main(String args[])
    {
         
        int[] arr = {2,4,1,1,5,4}; 
            System.out.println("-------Removing Duplicate elements------");    
            for(int i = 0; i < arr.length; i++) 
            {  
              int count=0;
                for(int j = i; j < arr.length; j++) 
                {  
                    if(arr[i] == arr[j])  
                       count++;
                } 
                if(count==1)
                  System.out.println(arr[i]);
            } 
            System.out.println("____________");
            
            System.out.println("-------Order of Accurance------");  
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++)
            {
                int count = 0;
                for (int j = 0; j < arr.length; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                    }
                }
                System.out.println(arr[i] + "->" + count);
            }           
            System.out.println("____________");
            
            System.out.println("-------Duplicate Elements with Count------"); 
        
          
          for (int i = 0; i < arr.length; i++) 
          {
            int count=0;
            for (int j = 0; j < arr.length-1; j++) 
            {
              if(arr[i]==arr[j])
              {
                count++;
              }
            }
            if(count>1 && arr[i]!=arr[i+1]) 
            {
              System.out.println(arr[i]+" -> "+count);
            }
          }
           System.out.println("____________");
             
             System.out.println("-------Unique Number with Count------"); 
              
             int count=0;
             for (int i = 0; i < arr.length; i++) 
             {  
                 int j;  
                 for ( j = 0; j < i; j++)       
                 if (arr[i] == arr[j])  
                     break;  
                 if (i == j)  
                 {
                   System.out.print( arr[i] + " ");  
                   count++;
                 }
             } 
             System.out.println();
             System.out.println("Total Number of Unique Numbers is : "+count);
         
             System.out.println("____________");
             
             System.out.println("-------Position of Cell Number------"); 
                 int n = 5; 
                 System.out.println(n+"   ====>   "+findPosition(arr, n)); 
    }
    public static int findPosition(int[] arr, int n) 
    { 
        if (arr == null) 
        { 
            return -1; 
        } 
        int length = arr.length; 
        int i = 0; 
        while (i < length) 
        { 
            if (arr[i] == n) 
            { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    }
}
