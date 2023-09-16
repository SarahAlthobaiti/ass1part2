//Student Name: Sarah Mohammed Althobiti  Student ID: 444004881
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        Scanner scnr = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("1.Add new node to DLL");
            System.out.println("2.Delete a node from DLL");
            System.out.println("3.Show how many nodes in DLL");
            System.out.println("4.Print all data in the Dll");
            System.out.println("5.Exit");
            int num = scnr.nextInt();
            int key;
            int number;
            if(num == 1){
                System.out.println("1. to add first ");
                System.out.println("2. to add last");
                 number = scnr.nextInt();
                if(number == 1){
                  System.out.println("enter the element to add");
                  key = scnr.nextInt();
                  myList.addFirst(key);
                } else{
                  System.out.println("enter the element to add");
                  key = scnr.nextInt();
                  myList.addLast(key);
                }

            }else if(num == 2){
                System.out.println("1. to remove first ");
                System.out.println("2. to remove last");
                 number  = scnr.nextInt();
                 if(number == 1){
                  myList.removeFirst();
                 }else{
                    myList.removeLast();
                 }
            }else if(num == 3){
                System.out.println("the size is: "+myList.size());
            }else if(num == 4){
                myList.print();
            }else{
                flag = false;
            }

        }
       // System.out.println("the first element is: "+myList.first());
       // System.out.println("the last element is: "+myList.last());  
       /////////////////////////////////////////////////////////////////
       myList.addFirst(10);
       myList.addLast(20);
       myList.addLast(30);
       myList.addLast(20);
       //myList.addLast(10);
       System.out.println(myList.isPalidrome());
       myList.print();
       myList.printReverse();



        
    }
}