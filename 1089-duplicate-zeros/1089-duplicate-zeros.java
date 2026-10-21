class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        for (int x : arr) {
            if (x == 0) zeros++;
        }
        for (int i = n - 1, j = n + zeros - 1; i >= 0; i--, j--) {
            if (j < n) arr[j] = arr[i];

            if (arr[i] == 0) {
                j--;
                if (j < n) arr[j] = 0;
            }
        }
    }
}