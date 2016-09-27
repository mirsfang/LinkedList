/**
 * 节点
 * Created by MirsFang on 16/9/27.
 */
public class Node {
    private String date;
    private Node next;
    private Node previous;


    public Node() {
    }

    public Node(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        System.out.print(date);
        return date;
    }

    public boolean equals(Node obj) {
        if(date.equals(obj.getDate())){
            return true;
        }else {
            return false;
        }
    }
}
