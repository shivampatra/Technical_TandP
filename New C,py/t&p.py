# class MinStack:
#     def __init__(self,max):
#         self.max = max
#         self.top = -1
#         self.min = -1
#         self.stack = [None]*max
#     def push(self,data):
#         if (self.top == self.max-1) :
#             print("Stack Full")
#         elif(self.top == -1):
#             self.top += 1
#             self.stack[self.top]=data
#             self.min=data
#         elif(data<self.stack[self.top]):
#             n = 2*data-self.min
#             self.top += 1
#             self.stack[self.top]=n
#             self.min=data
#         else:
#             self.top +=1
#             self.stack[self.top]=data
            
#     def pop(self):
#         if(self.top==-1):
#             print("Stack Empty")
#             self.min = -1
#         elif(self.stack[self.top]<self.min):
#             data = self.min
#             self.min = 2*self.min-self.stack[self.top]
#             self.stack[self.top]=None
#             self.top-=1
#             return data
#         else :
#             data = self.stack[self.top]
#             self.stack[self.top]=None
#             self.top-=1
#             return data
# ob = MinStack(5)
# ob.push(5);ob.push(2);print(ob.min)
# ob.pop();print(ob.min)




# # a = int(input());b = int(input())
# # a, b = map(int, input().split())
# # if a<b :
# #     print("a < b")
# # elif a>b:
# #     print("a > b")
# # else :
# #     print("a == b")

tp = (10)

print(tp)