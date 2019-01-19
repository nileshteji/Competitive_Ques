import java.util.*;
class StringPermute{
    public static void main(String[] args)
    {
        String ques = "abc";
        StringBuilder a = new StringBuilder("abc");
        printPermute(ques,"");
        System.out.println();
        printPermute(a,new StringBuilder());

    }
    public static void printPermute(String ques, String asf)
    {   if(ques.length() == 0)
        {
            System.out.print(asf +" ");
            return;
        }
        for(int i = 0;i < ques.length();i++)
        {   String left = ques.substring(0,i);
            String right = ques.substring(i+1);
            String roq = left+right;
            char ch = ques.charAt(i);
            printPermute(roq, asf+ch); 
    }
}
    public static void printPermute(StringBuilder ques, StringBuilder asf)
    {
        if(ques.length()==0)
        {
            System.out.print(asf +" ");
            return;
        }
        else
        {
            for(int i = 0; i<ques.length();i++)
            {
                char ch = ques.charAt(i);
                ques.deleteCharAt(i);
                printPermute(ques,asf.append(ch));
                asf.deleteCharAt(asf.length()-1);
                ques.insert(i,ch);      // We Need to undo the affect after each call to backtrack to another branch of possible tree.
            }
        }
    }
}