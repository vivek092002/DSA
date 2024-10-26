package com.DSA.string.practice;
import java.util.*;

class docPat {
    // Method to calculate the departure times of all patients
    public static int[] diagnosis(int n, int[] time, int[] weak) {
        // Array to store the departure time for each patient
        int[] departure = new int[n];

        // Priority queue to process patients based on weakness and arrival order
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1]; // Higher weakness first
            return a[0] - b[0]; // Earlier arrival if same weakness
        });

        // Add all patients to the priority queue
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{i, weak[i]});
        }

        // Current time in the clinic
        int currentTime = 0;

        // Process each patient from the queue
        while (!pq.isEmpty()) {
            int[] patient = pq.poll();
            int index = patient[0];

            // Ensure the patient is only treated after their arrival
            currentTime = Math.max(currentTime, time[index]);

            // Calculate the departure time for the patient
            departure[index] = currentTime + weak[index];

            // Update the current time after diagnosing this patient
            currentTime += weak[index];
        }

        return departure;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 3;
        int[] time = {2,3,4};
        int[] weak = {1,1, 1};

        int[] result = diagnosis(n, time, weak);
        System.out.println(Arrays.toString(result)); // Output: [4, 5, 6]
    }
}
