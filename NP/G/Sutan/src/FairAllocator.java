import java.util.*;

//Why is Java so unnecessary
public class FairAllocator{
    private static final int MAX_OVERTAKING = 3;
    private int available ;
    private long turn = 0; //next ticket to be dispensed

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
    private static class RingBuffer{
        private List<TreeSet<Long>> overtakers = new ArrayList<>(MAX_OVERTAKING);
        private TreeSet<Long> fixedQueue = new TreeSet<>();
        private int curr_mod = 0;

        public void add_new_to_queue(long ticket) {

        }

        public void exit_queue(long ticket) {
            for (var x : overtakers) {
                if (x.contains(ticket)) {
                    for (var i :x.higher(ticket)) {

                    }
                }
            }
        }

    }
}
