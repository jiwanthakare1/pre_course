package access_modifier;

class Test{
	public static void main(String[] args) {
		System.out.println("find greatest among the three numbers");
		
		int a=98;
		int b=99;
		int c=20000;
		
		if (a>b&a>c)
		{
			System.out.println("a is greatest");
			
		}
		else if(b>a&b>c){
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
	}
	
	
	
}