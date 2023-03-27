import java.util.Scanner;
 public class HappyNumber_Solution{
     
    // Returns sum of squares of digits of n
    public static int sumSD(int n)
    {
        int sum=0;
        while (n!=0)
        {
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
     
   public static boolean isHappy(int n)
    {
        // Keep replacing n with sum of squares of digits
        while (true)
        {
     
            // Number is Happy if we reach 1
            if (n==1)
            return true;
     
            // Replace n with sum of squares of digits
            n=sumSD(n);
     
            // Number is not Happy if we reach 4
            if (n==4)
            return false;
        }
     
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check if it is happy:");
        int no=sc.nextInt();
        if (isHappy(no))
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number" );
    }
}
//TC=O(log n)
