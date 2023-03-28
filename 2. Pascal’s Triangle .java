/*
118. Pascal's Triangle
https://leetcode.com/problems/pascals-triangle/

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30


 */

 class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0; i<numRows; i++){
            List<Integer> list = new ArrayList<Integer>();
            int val = 1;
            for(int j = 0; j<=i; j++){
                list.add(val);
                val= val*(i-j)/(j+1);
            }
            ans.add(list);
        }
        return ans;
    }
}

/*
approach 2:

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        ArrayList<Integer>l1=new ArrayList<>();
         ArrayList<Integer>l2=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        
        // res.add(l2);
        for(int i=0;i<numRows;i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    temp.add(1);
                    l1.add(1);
                }
                else temp.add(l1.get(j-1)+l1.get(j));
            }
            res.add(temp);
            l1.clear();
            for(int p:temp)l1.add(p);
        }
        return res;
    }
}

*/