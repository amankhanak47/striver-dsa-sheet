/*
73. Set Matrix Zeroes
https://leetcode.com/problems/set-matrix-zeroes/

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 

Follow up:

A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?


solution: 
 */


 class Solution {
    public void setZeroes(int[][] matrix) {
        int row=1,col=1;

        for(int i=0;i<matrix.length;i++)
            if(matrix[i][0]==0)
                col=0;

        for(int i=0;i<matrix[0].length;i++)
            if(matrix[0][i]==0)
                row=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }  
        }

        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }  
        }
        if(col==0)for(int i=0;i<matrix.length;i++)matrix[i][0]=0;
        if(row==0)for(int i=0;i<matrix[0].length;i++)matrix[0][i]=0;
      
    }
}
/*
1 1 1
1 0 1
1 1 1

approach1:

row=[false,false,false];
col=[false,false,false];


public void setZeroes(int[][] matrix) {
        Boolean row[]=new Boolean[matrix.length];
        Boolean col[]=new Boolean[matrix[0].length];
        Arrays.fill(row,false);
        Arrays.fill(col,false);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(col[j]==true||row[i]==true){
                    matrix[i][j]=0;
                }
            }
        }
    }

 */