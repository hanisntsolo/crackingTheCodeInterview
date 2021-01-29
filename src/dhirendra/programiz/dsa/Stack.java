package dhirendra.programiz.dsa;
//Stack implementation completed yeah!
public class Stack {
    //Stack implementation in java
    private int arr[];
    private int capacity;
    private int top;
    //Creating a stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    //Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    //Check if stack is full
    public boolean isFull() {
        return top == capacity-1;
    }
    //Size of the stack
    public int size() {
        return top+1;
    }
    //Printing the stack
    public void printStack() {
        for(int i:arr) {
            System.out.println(i);
        }
    }
    //Adding elements on to the stack
    public void push(int x) {
        if(isFull()) {
            System.out.println("Overflow\nProgram terminated!");
            System.exit(1);
        }
        System.out.println("Item inserted: "+x);
        arr[++top] = x;
    }
    //removing elements from the array
    public int pop() {
        if(isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[--top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(4);
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.isEmpty();
        System.out.println("Element popped: "+stack.pop());;
        stack.printStack();
        System.out.println("The size of the stack is: "+stack.size());;
        stack.printStack();
    }
}
