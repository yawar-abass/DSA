package LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinList<Integer> list = new LinList<Integer>();
        list.insertFirst(10);
        list.insertLast(12);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(122);
        list.display();
        list.reverse();
        list.display();
        //Circular liked list
//        CLL list = new CLL();
//        list.insert(12);
//        list.insert(13);
//        list.insert(14);
//        list.display();
//        list.insertIdx(123,2);
//        list.display();
//        list.delete(13);
//        list.display();
//        // Doubly Linked list
//        DLL list = new DLL();
//        list.insertFirst(12);
//        list.insertFirst(13);
//        list.insertFirst(14);
//
//        list.display();
//        list.insertIdx(122,2);
//        System.out.println(list.getSize());
//        list.insertLast(11);
//        list.display();
//        System.out.println(list.getSize());
//        list.insertIdx(200,2);
//        list.display();
//        list.reverse();
//        list.display();
        // single linked list
//       LinList<Integer> li = new LinList<Integer>();
//        Scanner input = new Scanner(System.in);
//        li.insertFirst(12);
//        li.insertLast(13);
//        li.insertLast(14);
//        li.display();
//        li.reverse();
//        li.display();
//        // Insertion
//        System.out.println("where you want to insert ");
//
//        boolean b = true;
//        while (b) {
//            System.out.println("Enter 'F' to insert an element at first in linked list");
//            System.out.println("Enter 'L' to insert an element at Last in linked list ");
//            System.out.println("Enter 'I' to insert an element at  a particular index in linked list ");
//            System.out.println("Enter 'E' to Exit ");
//            char ch = input.next().charAt(0);
//            switch (ch) {
//                case 'F':
//                    System.out.println("Enter number to insert at first");
//                    int val = input.nextInt();
//                    li.insertFirst(val);
//                    li.display();
//
//                    break;
//                case 'L':
//                    System.out.println("Enter number to insert at Last");
//                    int val2 = input.nextInt();
//                    li.insertLast(val2);
//                    li.display();
//                   break;
//                case 'I':
//                    System.out.println("Enter the value");
//                    int value = input.nextInt();
//                    System.out.println("Enter the index");
//                    int index = input.nextInt();
//                    while (index < 0) {
//                        System.out.println("Enter the correct index value . Index value can't be negative");
//                        index = input.nextInt();
//                    }
//                    li.insertIdx(value, index);
//                    li.display();
//                    break;
//                case 'E':
//                      li.display();
//                      b=false;
//                      break;
//                default:
//                    System.out.println("You entered wrong value. ");
//                    System.out.println("Enter the correct value");
//                    break;
//            }
//        }
    }
}
