import java.util.*;

class Node {
    int value;
    Node link;

    Node(int value) {
        this.value = value;
        this.link = null;
    }
}

public class SingleLinkedList{

    static Node Start = null;

    public static void insertNode(Scanner sc) {
        System.out.print("Enter any number: ");
        int val = sc.nextInt();
        Node temp = new Node(val);

        if (Start == null) {
            Start = temp;
        } else {
            Node temp2 = Start;
            while (temp2.link != null) {
                temp2 = temp2.link;
            }
            temp2.link = temp;
        }
    }

    public static void deleteNode() {
        if (Start == null) {
            System.out.println("List is empty");
        } else {
            Start = Start.link;
        }
    }

    public static void printList() {
        if (Start == null) {
            System.out.println("List is empty");
        } else {
            Node t1 = Start;
            while (t1 != null) {
                System.out.print(t1.value + " ");
                t1 = t1.link;
            }
            System.out.println();
        }
    }

    public static int checkMenus(Scanner sc) {
        System.out.println("\n1.ADD\n2.Delete\n3.Print\n4.Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            switch (checkMenus(sc)) {
                case 1:
                    insertNode(sc);
                    break;
                case 2:
                    deleteNode();
                    break;
                case 3:
                    printList();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid choice...");
            }
        }
    }
}
