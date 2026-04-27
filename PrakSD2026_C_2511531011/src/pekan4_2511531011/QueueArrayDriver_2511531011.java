package pekan4_2511531011;

public class QueueArrayDriver_2511531011 {

	public static void main(String[] args) {
		QueueArray_2511531011 queue_1011 = new QueueArray_2511531011(1000);
		queue_1011.enqueue_2511531011(10);
		queue_1011.enqueue_2511531011(20);
		queue_1011.enqueue_2511531011(30);
		queue_1011.enqueue_2511531011(40);
		System.out.println("Item di depan " + queue_1011.front_2511531011());
		System.out.println("Item paling belakang " + queue_1011.rear_2511531011());
		System.out.println("Tampilan queue");
		queue_1011.display_2511531011();
		System.out.println();
		System.out.println(queue_1011.dequeue_2511531011() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue_1011.front_2511531011());
		System.out.println("Item paling belakang " + queue_1011.rear_2511531011());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_1011.display_2511531011();

	}

}
