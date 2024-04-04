public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();

        int even = 0;
        for (int num : A) {
            if ((num & 1) == 0)
                even++;
        }

        return Math.min(even, n - even);
    }
}