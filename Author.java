
public class Author {
	
	final int    DEFAULT_NUMBER  = 0;
	final String TEST_FIRST_NAME = "Test";
	final String TEST_LAST_NAME  = "Complete";
	
	int    authorNumber;
	int    booksAvailable;
	
	double bookCost;
	
	String firstName;
	String lastName;
	String bookName;
	String bookSeries;
	
	public Author(){
		this.authorNumber = authorNumber;
		this.firstName    = firstName;
		this.lastName     = lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String setFirstName(String firstName){
		firstName = TEST_FIRST_NAME;
		return firstName;
	}
	
	public String setLastName(String lastName){
		lastName = TEST_LAST_NAME;
		return lastName;
	}
	
	public int setAuthorNumber(int authorNumber){
		authorNumber = DEFAULT_NUMBER;
		return authorNumber;
		
	}
	
}
