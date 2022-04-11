class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ele = m * n;
        k = k % ele;
        
        int temp[][]=new int[m][n];
       
        
        for (int i = 0; i < m; i++) {
         
            for (int j = 0; j < n; j++) {
                int idx =( i*n+j+k)%ele;
                temp[idx/n][idx%n]=grid[i][j];
            }
         
        }
       List<List<Integer>> li = new ArrayList<>();
        return (List)Arrays.asList(temp);
       
    }
    
 
}