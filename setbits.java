class setbits{
	static int count(long n){
		if(n==0){
			return 0;
		}
		else if((n & 1)==1){
			return 1 + count(n>>1);
		}
	return count(n>>1);
	}
	public static void main(String args[]){
		String s="0111011101011";
		long n=Long.parseLong(s);
		System.out.println(count(n));
	}
}

