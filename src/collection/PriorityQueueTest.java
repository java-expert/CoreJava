package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(31);
		queue.add(55);
		queue.add(77);
		
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		
		queue.remove(); 
		queue.poll();
		
		System.out.println("\n\niterating the queue elements :: ");  
		Iterator<Integer> itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		 
		//queue.poll(); 
	}

}
