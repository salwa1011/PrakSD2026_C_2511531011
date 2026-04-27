package pekan4_2511531011;

public class QueueArray_2511531011 {
	int front_1011, rear_1011, size_1011;
	int capacity_1011;
	int array_1011[];
	
	public QueueArray_2511531011(int capacity_1011) {
		this.capacity_1011 = capacity_1011;
		front_1011 = this.size_1011;
		rear_1011 = capacity_1011 - 1;
		array_1011 = new int [this.capacity_1011];
	}
	
	boolean isFull_2511531011 (QueueArray_2511531011 queue_1011) {
		return (queue_1011.size_1011 == queue_1011.capacity_1011);
	}
	
	boolean isEmpty_2511531011 (QueueArray_2511531011 queue_1011) {
		return (queue_1011.size_1011 == 0);
	}
	
	void enqueue_2511531011 (int item_1011) {
		if (isFull_2511531011(this))
			return;
		this.rear_1011 = (this.rear_1011 + 1) % this.capacity_1011;
		this.array_1011[this.rear_1011] = item_1011;
		this.size_1011 = this.size_1011 + 1;
		System.out.println(item_1011 + " enqueued to queue");
	}
	
	int dequeue_2511531011() {
		if (isEmpty_2511531011(this)) 
			return Integer.MIN_VALUE;
		int item_1011 = this.array_1011[this.front_1011];
		this.front_1011 = (this.front_1011 + 1) % this.capacity_1011;
		this.size_1011 = this.size_1011 - 1;
		return item_1011;
	}
	
	int front_2511531011() {
		if (isEmpty_2511531011(this))
			return Integer.MIN_VALUE;
		
		return this.array_1011[this.front_1011];
	}
	
	int rear_2511531011() {
		if (isEmpty_2511531011(this))
			return Integer.MIN_VALUE;
		return this.array_1011[this.rear_1011];
	}
	
		//mencetak elemen antrian
	void display_2511531011() {
		int i;
		if (front_1011 == rear_1011) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_1011; i < rear_1011; i++) {
			System.out.printf(" %d <-- ", array_1011[i]);
		}
		return;
	}

}
