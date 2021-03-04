package hash_binary;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void given3numbersWhenLinkedListShouldBeAddedToTop() {
        MyNode<Integer> thirdNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(thirdNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersWhenLinkedListShouldBeAddedToLast() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersWhenLinkedListShouldBeInsertToBetween() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode,secondNode);
        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersWhenLinkedListShouldBeAbleToDeleteFirstElement() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        System.out.println("Before deleting first Value linked list is");
        myLinkedList.printMyNode();
        myLinkedList.pop();
        System.out.println("After deleting first Value");
        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(secondNode) &&
                myLinkedList.head.getNext().equals(thirdNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersWhenLinkedListShouldBeAbleToDeleteLastElement() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        System.out.println("Before deleting last Value linked list is");
        myLinkedList.printMyNode();
        myLinkedList.popLastElement();
        System.out.println("After deleting first Value linked list is");
        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                myLinkedList.tail.equals(secondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersWhenLinkedListShouldBeAbleToSerch() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printMyNode();
        Assert.assertEquals(true,myLinkedList.search(secondNode));

    }

    @Test
    public void given3numbersWhenLinkedListShouldBeAbleToSerchAndInsert() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyNode<Integer> newNode = new MyNode<>(63);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.printMyNode();

        INode newNodePosition = myLinkedList.searchAndInsert(newNode,secondNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(secondNode) &&
                newNodePosition.getNext().equals(newNode) &&
                myLinkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3numbersWhenLinkedListShouldBeAbleToSerchAndDelete() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        MyNode<Integer> fourthNode = new MyNode<>(63);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);
        myLinkedList.printMyNode();
        myLinkedList.deleteNode(secondNode);
        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(firstNode) &&
                myLinkedList.head.getNext().equals(thirdNode) &&
                myLinkedList.tail.equals(fourthNode);
        Assert.assertTrue(result);
    }
}