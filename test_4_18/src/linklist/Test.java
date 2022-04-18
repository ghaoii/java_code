package linklist;

public class Test {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addLast(10);
        linkList.addLast(20);
        linkList.addLast(30);
        linkList.addLast(20);
        System.out.println(linkList.removeByValAll(10));
        System.out.println(linkList);
    }

}
