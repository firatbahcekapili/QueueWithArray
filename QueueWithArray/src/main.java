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
		k.yazdýr();
		System.out.println("---------------------------------");
		System.out.println("head deðeri : " + k.getHead());
		System.out.println("tail deðeri : " + k.getTail());
		System.out.println("Dizi boþ mu? : " + k.queueIsEmpty());

	}

}
