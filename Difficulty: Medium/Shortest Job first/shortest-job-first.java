// User function Template for Java

class Solution {
    static int solve(int jobs []) {
        // code here
         Arrays.sort(jobs);

        float waitTime = 0;  // Stores cumulative waiting time
        int totalTime = 0;   // Tracks elapsed execution time
        int n = jobs.length; // Number of jobs

        // Iterate through each job
        for (int i = 0; i < n; i++) {
            waitTime += totalTime;  // Add current total time to waiting time
            totalTime += jobs[i];   // Execute current job
        }

        // Return the average waiting time
        return (int) waitTime / n;
    }
}
