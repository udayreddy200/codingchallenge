import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class PrimeRandomizerDist {
	
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	static Map<Integer,Boolean> map = new HashMap<Integer, Boolean>();
	public LinkedList<Integer> Randomizer(LinkedList<Integer> queue){
		
		Random rand = new Random();
		int val = rand.nextInt();
		System.out.println("This is the random value generated:"+val);
		queue.add(val);
		return queue;
	}
	
	
	public static void main(String [] args) {
		PrimeRandomizerDist obj = new PrimeRandomizerDist();
		LinkedList<Integer> queue1 = obj.Randomizer(queue);
		map = obj.primeRandomizer(queue1);
		
		for ( Map.Entry<Integer,Boolean> entry : map.entrySet()) {
		    int key = entry.getKey();
		    boolean val = entry.getValue();
		    System.out.println("This is the Random Integer:"+key+" and it is prime:"+val);
		    
		}
		
		
	}


	private Map<Integer, Boolean> primeRandomizer(LinkedList<Integer> queue1) {
		int val = queue1.poll();
		boolean res = isPrime(val);
		map.put(val, res);
		return map;
	}
	
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		int temp;
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		return isPrime;
	}
	
	
	
	

}
