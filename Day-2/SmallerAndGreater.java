public class Solution {
    public int solve(ArrayList<Integer> A) {
        int min = 10000000;
        int max = 0;
        for (int i = 0; i < A.size(); i++) {
            min = Math.min(min, A.get(i));
            max = Math.max(max, A.get(i));
        }

        int count = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == min || A.get(i) == max)
                count++;
        }

        return A.size() - count;
    }
}
