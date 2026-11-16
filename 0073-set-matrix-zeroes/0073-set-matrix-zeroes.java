class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        for (int j = 0; j < n; j++) {           // Check if the first row contains zero
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {            // Check if the first column contains zero
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {             // Mark rows and columns that need to be zero
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {                 // Set marked rows to zero
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {              // Set marked columns to zero
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow) {                          // Handle the first row
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstCol) {                                      // Handle the first column
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
