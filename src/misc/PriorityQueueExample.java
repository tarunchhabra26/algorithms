package misc;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueExample {
	public static void main(String args[]) {
		Queue<Integer> ipq = new PriorityQueue<Integer>(7);
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			ipq.add(new Integer(rand.nextInt(100)));
		}
		for (int i = 0; i < 7; i++) {
			Integer in = ipq.poll();
			System.out.println("Processing Integer :" + in);
		}

		Queue<Customer> cpq = new PriorityQueue<Customer>(7, comparator);
		for (int i = 0; i < 7; i++) {
			rand = new Random();
			int id = rand.nextInt(100);
			cpq.add(new Customer(id, "samplename" + id));
		}
		pollData(cpq);
	}

	public static Comparator<Customer> comparator = new Comparator<Customer>() {
		@Override
		public int compare(Customer c1, Customer c2) {
			return (int) (c1.getId() - c2.getId());
		}
	};

	private static void pollData(Queue<Customer> cpq) {
		while (true) {
			Customer cust = cpq.poll();
			if (cust == null)
				break;
			System.out.println("Processing customer with ID = " + cust.getId() + " name = " + cust.getName());
		}
	}

}
