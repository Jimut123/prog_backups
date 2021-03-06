package Binary_Tree;
import java.util.*;
class BinaryCountLeaf
{
    TreeNode root;
    int count;
    BinaryCountLeaf()
    {
        root=null;
    }
    void insert(int x)
    {
        root=insert(root,x);
    }
    TreeNode insert(TreeNode n,int x)
    {
        if(n==null)
        n=new TreeNode(x);
        else
        {
            if(x<n.getData())
            n.left=insert(n.left,x);
            else
            n.right=insert(n.right,x);
        }
        return n;
    }
    int count()
    {
        return countNode(root);
    }
    int countNode(TreeNode n)
    {
        if(n==null)
        return 0;
        else
        {
            if(n.left==null&&n.right==null)
            count ++;
            countNode(n.left);
            countNode(n.right);
        }
        return count;
    }   
}
