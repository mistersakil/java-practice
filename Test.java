class Test{
	public static void main(String ar[]){
		int num = Integer.parseInt(ar[0]);		
		int i = 2;
		boolean isPrime = true;
		System.out.println(num);
		while(i < num){
			if(num % i ==0){
				isPrime = false;
				break;
			}
			i++;
		}
		System.out.println(isPrime);
	}
}