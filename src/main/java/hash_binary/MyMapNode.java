package hash_binary;

public class MyMapNode<K, V> implements INode<K> {

    K key;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K key , V value){
        this.key = key;
        this.value = value;
        next =null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<K,V>)next;
    }

    public String toString(){
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" + "Key is ='").append(key)
                .append("' and Value is='").append(value).append("'}");
        if (next != null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();

    }
}
