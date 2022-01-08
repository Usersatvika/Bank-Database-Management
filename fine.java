package ok;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner; 
public class fine {
	
	
	public static void main(String[] args) throws Exception  
	{  
	Scanner sc = new Scanner(new File("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employeedb1.csv"));  
	sc.useDelimiter(",");     
	 String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
	 //String String1="C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employeedb.csv";
	 //String urlString1="C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employeedb.csv";
     String apiToken = "5061486951:AAFNUXMkBBvY1Ljy14IKXjTInCZNPjyP1AY";
   
     
     String chatId = "1418484180";
     String text ="hello world!";

     urlString = String.format(urlString, apiToken, chatId, text);
     try {
         URL url = new URL(urlString);
        
         URLConnection conn = url.openConnection();
         InputStream is = new BufferedInputStream(conn.getInputStream());
     } catch (IOException e) {
         e.printStackTrace();
     }
	while (sc.hasNext())  
	{  
	System.out.print(sc.next());   
	}   
	sc.close();  //closes the scanner  
	}

	  
	  
}
