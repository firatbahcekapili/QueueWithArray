import java.util.LinkedList;

public class main {

	public static void main(String[] args) {

		kuyruk k = new kuyruk();

		
		k.enqueue(2);
		k.enqueue(1);
		k.enqueue(1);
		k.enqueue(1);
		k.enqueue(12);
		k.enqueue(2);
		k.dequeue();
	
		System.out.println("---------------------------------");
		k.yazd�r();
		System.out.println("---------------------------------");
		System.out.println("head de�eri : " + k.getHead());
		System.out.println("tail de�eri : " + k.getTail());
		System.out.println("Dizi bo� mu? : " + k.queueIsEmpty());

	}

}
