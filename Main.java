//Rishita Chourey FY Comp
/*
Soltion to issue number #176
solved by checking each character of the entered string according to the categories 
*/
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int alp=0,digit=0,spl=0;
        System.out.print("Input the string :");
        String str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)>=65&&str.charAt(i)<=90)
            {
                alp++;
            }
            else if(str.charAt(i)>=97&&str.charAt(i)<=122)
            {
                alp++;
            }
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                digit++;
            }
            else
            {
                spl++;
            }
        }
        System.out.println("Number of Alphabets in the string is :"+alp+"\nNumber of Digits in the string is :"+digit+"\nNumber of Special characters in the string is :"+spl);
    }
}