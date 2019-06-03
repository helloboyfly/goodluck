package tree;

public class TreeTest {
    public static void main(String[] args){
        TreeNode<Integer> t=new TreeNode<>(1);
        TreeNode<Integer> n=new TreeNode<>();
        t.addLeft(2);
        t.addRight(3);
        t.leftChild.addLeft(4);
        t.leftChild.addRight(5);
        t.rightChild.addLeft(6);
        t.rightChild.addRight(7);
        TreeTools tools=new TreeTools();
        System.out.println(tools.getTreeNum(n));
        System.out.println(tools.getTreeDepth(n));
        System.out.println(n.value);
        System.out.print("preOrderTravel: ");
        tools.preOrderTravel(t);
        System.out.print("midOrderTravel: ");
        tools.midOrderTravel(t);
        System.out.print("backOrderTravel: ");
        tools.backOrderTravel(t);
        System.out.print("levelTravel: ");
        tools.levelTravel(t);
        System.out.println();
        System.out.print("preOrder:       ");
        tools.preOrder(t);
        System.out.print("midOrder:       ");
        tools.midOrder(t);
        System.out.print("postOrder:       ");
        tools.postOrder(t);
    }
}
