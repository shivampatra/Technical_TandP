def check(a):
    for i in range(len(a)-1):
        if a[i+1]>a[i]:
            continue
        else:
            return False
    return True
a=[1,2,3,4,5,6]
print(check(a))
    