
import java.io.*;
import java.util.Scanner;

import javax.crypto.*;
public class Encrypt {

	public static void main(String [] args) 
	{
		try{ FileReader read = new FileReader("lexo.txt");
			
		String content = new Scanner(read).nextLine();
			byte str[] = content.getBytes();
			Cipher c = Cipher.getInstance("DES");
		    KeyGenerator kg = KeyGenerator.getInstance("DES");
		    SecretKey sk = kg.generateKey();
	
		
		c.init(Cipher.ENCRYPT_MODE,sk);
		byte ct[] = c.doFinal(str);
		
	    
		BufferedWriter bw = new BufferedWriter(new FileWriter("shkruaj.txt"));
		bw.write(new String(ct));
		
		
		 read.close();
		 bw.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);			
		}
		
		 
	}
	
}
