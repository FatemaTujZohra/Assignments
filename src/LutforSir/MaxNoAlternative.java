package LutforSir;

public class MaxNoAlternative {

	public static void main(String[] args) {
		
		int Roll [] = {110, 109, 480, 300, -400};
             int max= 0; //Roll[0];
		
		for (int i=0; i<4;i++)
		{
			
			
			
			if (max<Roll[i])
					{
				max=Roll[i];
				}
		}
		System.out.println("Max value of this array is:"+max);
		
	

}	

}

