package Library.UnitTesting;

public class library {
	
	
	public String concatenate(String name, String surname)
	{
		
		String fullName = null;
		int n=0;
	
		
		for (int i=0;i<name.length();i++)
    	{	
		Boolean flag1 = Character.isDigit(surname.charAt(i));
		Boolean flag = Character.isDigit(name.charAt(i));
		
        if(flag==true || flag1==true) {
        	fullName="Not a string value";
        }
        else 
        
        {
        	fullName=name+" "+surname;
        	
        }
    	}
		return fullName;
	}

}
