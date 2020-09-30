class PrimeNumber{
	public static void main(String ar[]){
		int num = Integer.parseInt(ar[0]);		
		int i = 2;
		boolean isPrime = true;
		int breakPoint = 0;
		while(i < num){
			if(num % i ==0){
				isPrime = false;
				breakPoint = i;
				break;
			}
			i++;
		}
		System.out.println(isPrime);
		System.out.println("Break point: "+breakPoint);
	}
}