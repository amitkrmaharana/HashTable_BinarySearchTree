package hash_binary;

public class BinarySearchTree<K extends Comparable<K>> {

    public BinaryTreeNode<K> root;

    public void add(K key){
        this.root = this.addRecursively(root, key);
    }

    public BinaryTreeNode<K> addRecursively(BinaryTreeNode<K> current, K key){
        if (current == null){
            return new BinaryTreeNode<>(key);
        }
        int result = key.compareTo(current.key);
        if (result == 0){
            return current;
        }
        if (result == -1){
            current.left = addRecursively(current.left, key);
        }else if (result == 1){
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSizeRecursively(BinaryTreeNode<K> current){
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left)+
                this.getSizeRecursively(current.right);
    }

    public int getSize(){
        return this.getSizeRecursively(root);
    }
}
