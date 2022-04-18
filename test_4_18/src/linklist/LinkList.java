package linklist;


import java.util.Arrays;

class Node{
    int data;
    Node next;

    public Node(){
    }

    public Node(int data){
        this.data = data;
    }

}

public class LinkList {
    private Node head;
    private int size = 0;

    //构造方法
    public LinkList(){
        head = new Node(0);
    }

    public String toString(){
        Node cur = head.next;
        String ret = "";
        while(cur.next != null){
            ret += cur.data + ", ";
            cur = cur.next;
        }
        ret = ret + cur.data;
        return ret;

    }

    /**
     * 向当前链表中添加元素
     */

    //向表头添加元素
    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
        size++;
    }

    //向表尾添加元素
    public void addLast(int val){
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(val);
        size++;
    }

    //向链表的索引处添加元素，添加成功返回元素值，否则返回-1
    public int addIndex(int index, int val){
        if(index < 0 || index > size){
            System.out.println("index is illegal");
            return -1;
        }
        int num = 0;
        Node cur = head;
        while(cur.next != null){
            if(num == index){
                Node node = new Node(val);
                node.next = cur.next;
                cur.next = node;
                return val;
            }
            cur = cur.next;
            num++;
        }
        return -1;
    }

    /**
     * 查找链表中的元素
     */

    //在当前链表中通过索引找出元素值，否则返回-1
    public int getByIndex(int index){
        if(index < 0 || index >= size){
            System.out.println("index is illegal");
            return -1;
        }
        if(this.size == 0){
            System.out.println("LinkList is empty");
            return -1;
        }
        int num = 0;
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
            if(num == index){
                return cur.data;
            }
            num++;
        }
        return -1;
    }

    //查找在当前链表中是否包含元素val，如果存在则返回true，否则返回false
    public boolean contains(int val){
        return getByVal(val) != -1;
    }

    //在当前链表中返回第一个元素值为val的索引，否则返回-1
    public int getByVal(int val){
        Node cur = head;
        int num = 0;
        while(cur.next != null){
            cur = cur.next;
            if(cur.data == val){
                return num;
            }
            num++;
        }
        return -1;
    }

    /**
     * 修改当前链表的元素值
     */

    //修改当前链表中索引为index的元素值为val，返回修改前的元素值，否则返回-1
    public int setByIndex(int index, int val){
        if(index < 0 || index >= size){
            System.out.println("index is illegal");
            return -1;
        }
        Node cur = head;
        int num = 0;
        while(cur.next != null){
            cur = cur.next;
            if(num == index){
                int ret = cur.data;
                cur.data = val;
                return ret;
            }
            num++;
        }
        return -1;
    }

    //在当前链表将第一个出现的val值修改，返回是否修改成功
    public boolean setByVal(int val, int num){
        Node cur = head;
        int n = 0;
        while(cur.next != null){
            cur = cur.next;
            if(cur.data == val){
                cur.data = num;
                return true;
            }
        }
        return false;
    }

    /**
     * 删除链表中的元素
     */

    //删除当前链表中索引为index的元素，并返回元素值，否则返回-1
    public int removeByIndex(int index){
        if(index < 0 || index >=size){
            System.out.println("index is illegal");
            return -1;
        }
        Node cur = head;
        int num = 0;
        while(cur.next != null){
            if(num == index){
                Node tmp = cur.next;
                int ret = tmp.data;
                cur.next = tmp.next;
                size--;
                return ret;
            }
            cur = cur.next;
            num++;
        }
        return -1;
    }

    //删除头结点，返回是否删除成功
    public boolean removeFirst(){
        return removeByIndex(0) != -1;
    }

    //删除尾结点，返回是否删除成功
    public boolean removeLast(){
        return removeByIndex(size - 1) != -1;
    }

    //删除当前链表中第一个出现的元素值为val的结点，返回是否删除成功
    public boolean removeByValFirst(int val){
        Node cur = head;
        while(cur.next != null){
            Node tmp = cur;
            cur = cur.next;
            if(cur.data == val){
                tmp.next = cur.next;
                size--;
                return true;
            }
        }
        return false;
    }

    //删除当前链表中所有元素值为val的结点，返回是否删除成功
    public boolean removeByValAll(int val){
        Node cur = head;
        int count = 0;
        while(cur.next != null){
            Node tmp = cur;
            cur = cur.next;
            if(val == cur.data){
                tmp.next = cur.next;
                size--;
                count++;
            }
        }
        if(count == 0){
            System.out.println("val does not exist");
            return false;
        }
        return !contains(val);
    }

}
