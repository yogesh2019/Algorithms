import java.util.concurrent.ConcurrentHashMap;


class CountingSet {
	
	ConcurrentHashMap<String,Integer > Set  =  new ConcurrentHashMap<String, Integer>();
    public int add(String s){
        
        if(Set.get(s) == null)
		  Set.put(s,1);
		else
	      Set.put(s,Set.get(s)+1);
        
		 
	 // System.out.println(Set.get(s));
        return Set.get(s);
    }
    public int remove(String s){
	 if(Set.get(s) == 1)
		Set.remove(s);
	 else
		Set.put(s,Set.get(s)-1);

	// System.out.println(Set.get(s));
		return Set.get(s);
    }
    public int count(String s){
       return Set.get(s);
    }
}


// count("A")=>0
// add("A") =>1
// add("A") =>2
// add("AB") =>1
// remove("AB") =>0
// count("AB") =>0
// count("A")=>2
// add("A") =>3

public class CountingSetTest{
        private static final int CNT = 100000;
    	public static void main(String[] args) throws InterruptedException {
		CountingSet cs = new CountingSet();
		for (int i = 0; i < CNT; i++) {
			cs.add("A");
		}
		
		System.out.println(cs.count("A"));

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < CNT; i++) {
					try {
						cs.add("A");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < CNT; i++) {
					try {
						cs.remove("A");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count found:"+cs.count("A")+"; Expected:"+CNT+";Pass:"+(cs.count("A") == CNT));
	}
}