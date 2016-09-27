/**
 * Created by MirsFang on 16/9/27.
 */
public class LinkedList extends ListAbs {

    private Node headNode;
    private Node lastNode;
    private int size=0;
//    private java.util.LinkedList

    public LinkedList(){
        headNode=new Node();
    }

    void add(Node node){
        if(node!=null){
            if(lastNode==null) {
                //如果是插入的第一个节点
                headNode.setNext(node);
                node.setPrevious(headNode);
            }else{
                //如果是插入的不是第一个节点
                lastNode.setNext(node);
                node.setPrevious(lastNode);
            }
            lastNode=node;
            size++;
        }else{
            throw new NullPointerException("插入节点为空!");
        }
    }

    void remove(Node node){
        /*移除这个节点就是把这个节点的上一个节点与这个节点的下个节点链接起来 */
        if(node!=null){
            Node next=node.getNext();
            Node pre=node.getPrevious();

            pre.setNext(next);
            next.setPrevious(pre);

            size--;
        }else{
            throw new NullPointerException("删除节点为空!");
        }

    }

    Node get(int position) {
        checkElement(position);
        int x=0;
        for(Node n=headNode.getNext();;n= n.getNext()){
            if(position==x){
                return  n;
            }else{
                x++;
            }
        }
    }


    protected void checkElement(int position){
        if(position>=size){
            throw new IndexOutOfBoundsException("超出link的大小");
        }
    }

    @Override
    public String toString() {
        StringBuffer linked=new StringBuffer();
        Node next=headNode.getNext();
        while(next!=null){
            linked.append(next.getDate()+"--->");
            next=next.getNext();
        }
        System.out.print(linked);
        return linked.toString();
    }
}
