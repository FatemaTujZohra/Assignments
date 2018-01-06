package LutforSir;

public class MInNoFindingArray {

	public static void main(String[] args) {
		int Roll [] = {110, 109, 150, 300, -600};
        int min= Roll[0];
	
	for (int i=0; i<5;i++)
	{
		
		
		
		if (min>Roll[i])
				{
			min=Roll[i];
			}
	}
	System.out.println("Min value of this array is:"+min);

	}

}
