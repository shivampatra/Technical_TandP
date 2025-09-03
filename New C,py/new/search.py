def res(a,b):
    for i in a:
        if i==b:
            return True
    return False
a=[1,2,3,4,5,6,7]

b=int(input())
print(res(a,b))
