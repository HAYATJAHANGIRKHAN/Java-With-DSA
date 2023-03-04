public class Queues {
    static class queue {
        static  int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear= -1;
            front= -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front   == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        //add
        public static void add(int data){
//            if ( rear == size -1)
            //for circular
            if(isFull()){
                System.out.println("queue is full");
                return;
            }  //add firt element

//            rear = rear +1;
            if (front==-1){
                front =0;
            }
            rear = (rear +1) % size;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            //front
//            int front = arr[0];
//             for (int i=0; i<rear; i++){
//                 arr[i]=arr[i+1];
//             }
            int result = arr[front];
//             rear = rear -1;
//            front =(front+1)% size;
//             return front;
            //last el delete
            if(rear == front){
                rear = front = -1;
            } else{
                front = (front +1)% size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
//            return arr[0];
            return arr[front];
        }
    }



    public static void main(String[] args) {
    queue q = new queue(4);
     q.add(1);
     q.add(2);
     q.add(3);
     while (!q.isEmpty()){
         System.out.println(q.peek());
         q.remove();
     }
    }
}
