public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("========== TESTING =========");
        MyLinkedList linkList = new MyLinkedList(10);

        linkList.addFirst(11);
        linkList.addFirst(12);
        linkList.addFirst(13);

        linkList.add(4,9);
        linkList.add(4,9);
        linkList.printList();
    }
}
