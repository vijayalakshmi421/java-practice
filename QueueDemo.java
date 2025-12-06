public class QueueDemo {

    int size = 5;
    int[] queue = new int[size];
    int front = 0, rear = -1, count = 0;

    public void enqueue(int value) {
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        count++;
    }

    public void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + queue[front]);
        front = (front + 1) % size;
        count--;
    }

    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        QueueDemo q = new QueueDemo();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}
