package hash_binary;

public class MyHashMap<K, V> {

    MyLinkedList<K> myLinkedList;

    public MyHashMap(){
        this.myLinkedList = new MyLinkedList<>();

    }

    public V get(K key) {
        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>)myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        if (myMapNode == null){
            myMapNode = new MyMapNode<>(key,value);
            this.myLinkedList.appends(myMapNode);
        }else {
            myMapNode.setValue(value);
        }
    }

    public String toString(){
        return "MyLinkedListNodes{" + myLinkedList + '}';
    }
}
