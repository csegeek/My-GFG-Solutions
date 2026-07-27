class Solution {
    public int inversionCount(int arr[]) {
        // code here
        int count =sort(arr,0,arr.length-1);
        return count;
        
    }
    
     int merge(int a[], int l, int m, int r)
    {
        int cnt=0;
      	int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

      	for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
                cnt += (m - l + 1 - i);
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
        return cnt;
    }

    // Main function that sorts a[l..r] using
    // merge()
    int sort(int a[], int l, int r)
    {
        int cnt=0;
        if (l < r) {
          
            int m = (l + r) / 2;

            // Sort first and second halves
           cnt+= sort(a, l, m);
           cnt+= sort(a, m + 1, r);

            // Merge the sorted halves
            cnt += merge(a, l, m, r);
        }
        return cnt;
    }
}