package be.intecbrussel.collection.list;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.add(10);
        mll.add(85);
        mll.add(5);

        for (Integer integer : mll) {
            System.out.println(integer);
        }
    }
}
