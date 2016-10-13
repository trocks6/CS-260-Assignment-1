
public class Category {
	
	final String DEFAULT_CATEGORY = "Fiction";
	
	int    booksAvailable;
	
	double bookCost;
	
	String category;
	String bookName;
	String bookSeries;
	
	public Category(){
		this.category = category;
	}
	
	public String getCategory(){
		return category;
	}
	
	public String setCategory(String category){
		category = DEFAULT_CATEGORY;
		return category;
	}
	
	public String setLastName(String lastName){
		lastName = "Complete";
		return lastName;
	}
	
	public int setAuthorNumber(int authorNumber){
		authorNumber = 0;
		return authorNumber;
	}
}
