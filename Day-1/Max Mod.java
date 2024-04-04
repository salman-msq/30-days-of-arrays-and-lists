public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            max = Math.max(max, A.get(i));
        }

        int ans = 0;
        for (int num : A) {
            ans = Math.max(ans, num % max);
        }

        return ans;
    }
}
