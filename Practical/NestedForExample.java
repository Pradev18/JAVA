class NestedForExample{
	
	public static void main (String args[]){
		int rows = 6;
		//outer loop rows
		for(int i=1; i<=rows; i++){
			
			//inner loop for col
			for(int j=1; j<=i; j++){ //loop to print number
				System.out.print(j+ " ");
			}
			System.out.println(" ");
			
		}
	}
	
}
