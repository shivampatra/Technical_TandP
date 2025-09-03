// public class test {
//     public static void main(String args[]){
//             System.out.println("Hey My name is "+args[0]+" and I am "+args[1]+" years old.Currently I am pursuing B.Tech in the domain of CSE in "+args[2]);
//         }
// }

public class test{

public static void numtoword(int n){
	int limit = 1000000000000;
	int t = 0 ;
    String multiplier[] = {"","Trillion","Billion","Million","Thousand"};
	String f_twenty[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fiftheen","Sixteen","Seventeen","Eighteen","Nineteen"};
    
	String tens[]={"","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	String hundreds[]={""};
	if (n<20){
		System.out.println(f_twenty[n]);
    }
	String ans="";
	int i=n;
	while(i>0){
		int curr_hund=i//limit;
		while(curr_hund==0){
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
    }
        print(ans)

}
    public static void main(String[] args) {
        n=int(input())
        numtoword(n)
    }
}
