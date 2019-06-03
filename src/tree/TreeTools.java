package tree;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.plaf.PanelUI;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class TreeTools {
    public static <T> int getTreeNum(TreeNode<T> root){
        if(root == null)
            return 0;
        return getTreeNum(root.leftChild)+getTreeNum(root.rightChild)+1;
    }
    public static <T> int getTreeDepth(TreeNode<T> root){
        if(root == null)
            return 0;
        int leftDepth=getTreeDepth(root.leftChild)+1;
        int rightDepth=getTreeDepth(root.rightChild)+1;
        return Math.max(leftDepth,rightDepth);
    }
    public static <T> void preOrderTravel(TreeNode<T> root){
        if(root==null)
            return;

        visitNode(root);
        preOrderTravel(root.leftChild);
        preOrderTravel(root.rightChild);
    }
    public static void preOrder(TreeNode biTree)
    {//非递归实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(biTree != null || !stack.isEmpty())
        {
            while(biTree != null)
            {
                System.out.print(biTree.value+" ");
                stack.push(biTree);
                biTree = biTree.leftChild;
            }
            if(!stack.isEmpty())
            {
                biTree = stack.pop();
                //System.out.print(biTree.value+" ");
                biTree = biTree.rightChild;
            }
        }
    }

    public static <T> void preOrder1(TreeNode<T> root){
        Stack<TreeNode<T>> stack=new Stack<>();
        TreeNode temp=new TreeNode();
        stack.push(root);

    }
    public static <T> void midOrderTravel(TreeNode<T> root){
        if(root==null)
            return;
        midOrderTravel(root.leftChild);

        visitNode(root);
        midOrderTravel(root.rightChild);
    }
    public static void midOrder(TreeNode biTree)
    {//非递归实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(biTree != null || !stack.isEmpty())
        {
            while(biTree != null)
            {
                //System.out.print(biTree.value+" ");
                stack.push(biTree);
                biTree = biTree.leftChild;
            }
            if(!stack.isEmpty())
            {
                biTree = stack.pop();
                System.out.print(biTree.value+" ");
                biTree = biTree.rightChild;
            }
        }
    }
    public static <T> void backOrderTravel(TreeNode<T> root){
        if(root==null)
            return;
        backOrderTravel(root.leftChild);
        backOrderTravel(root.rightChild);
        visitNode(root);
    }
    public static void postOrder(TreeNode biTree)
    {//后序遍历非递归实现
        int left = 1;//在辅助栈里表示左节点
        int right = 2;//在辅助栈里表示右节点
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> stack2 = new Stack<Integer>();//辅助栈，用来判断子节点返回父节点时处于左节点还是右节点。

        while(biTree != null || !stack.empty())
        {
            while(biTree != null)
            {//将节点压入栈1，并在栈2将节点标记为左节点
                stack.push(biTree);
                stack2.push(left);
                biTree = biTree.leftChild;
            }

            while(!stack.empty() && stack2.peek() == right)
            {//如果是从右子节点返回父节点，则任务完成，将两个栈的栈顶弹出
                stack2.pop();
                System.out.print(stack.pop().value+" ");
            }

            if(!stack.empty() && stack2.peek() == left)
            {//如果是从左子节点返回父节点，则将标记改为右子节点
                stack2.pop();
                stack2.push(right);
                biTree = stack.peek().rightChild;
            }

        }
    }


    public static <T> void levelTravel(TreeNode<T> root) {
        Queue<TreeNode<T>> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode<T> temp=queue.poll();
            visitNode(temp);
            if(temp.leftChild!=null)
                queue.offer(temp.leftChild);
            if(temp.rightChild!=null)
                queue.offer(temp.rightChild);
        }

    }
    public static <T> void visitNode(TreeNode<T> node){
        System.out.print(node.value+" ");
    }
}
