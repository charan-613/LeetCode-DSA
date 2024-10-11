import java.util.PriorityQueue;
import java.util.Arrays;

class Solution{
    public static int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        // Create a new array with friends' index associated to their arrival and leaving times.
        int[][] timings = new int[n][3]; // [arrival_time, leaving_time, index]
        for (int i = 0; i < n; i++) {
            timings[i][0] = times[i][0];  // arrival time
            timings[i][1] = times[i][1];  // leaving time
            timings[i][2] = i;            // friend index
        }

        // Sort the times by the arrival time.
        Arrays.sort(timings, (a, b) -> a[0] - b[0]);

        // Priority queue to track available chairs (min-heap)
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.add(i); // Initially all chairs 0, 1, 2, ..., n-1 are available
        }

        // Priority queue to track leaving times (min-heap), [leaving_time, chair_number]
        PriorityQueue<int[]> occupiedChairs = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Process each friend by their arrival time
        for (int[] friend : timings) {
            int arrival = friend[0];
            int leaving = friend[1];
            int friendIndex = friend[2];

            // Free up chairs of friends that have already left before the current friend's arrival
            while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= arrival) {
                availableChairs.add(occupiedChairs.poll()[1]); // Add the chair back to available
            }

            // Assign the smallest available chair to the current friend
            int assignedChair = availableChairs.poll();

            // If the current friend is the target friend, return the chair number
            if (friendIndex == targetFriend) {
                return assignedChair;
            }

            // Track the friend's chair and when they will leave
            occupiedChairs.add(new int[]{leaving, assignedChair});
        }

        return -1; // This line will never be reached, as the targetFriend is always valid
    }

}