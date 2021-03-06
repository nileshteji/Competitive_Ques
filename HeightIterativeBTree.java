{
import java.util.Scanner;
import java.lang.Integer;
import java.util.*;
//import java.lang.Math;
import java.io.*;
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Tree_Height
{
	// driver function to test the above functions
    public static void main(String args[])
    {
		
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
		
            GfG g = new GfG();
			
			System.out.println(g.height(root));
         t--;
			
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    int height(Node node) 
    {
         // Your code here
         if(node == null)
         return 0;
         Queue<Node> q = new LinkedList<>();
         q.add(node);
         q.add(null);
         int height = 0;
         while(q.size()!=0)
         {
             Node t = q.remove();
             if(t == null && q.peek()==null)
             {
                 height++;
                 break;
             }
             if(t == null)
             {
                 q.add(null);
                 height++;
                 continue;
                 
             }
             if(t.left!=null)
             q.add(t.left);
             if(t.right!=null)
             q.add(t.right);
         }
         return height;
    }   
}
