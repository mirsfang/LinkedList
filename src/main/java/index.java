/**
 * Created by MirsFang on 16/9/27.
 */
public class index {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Node("Node_1"));
        linkedList.add(new Node("Node_2"));
        linkedList.add(new Node("Node_3"));
        linkedList.add(new Node("Node_4"));
        linkedList.add(new Node("Node_5"));
        System.out.printf(linkedList.toString()+"\n\n");

        linkedList.remove(linkedList.get(2));
        System.out.printf(linkedList.toString());
    }

}
