class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int days = temperatures.length;
        int[] wait = new int[days];

        ArrayDeque<Integer> colderDays = new ArrayDeque<>();

        for (int today = 0; today < days; today++) {

            while (!colderDays.isEmpty() &&
                   temperatures[today] > temperatures[colderDays.peek()]) {

                int previousDay = colderDays.pop();
                wait[previousDay] = today - previousDay;
            }

            colderDays.push(today);
        }

        return wait;
        
    }
}
