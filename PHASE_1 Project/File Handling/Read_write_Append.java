package File;
import java.io.File;  
import java.io.IOException;  
import java.io.FileWriter;
import java.io.FileNotFoundException;  
import java.util.Scanner;
public class Read_write_Append 
{
	public static void main(String[] args) 
	{
		//Create file
	 try 
	 {
	      File Create = new File("C:\\Users\\Admin\\eclipse-workspace\\Filehandling\\src\\File\\FileHandling.txt");
	      if (Create .createNewFile()) 
	        System.out.println("File created: " + Create .getName());
	      else 
	        System.out.println("File already exists.");   
	  } 
	 catch (IOException e)
	 {
	      System.out.println("While Creating a File An error occurred.");
	      e.printStackTrace();
	  }
	  //Write file
     try 
     {
      FileWriter Writer = new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\Filehandling\\src\\File\\FileHandling.txt");
      Writer.write("First We create the file with help File Method."+"\n"+"For Write in the file we use Writer Method."+"\n"+"For Read we use the Reader Method.");
      Writer.close();
      System.out.println("Data is write to the file.");
     } 
    catch (IOException e1) 
     {
      System.out.println("An error occurred.");
      e1.printStackTrace();
    }
     //Read File
    try 
    {
        File Read = new File("C:\\Users\\Admin\\eclipse-workspace\\Filehandling\\src\\File\\FileHandling.txt");
        Scanner Reader = new Scanner(Read);
        while (Reader.hasNextLine())
        {
          String data = Reader.nextLine();
          System.out.println(data);
        }
        Reader.close();
     }
    catch (FileNotFoundException e2) 
    {
        System.out.println("An error occurred.");
        e2.printStackTrace();
    }}}
//"End Of the Program"



