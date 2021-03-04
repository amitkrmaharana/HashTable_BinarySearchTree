package hash_binary;

public class MyLinkedList<K> {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNode() {
        StringBuffer myNode = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNode.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNode.append("->");
            tempNode = tempNode.getNext();
        }
        myNode.append(tempNode.getKey());
        System.out.println(myNode);
    }

    public INode append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        return newNode;
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void popLastElement() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
    }

    public boolean search(INode key) {
        INode tempNode = this.head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey() == key.getKey()) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }


    public INode searchAndInsert(INode newNode, INode positionNode) {
        boolean check = search(positionNode);
        if (check) {
            insert(positionNode, newNode);
        } else {
            System.out.println("position not found");
        }
        INode newPosition = this.head.getNext();
        return newPosition;
    }

    public void deleteNode(INode myNode) {
        boolean check = search(myNode);
        if (check) {
            INode tempNode = this.head;
            INode previousNode = null;
            while (tempNode != null && tempNode.getKey() != myNode.getKey()) {
                previousNode = tempNode;
                tempNode = tempNode.getNext();
            }
            previousNode.setNext(tempNode.getNext());
        }

    }

    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void printMyNodes(){
        System.out.println("My Nodes " + head);
    }

    public String toString(){
        return "MyLinkedListNodes{" + head + '}';
    }


    public void appends(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
}
