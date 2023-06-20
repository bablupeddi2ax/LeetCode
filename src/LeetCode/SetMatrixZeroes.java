package LeetCode;

public class SetMatrixZeroes {
/*
 Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] visited = new int[m][n];
		
		
		for(int i= 0;i<m;i++) {
			for(int j= 0;j<n;j++){
				if(matrix[i][j]==0) {
					visited[i][j]=1;
				}
			}
			}
		for(int i= 0;i<m;i++) {
			for(int j= 0;j<n;j++){		
				System.out.print(visited[i][j]);
			}
			System.out.println();
			}
		
		 for(int i = 0;i<m;i++) {
			 for(int j = 0;j<n;j++) {
				 if(matrix[i][j]==0) {
					 int k = i;
					 int l = j;
					 while(k<n ) {
						 matrix[k][l]=0;
						 k++;
					 }
					 k=i;
					 while(l<n) {
						 matrix[k][l]=0;
						 l++;
					 }
					 l =j;
					 while(k>=0  ) {
						 matrix[k][l] = 0;
						 k--;
					 }
					 k = i;
					 while(l>=0) {
						 matrix[k][l]=0;
						 l--;
						 }
					 l=j;
				 }
			 }
		 }
		 
			for(int i= 0;i<m;i++) {
				for(int j= 0;j<n;j++){
					System.out.print(matrix[i][j]);
				}
				System.out.println();
				}
		}

}
