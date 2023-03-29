/**
31. Next Permutation
https://leetcode.com/problems/next-permutation/

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100

 */


 class Solution {
    public void nextPermutation(int[] a) {
        int n=a.length,index1=-1,index2=-1;
        for(int i=n-2;i>=0;i--){
            if(a[i+1]>a[i]){
                index1=i;
                break;
            }
        }
        if(index1>=0){
            for(int i=n-1;i>=0;i--){
                if(a[i]>a[index1]){
                    index2=i;
                    break;
                }
            }
            int temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
        }
        int low=index1+1,high=n-1;
        while(low<high){
            int temp2=a[low];
            a[low]=a[high];
            a[high]=temp2;
            low++;
            high--;
        }
    }
}

/*
   
a=[1,4,3,5,3,1,0]

step1: a[i+1]>a[i]   idex1=i; 
step2:  a[index]<a[i]  index2=i;
step 3: swap(a[index1],a[index2]);
step4: reverse index+1 to last element;


321
ind1=0,ind2=0
 */