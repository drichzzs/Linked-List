
public class LinkedList {

    private Node head;
    private int count;

    public void add(Object data) {
        Node node = new Node();
        node.data = data;
        if(head != null)
            node.next = head;
        head = node;
        count++;
    }

    public void pop() {
        if(head != null){
            Node n = head;
            head = n.next;
            count--;
        }
    }

    public void reverse() {

        int outer = count, inner = 3;
        for(int i = 0; i < outer - 1; i++){
            Node n = head;
            Node node = new Node();
            for(int j = 0; j < outer - inner; j++){
                    n = n.next;
            }
            if(outer - inner  != - 1){
                node.data = n.next.data;
                n.next = n.next.next;
            }else {
                head = n.next;
                node.data = n.data;
            }
            while(n.next !=null)
                n = n.next;
            n.next = node;

            inner++;
        }

    }
    public void show() {
        Node n = head;
        while(n.next != null){
            System.out.print(n.data);
            n = n.next;
        }
        System.out.print(n.data);
    }



}
