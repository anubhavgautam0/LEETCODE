class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] cloned = score.clone();
        Arrays.sort(cloned);

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (score[i] == cloned[j]) {
                    int rank = n - j; 

                    if (rank == 1) {
                        result[i] = "Gold Medal";
                    } else if (rank == 2) {
                        result[i] = "Silver Medal";
                    } else if (rank == 3) {
                        result[i] = "Bronze Medal";
                    } else {
                        result[i] = String.valueOf(rank);
                    }
                    break; 
                }
            }
        }

        return result;
    }
}