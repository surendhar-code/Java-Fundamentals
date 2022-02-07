import java.util.*;

public class palindrome_num {
    
    public static void main(String[] args)
    {
        int num,i,j,count=0;
        String s1;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        s1 = Integer.toString(num);
        i=0;
        j=s1.length() - 1;

        while(i<=j)
        {
            if(s1.charAt(i) == s1.charAt(j))
                if(i==j)
                    count+=1;
                else
                    count+=2;
                i++;
                j--;
                
        }

        System.out.println("Count : "+count);

        if(count == s1.length())
            System.out.println("The number is a Palindrom");
        else
            System.out.println("The number is not a Palindrome");
        


    }
}
