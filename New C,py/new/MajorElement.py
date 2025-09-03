# Given an array nums of size n, return the majority element.

# The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

# Example 1:

# Input: nums = [3,2,3]
# Output: 3
# Example 2:

# Input: nums = [2,2,1,1,1,2,2]
# Output: 2

#LEETCODE :
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # cnt=0
        # ce=None
        # # nums.sort()
        # for i in range(len(nums)):
        #     if cnt==0:
        #         ce=nums[i]
        #     if nums[i]==ce:
        #         cnt+=1
        #     else:
        #         cnt-=1
        # return ce

        nums.sort()
        return nums[len(nums)//2]

