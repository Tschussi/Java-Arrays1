// Ceasar Cipher 
public class encryption {

	public static void main(String[] args) {
		String secret = "this is a secret message";
		int shift = 5;
		char array[] = secret.toCharArray();
		
		System.out.println(secret); // Original Message
		
		for(int i = 0;i<array.length;i++) {
			if(array[i] == ' ')
				array[i] = ' ';
			else
			{
				array[i] = (char) (array[i] + shift);
				if(array[i] > 'z') // change to 'Z' for capitals
					array[i] = (char)(array[i]-26);
			}	
		}
		
		System.out.println(array); // Encrypted message
		
		for(int k=0;k<array.length;k++) {
			if(array[k] == ' ')
				array[k] = ' ';
			else
			{
				array[k] = (char) (array[k] - shift);
				if(array[k] < 'a') // change to 'A' for capitals
					array[k] = (char)(array[k]+26);
			}	
		}
		System.out.println(array);	// Decrypted message
	}

}
