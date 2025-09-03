def numtoword(n):
	limit,t=1000000000000,0
	multiplier = ["","Trillion","Billion","Million","Thousand"]
	f_twenty = ["","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fiftheen","Sixteen","Seventeen","Eighteen","Nineteen"]
	tens=["","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"]
	hundreds=[""]
	if (n<20):
		print(f_twenty[n])
		return
	ans=""
	i=n
	while(i>0):
		curr_hund=i//limit
		while(curr_hund==0):
			i%=limit
			limit//=1000
			curr_hund=i//limit
			t+=1
		if(curr_hund>99):
			ans+=(f_twenty[curr_hund//100]+" tensundered ")
		curr_hund=curr_hund%100
		if(curr_hund>0 and curr_hund<20):
			ans+=(f_twenty[curr_hund]+" ")
		elif(curr_hund%10==0 and curr_hund!=0):
			ans+=(tens[(curr_hund//10)-1]+" ")
		elif(curr_hund>19 and curr_hund<100):
			ans+=(tens[(curr_hund//10)-1]+" "+f_twenty[curr_hund%10]+" ")
		if(t<4):
			ans+=(multiplier[t]+" ")
		i=i%limit
		limit=limit//1000
	print(ans)
n=int(input())
numtoword(n)