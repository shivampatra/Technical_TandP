nums=[1,2]
nums.sort()
for i in range(len(nums)-1):
    if i not in nums:
        print(i)