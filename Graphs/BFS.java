{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            
            for(int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            boolean vis[] = new boolean[nov];
            for(int i = 0; i < nov; i++)
                vis[i] = false;
            new Traversal().bfs(0, list, vis, nov);
            System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
*ArrayList<ArrayList<Integer>> list: represent graph containing vertices
                                    and edges between them
*vis[]: boolean array to represent visited vertex
*s: starting vertex 
*/
class Traversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
       // add your code here
       if(nov<=0)
       return;
       
       Queue<Integer> bfsq = new LinkedList<>();
       bfsq.add(s);
       while(bfsq.size()!=0)
       {    
           int t = bfsq.poll();
           if(vis[t] == true)
           continue;
           vis[t] = true;
           System.out.print(t+" ");
           for(int i:list.get(t))
           {
               if(!vis[i])
               bfsq.add(i);
           }
       }
       
    }
}
