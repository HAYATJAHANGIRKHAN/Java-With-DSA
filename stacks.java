import javax.swing.*;
import java.util.*;
import java.util.Stack;

public class stacks {

//    public static void pushAtbottom(Stack<Integer> s, int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top=s.pop();
//        pushAtbottom(s,data);
//        s.push(top);
//    }
//    static  class Node{
//        int data;
//        Node next;
//        Node (int data ){
//            this.data = data;
//            this.next=null;
//        }
//    }
//    static class Stack{
//        static  Node head=null;
//        public static boolean isempty(){
//            return head== null;
//        }
//        public static void push(int data){
//            Node newNode= new Node(data);
//            if(isempty()){
//          head = newNode;
//          return;
//            }
//            newNode.next =head;
//            head =newNode;
//        }
//        //pop
//        public  static int pop(){
//            if(isempty()){
//                return -1;
//            }
//         int top= head.data;
//            head=head.next;
//            return top;
//        }
//        public static int peek(){
//
//            if(isempty()){
//                return -1;
//            }
//        return  head.data;
//        }
//        static  ArrayList<Integer> list= new ArrayList<>();
//        public  static  boolean isempty(){
//            return  list.size()==0;
//        }
//        //push
//        public static void push(int data){
//            list.add(data);
//        }
//        //pop
//        public static int pop(){
//            if(isempty()){
//                return  -1;
//            }
//            int top=list.get(list.size() -1);
//            list.remove(list.size()-1);
//            return top;
//        }
//        //peek
//        public static int peek(){
//            if(isempty()) {
//                return -1;
//            }
//         return list.get(list.size() -1);
//
//        }

//    }
//     public static void stockSpan(int stocks[], int span[]){
//         Stack<Integer> s= new Stack<>();
//         span[0]=1;
//         s.push(0);
//         for (int i=1; i<stocks.length; i++){
//             int currPrice= stocks[i];
//             while (!s.isEmpty() && currPrice > stocks[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i]=i+1;
//             }else{
//                 int prevHigh= s.peek();
//                 span[i]=i - prevHigh;
//             }
//             s.push(i);
//         }
//     }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        int i;
        for (i = arr.length - 1; i >= 0; i--) ;
        //1while
        while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
            s.pop();
        }
        //2 if-else
        if (s.isEmpty()) {
            nxtGreater[i] = -1;
        } else {
            nxtGreater[i] = arr[s.peek()];
        }
        //3 push in s
        s.push(i);
    }

     }
     


        //        int stocks[]={100,80,60,70,60,85,100};
//        int span[]=new int [stocks.length];
//        stockSpan(stocks,span);
//        for (int i=0; i<span.length; i++){
//            System.out.println(span[i]+" ");
//        Stack s= new Stack();
//        Stack<Integer> s= new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    pushAtbottom(s,4);
//    while (!s.isEmpty()){
//        System.out.println(s.pop());
//    }
        //stock

//        }

