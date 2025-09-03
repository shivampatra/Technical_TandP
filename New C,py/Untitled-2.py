n=int(input())
for i in range(n):
	cv=i+1
	b=n
	for j in range(n-i):
		print(cv,end="  ")	
		cv+=b
		b-=1

	print()