class Main {
    public static void main(String args[]) {

        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        llist1.addToTheLast(new Node(4));
        llist1.addToTheLast(new Node(8));
        llist1.addToTheLast(new Node(15));
        llist1.addToTheLast(new Node(19));

        llist2.addToTheLast(new Node(7));
        llist2.addToTheLast(new Node(9));
        llist2.addToTheLast(new Node(10));
        llist2.addToTheLast(new Node(16));


        llist1.head = new SortedList().sortedMerge(llist1.head, llist2.head);
        llist1.printList();

    }
}
