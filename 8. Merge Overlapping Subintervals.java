/**
56. Merge Intervals
https://leetcode.com/problems/merge-intervals/

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104

 */

 class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in, (a,b)->a[0]-b[0]);
        int low=in[0][0],high=in[0][1],n=in.length;
        ArrayList<int[]>arr=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(in[i][0]<=high){
                high=Math.max(high,in[i][1]);
            }
            else {
                arr.add(new int[]{low,high});
                low=in[i][0];
                high=in[i][1];
            }
        }
        arr.add(new int[]{low,high});
        return arr.toArray(new int[0][]);
    }
}

/**
in=  [[1,3],[2,6],[8,10],[15,18]];



*/