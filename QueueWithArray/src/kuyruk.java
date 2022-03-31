
public class kuyruk {
	private final int size = 5;
	int[] a = new int[size];

	private int head;
	private int tail;
	
	public kuyruk() {
	
			this.head = 0;
			this.tail = 0;
		}

	public int getHead() {
		return head;
	}

	public int getTail() {
		return tail;
	}

	
	public void enqueue(int x) {
		if (queueIsEmpty()) {

			a[tail] = x;
			++tail;

		} else {
			System.out.println("Dizi dolu. Daha fazla ekleyemezsiniz.");
		}

	}

	public int dequeue() {
		if (queueIsEmpty() == false) {
			int hafýza = a[head];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			tail--;
			return hafýza;
		} else {
			System.out.println("Dizi boþ");
			return a[head];
		}

	}

	public boolean queueIsEmpty() {

		if (tail != size)
			return true;
		else
			return false;

	}

	public void yazdýr() {
		for (int i = head; i < tail; i++) {
			System.out.println("Dizinin " + i + ".indisindeki eleman " + a[i]);
		}
	}

}
