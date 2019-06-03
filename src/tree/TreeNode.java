package tree;
/*TreeNode: 普通的树节点*/
public class TreeNode<T>{
    T value;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

    TreeNode (T value){
        this.value=value;
    }
    TreeNode(){
    }

    /*增加左子结点*/
    public void addLeft(T value){
        TreeNode<T> leftChild=new TreeNode<>(value);
        this.leftChild=leftChild;
    }
    /*增加右子结点*/
    public void addRight(T value){
        TreeNode<T> rightChild=new TreeNode<>(value);
        this.rightChild=rightChild;
    }

}
