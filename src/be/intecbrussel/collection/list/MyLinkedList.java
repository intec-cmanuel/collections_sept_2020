package be.intecbrussel.collection.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList implements Iterable<Integer>{
    Node firstNode;

    public void add(Integer number) {
        if (firstNode == null){
            firstNode = new Node(null, number);
        } else {
            firstNode.addNode(number);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<Integer> {
        Node currentNode = null;

        @Override
        public boolean hasNext() {
            if (currentNode == null) {
                return firstNode != null;
            } else {
                return currentNode.nextNode != null;
            }
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                if (currentNode == null) {
                    currentNode = firstNode;
                } else {
                    currentNode = currentNode.nextNode;
                }
                return currentNode.value;
            } else {
                throw new NoSuchElementException();
            }
        }
    }


    public class Node {
        Node previousNode;
        Node nextNode;
        Integer value;

        public Node(Node previousNode, Integer value) {
            this.previousNode = previousNode;
            this.value = value;
        }

        public void addNode(Integer number){
            if (nextNode == null) {
                nextNode = new Node(this, number);
            } else {
                nextNode.addNode(number);
            }
        }
    }
}
