nums=[3,4,5,1,2]
breakpoint = 0
for i in range(len(nums)-2):
    if nums[i]>nums[i+1]:
        breakpoint += 1 


if breakpoint == 0:
    print("true")

elif nums[len(nums)-1]<nums[0]:
    print("true")

else:
    print("false")