
class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();

        for (int i = 1; i  * i<= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) {
                    large.add(n / i);
                }
            }
        }

        // Print `small` list first
        for (int num : small) {
            System.out.print(num + " ");
        }

        // Print `large` list in **reverse** order
        for (int i = large.size() - 1; i >= 0; i--) {
            System.out.print(large.get(i) + " ");
        }
    }
}
