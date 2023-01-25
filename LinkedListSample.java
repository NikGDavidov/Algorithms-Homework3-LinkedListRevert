package LinkedListSample;

public class LinkedListSample {
    public static void main(String[] args) {
        List list = new List();
        list.addFirst(4);list.addFirst(2);list.addFirst(1);list.addFirst(5);list.addFirst(7);
        list.print();
        list.addLast(12);list.addLast(14);
        list.print();
        list.removeFirst();list.print();
        System.out.println(list.contains(12) + " " + list.contains(99));
        list.removeLast();list.print();
        list.revert();
        list.print();

    }

}
     class List{
        Node head;
        private class Node{
            Node next;
            int value;
        }
        void print(){
            System.out.println();
            Node node = head;
            while (node!=null){
                System.out.print(node.value + " ");
                node=node.next;
            }
        }
        void addFirst (int value){
            Node node = new Node();
            node.value = value;
            if (head!= null) {
                node.next=head;
            }
            head=node;
        }
        void removeFirst(){
            if (head!=null) head = head.next;
        }
        boolean contains(int value){
            Node node = head;
            while(node!=null){
                if (node.value==value) return true;
                node = node.next;
            }
            return false;
        }
        void addLast (int value){
            if (head ==null) {head=new Node(); head.value = value;}
            Node node = head;
            while (node.next!=null) {node = node.next;}
            node.next = new Node();
            node.next.value = value;
        }
        void removeLast (){
             if (head==null) return;
             if (head.next ==null){head =null; return;}
             Node node =head;
             while (node.next!=null){
                 if (node.next.next==null){node.next =null;
                     return;}
                 node = node.next;
             }
        }
        void revert(){
            Node current = head.next;
            head.next = null;
            while (current!=null) {
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
        void revers() {
            if ((head == null) || (head.next == null)) return;
            Node current = head.next;
            head.next = null;
            while (current != null) {
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
            void revers1(){
                Node current = head.next;
                head.next = null;
                while (current!=null){
                    Node next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }

            }
}



