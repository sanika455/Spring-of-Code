import java.util.*;
import java.lang.*;
import java.io.*;

class ThreeSumClosest {
  public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            // fixing the elements
            int first=nums[i];
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                if(first+nums[start]+nums[end]==target){
                    return target;
                }
                else if(Math.abs(first+nums[start]+nums[end]-target)<diff){
                    diff=Math.abs(first+nums[start]+nums[end]-target);
                    ans=first+nums[start]+nums[end];
                }
                if(first+nums[start]+nums[end]>target){
                    end--;
                }
                else{start++;}
            }

        }
        return ans;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Length of the array:");
      int n=sc.nextInt();
      int nums[]=new int[n];
      // input from user
      for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
      }
      // target
      System.out.println("Enter the target sum: ");
      int target=sc.nextInt();
      System.out.println("Answer : "+threeSumClosest(nums,target));
    }
}
