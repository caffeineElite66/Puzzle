import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LinkListPuzzle {
    public static void main(String[] args) {

        // Find middle of LinkedList with one pass
        LinkList list = new LinkList();
        for (int i = 0; i <= 10; i++) {
            list.insert(i);
        }
        list.printList();
        System.out.println("Middle of list: " + findMiddle(list));


        // Does LinkedList has loop
        LinkList loopList = new LinkList();
        Link link = new Link(0);
        loopList.insert(link);
        loopList.insert(1);
        loopList.insert(2);
        loopList.insert(3);
        loopList.insert(link);

        System.out.println("list is loop: " + findLoop(list));
        System.out.println("loopList is loop: " + findLoop(loopList));

        // Find the 3rd last element in LinkedList

    }

    public static int findMiddle(LinkList list) {
        Link middle = list.getFirst();
        Link end = list.getFirst();

        while (end.nextLink != null) {
            middle = middle.nextLink;
            end = end.nextLink;
            end = end.nextLink;
        }

        return middle.data;
    }

    public static boolean findLoop(LinkList list) {
        Link current = list.getFirst();
        ArrayList<Link> keep = new ArrayList<Link>();

        while (current.nextLink != null) {
            if (keep.contains(current)) {
                return true;
            }
            keep.add(current);
            current = current.nextLink;
        }
        return false;
    }
}

class Link {
    public int data;
    public Link nextLink;

    public Link(int data) {
        this.data = data;
    }

    public void printLink() {
        System.out.print(this.data + " || ");
    }
}

class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void insert(int data) {
        Link link = new Link(data);
        link.nextLink = first;
        first = link;
    }

    public void insert(Link link) {
        link.nextLink = first;
        first = link;
    }

    public void printList() {
        Link currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }
}