package Email;
import java.util.Scanner;
import java.util.ArrayList;
public class EmailValidation 
{
	public  void email(String value) 
	{
		ArrayList<String> mail =new ArrayList<>();
	    mail.add("dhaneshan@gmail.com");
	    mail.add("123456@gmail.com");
	    mail.add("456789@gmail.com");
	    mail.add("789456@gmail.com");
	    mail.add("894561@gmail.com");
	    mail.add("745612@gmail.com");
	    mail.add("abcdef@gmail.com");
	    mail.add("ghijkl@gmail.com");
	    mail.add("mnopqr@gmail.com");
	    mail.add("stuvwx@gmail.com");
	    mail.add("india@gmail.com");
	    mail.add("china@gmail.com");
	    mail.add("japan@gmail.com");
	    mail.add("america@gmail.com");
	    mail.add("thailand@gmail.com");
	    mail.add("987456@gmail.com");
	    mail.add("google@gmail.com");
	    mail.add("yahoo@gmail.com");
	    mail.add("outlook@gmail.com");
	    mail.add("youtube@gmail.com");
	    mail.add("search@gmail.com");
	    mail.add("mailid@gmail.com");
	    mail.add("acder@gmail.com");
	    mail.add("suresh@gmail.com");
	    if(mail.contains(value))
	    {
	    	System.out.println("You enter the valid email address");
	    	
	    }
	    else
	    {
	    	System.out.println("You didn't enter the valid email");
	    }
	}
	public static void main(String[]args)
	{
		
    
    System.out.println("Enter the Valid Email Address for search in the existing email list :");
    Scanner ans=new Scanner(System.in);
    String a=ans.nextLine();
    EmailValidation obj=new EmailValidation();
    obj.email(a);
    
}
}
