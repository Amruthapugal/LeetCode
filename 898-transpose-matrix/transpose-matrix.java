class Solution {
    public int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int arr1[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[j][i]=arr[i][j];           
            }
        }
        return arr1;
    }
}
