class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m*n- 1;
        int mid = low + (high - low) / 2;
        while(low <= high){
            if(matrix[mid/n][mid%n] == target) return true;
            else if(matrix[mid/n][mid%n] < target) low = mid + 1;
            else high = mid - 1;
            mid = low + (high - low) / 2;
        }
        return false;
    }
}
