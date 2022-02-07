import java.util.*;


public class find_all_palindrome_nums_in_a_given_range {
    public static void main(String[] args)
    {
        int min,max,i,x,y,count;
        Scanner in = new Scanner(System.in);
        min = in.nextInt();
        max = in.nextInt();
        String s;
        for(i=min;i<max;i++)
        {
            s = Integer.toString(i);
            x = 0;
            y = s.length()-1;
            count = 0; 
            while(x<=y)
            {
                if(s.charAt(x) == s.charAt(y))
                {
                    if(x==y)
                        count+=1;
                    else
                        count+=2;
                    x++;
                    y--;
                }
                    
                    
            }

            if(count == s.length())
                System.out.println(i);
        }
    
    }
}
