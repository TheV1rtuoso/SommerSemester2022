import java.util.*;


public class FairAllocator{
    private static final int MAX_OVERTAKING = 3;
    private int available ;
    private long turn = 0; //next ticket to be dispensed
    Set<Long> overtakers = new HashSet<>();
    PriorityQueue<Long> waitingTimes = new PriorityQueue<>(Collections.reverseOrder());

    private long next = 0; //next ticket to be served

    public FairAllocator ( int n) {
        available = n;
    }

    synchronized public void get( int n) throws InterruptedException {
        long myturn = turn;
        ++turn;
        while (true) {
            wait();
            if (available >= n) {
                if (myturn == turn) {
                    break;
                }
                if (waitingTimes.isEmpty() || waitingTimes.peek() != MAX_OVERTAKING) {
                    waitingTimes.stream().map(x -> x + 1);
                    break;
                }
            }
        }
        ++next;
        available -= n;
    }
    synchronized public void put(int n) {
        available += n;
        notifyAll ();
    }

    public static void main(String[] args) {
        try {
            int x = 0;
            System.out.println("finally some java");
            return;
        } finally {
            System.out.println("NOT!");

        }
    }
}
