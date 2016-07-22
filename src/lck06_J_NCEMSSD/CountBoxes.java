package lck06_J_NCEMSSD;

public final class CountBoxes implements Runnable { 
	private static volatile int counter;

//...
    public synchronized void run() { 
    	counter++;    //... 
    }
//...
    public static void main(String[] args) { 
		for (int i = 0; i < 2; i++) {
			new Thread(new CountBoxes()).start(); 
			}
	}
}
