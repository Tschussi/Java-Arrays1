import java.util.Random;

public class randomNumbers {

	public static void main(String[] args) {
		int[] count = new int[10];
		int test;
		int scale;
		Random rando = new Random();
		for(int i=0;i<1000000;i++) {
			test = rando.nextInt(10);
			if(test==0)
				count[0]++;
			else if(test==1)
				count[1]++;
			else if(test==2)
				count[2]++;
			else if(test==3)
				count[3]++;
			else if(test==3)
				count[3]++;
			else if(test==4)
				count[4]++;
			else if(test==5)
				count[5]++;
			else if(test==6)
				count[6]++;
			else if(test==7)
				count[7]++;
			else if(test==8)
				count[8]++;
			else
				count[9]++;
		}	
		for(int k=0; k<count.length;k++)
		{
			System.out.print(k + " ");
			scale = count[k]/2000;
			for(int j = 0; j<scale;j++)
				System.out.print("*");
			System.out.println("(" + count[k] + ")");
		}	
	}

}
