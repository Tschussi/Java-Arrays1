import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class FileInput {

	public static void main(String[] args) throws IOException {
		File input = new File("hemingway-old-man.txt");
		Scanner in = new Scanner(input).useDelimiter("\\Z");
	    String content = in.next();
	    in.close();
	    String lowercase = content.toLowerCase();
	    int[] count = new int[26];
	    int scale;
	    int temp;
	    char[] alphabit = new char[26];
	    int[] index = new int[10];
	    int[] countcopy = new int[26];
	    
	    // Alphabit for histogram and sorting
	    for(int c=0; c<26;c++)
	    	alphabit[c]=(char)('a'+c);
	    
	  //  System.out.println(lowercase);
	    System.out.println("There are " + content.length() + " characters in the file");
	   
	    // Counts number of occurances for each character
	    for(int i=0;i<content.length();i++) {
	    	for(int k=0; k<26; k++) {
	    		if(lowercase.charAt(i)==('a'+k))
	    			count[k]++;
	    	}
	    }	
	   // Makes Histogram
	    for(int x=0; x<count.length;x++)
		{
			System.out.print(alphabit[x] + " ");
			scale = count[x]/500;
			for(int y = 0; y<scale;y++)
				System.out.print("*");
			System.out.println("(" + count[x] + ")");
		}
	   
	    System.arraycopy(count, 0, countcopy, 0, count.length);
	    // Sorts by frequency
	    for(int n=0; n<count.length-1;n++) {
	    	for(int j=0;j<count.length-1;j++) {
	    		if(count[j] < count[j+1])
	    		{
	    			temp = count[j];
	    			count[j] = count[j+1];
	    			count[j+1] = temp;
	    		}
	    	}
	    }
	    
	    // correlates frequency with the alphabit index
	    temp = 0;
	    // 5 most frequent
	    for(int d=0;d<5;d++){
	    	for(int f=0;f<count.length;f++) {
	    		if(count[d]==countcopy[f])
	    			index[d] = f; 
	    	}
	    }	
	    // 5 least frequent (commented out lines for debugging)
	    for(int g=count.length-1;g>count.length-6;g--) {
	    	for(int h=0;h<count.length;h++) {
	    		if(count[g]==countcopy[h]) {
	    			if(count[g]!=countcopy[index[temp]]) { // handle letters with same frequency
	    				//System.out.println("1index value" + (g-count.length+10) + "assignment" + h + " " + g + "||||");
	    				index[g-count.length+10]=h;
	    				temp=g-count.length+10;
	    			}
	    			else
	    			{	
	    				g--;
	    				//System.out.println("2index value" + (g-count.length+10) + "assignment" + h + " " + g + "||||"); 
	    				index[g-count.length+10]=h;
	    			}	
	    		}	
	    	}	
	    }
	    
	    // Prints most and least occuring letters
	    System.out.println("The five most occuring letters are: ");
	    for(int a=0;a<5;a++)
	    	System.out.print(alphabit[index[a]] + " ");
	    System.out.println("\nThe five least occuring letters are: ");
	    for(int b=9;b>4;b--)
	    	System.out.print(alphabit[index[b]] + " ");  
	    
	}

}
