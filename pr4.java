// Create a class named Stack. Design a class named Queue for storing integers. Like a 
// stack, a queue holds elements. In a stack, the elements are retrieved in a last-in
// first-out fashion. In a queue, the elements are retrieved in a first-in first-out
// fashion. The 
// class contains: 
// An int[] data field named elements that stores the int values in the queue. 
// A data field named size that stores the number of elements in the queue. 
// A constructor that creates a Queue object with default capacity 8.
// The method enqueue(int v) that adds v into the queue.
// The method dequeue() that removes and returns the element from the queue.
// The method empty() that returns true if the queue is empty. 
// The method getSize() that returns the size of the queue.

import java.util.*;

class queue
{
    Scanner sc = new Scanner(System.in);
    int[] elements = new int[8];
    queue(int n) 
    {
        int capacity = n;
        System.out.println("Enter Any 8 Number (first-in first-out fashion) : ");
        for (int i = 0; i < capacity; i++) 
        {
            elements[i] = sc.nextInt();
        }
    }
    int size;
    void data() 
    {
        size = elements.length;
    }
    int enqueue(int v) 
    {
        int t = v;
        t = elements[0];
        return t;
    }
    void dequeue() 
    {
        for (int i = 0; i < 7; i++) 
        {
            elements[i] = elements[i + 1];
        }
    }
    boolean empty() 
    {
        return true;
    }
    int getSize() 
    {
        return size;
    }
}
class stack 
{
    Scanner sc = new Scanner(System.in);
    int[] elements = new int[8];
    stack(int n) 
    {
        int capacity = n;
        System.out.println("Enter Any 8 Number (last-in first-out fashion) : ");
        for (int i = 0; i < capacity; i++) 
        {
            elements[i] = sc.nextInt();
        }
    }
    int size;
    void data() 
    {
        size = elements.length;
    }
    int enqueue(int v) 
    {
        int t = v;
        return t;
    }
    void dequeue() 
    {
        for (int i = 0; i < 7; i++) 
        {
            elements[i] = elements[i + 1];
        }
    }
    boolean empty() 
    {
        return true;
    }
    int getSize() 
    {
        return size;
    }
}
class pr4 
{
    public static void main(String[] args) 
    {
        queue q = new queue(8);
        stack s = new stack(8);

        q.enqueue(10);
        q.dequeue();
        System.out.println("The First-in First-Out Fashion :");

        for (int i = 0; i < 7; i++) 
        {
            System.out.println(q.elements[i]);
        }

        s.dequeue();
        System.out.println("The First-in Last-Out Fashion :");
        for (int i = 0; i < 7; i++) 
        {
            System.out.println(s.elements[i]);
        }
        System.out.println(s.enqueue(500)); 
        }
}