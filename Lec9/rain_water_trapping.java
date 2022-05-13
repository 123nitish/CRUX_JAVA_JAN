package Lec9;
import java.util.*;
public class rain_water_trapping {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Scanner Sc=new Scanner(System.in);
       int tc=Sc.nextInt();   // since it is tc question
        while(tc-->0)
        {
             int n=Sc.nextInt();
       long []arr= new long[n];
       for(int i=0;i<n;i++) {
           arr[i]=Sc.nextInt();
       }
       System.out.println(rainwatertrapping(arr));  // print this
        }
    //    for(int i=1;i<n;i++) {
    //        System.out.print(rainwatertrapping(arr));//output
    //    }
       
    }
     public static long rainwatertrapping(long[] arr){  // return long value not long array
         int n = arr.length;
        long[]left=new long[n];
        long []right=new long [n];
        left[0]=arr[0];
        for(int i=1;i<n;i++) {  //from i=1 // you already store for left[0]
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--) {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        long ans=0;   // stores long value
        for(int i=0;i<right.length;i++) {
            long min=Math.min(left[i],right[i]);  // long values here
            ans=ans+(min -arr[i]);
        }
        return ans;
     }
}