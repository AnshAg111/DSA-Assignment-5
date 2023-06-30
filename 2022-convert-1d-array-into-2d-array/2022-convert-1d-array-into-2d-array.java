class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size=original.length, k=0;
        int[][] matrix={};
        if(size!=m*n) return matrix;
        matrix=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=original[k];
                k++;
            }
        }
        return matrix;
    }
}