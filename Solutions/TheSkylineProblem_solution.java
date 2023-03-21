import java.util.*;
class Solution 
{
    public void getSkyline(int[][] buildings) 
    {
        List<List<Integer>> res=new ArrayList<>();
        List<int[]> heights=new ArrayList<>();
        for(int[] b:buildings)
        {
            heights.add(new int[]{b[0],-b[2]}); //To mark starting point 
            heights.add(new int[]{b[1],b[2]}); //To mark the end point
        }
        Collections.sort(heights,(a,b)->{   //Use of comparator
            if(a[0]!=b[0])                 //when starting point of 1 is not coincides starting point of other
            {
                return a[0]-b[0];    
            }
            else
            {
                return a[1]-b[1];
            }
        });
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.offer(0);
        int prev=0;

        for(int[] h:heights)
        {
            if(h[1]<0)   //This means that this is start point of an array
            {
               pq.offer(-h[1]); //So we will add -ve value of it
            }
            else
            {
                pq.remove(h[1]); //This means we have reached at end of the bulding so will remove

            }
            int curr=pq.peek();  //Highest value of building currently
            if(prev!=curr)
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(h[0]);
                temp.add(curr);
                res.add(new ArrayList<>(temp));
                prev=curr;
            }
        }
        System.out.println("Output: ");
        System.out.println(res);
    }
}
public class Skyline 
{
    public static void main(String args[])
    {
    	Solution s=new Solution();
    	int[][] Building= {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
    	s.getSkyline(Building);
    	
    }
}
