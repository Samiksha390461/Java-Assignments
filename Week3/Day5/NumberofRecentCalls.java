class RecentCounter {
    private ArrayDeque<Integer> requests;

    public RecentCounter() {
        requests = new ArrayDeque<>();
    }
    public int ping(int t) {
        requests.offerLast(t);

        int validTime = t - 3000;

        while (!requests.isEmpty() && requests.peekFirst() < validTime) {
            requests.pollFirst();
        }

        return requests.size();
        
    }
}
