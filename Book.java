/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author KaJuan Jones     
 * @version 02/4/2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String details;
    Private String  refNumber;
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String getDetails)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        details = author,title,pages;
        Number = "";
    }

    // Add the methods here...
    
    //First we return the Author and Title.
    public String getAuthor(){
        return author;
        
    }
    
    public String getTitle(){
        return title;
    }
    
    // The we also add print methods for Author and Title.
    public String printAuthor(){
        System.out.println();
        return author;
    }
    
    public String printTitle(){
        System.out.println();
        return title;
    }
    // We add a method for the number of pages.
    public int getPages(){
        return pages;
    }
    // This is the method for getting the details of the book.
    public String printDetails(){
        System.out.println("This is the Title of the book:");
        return title;
        System.out.println("This is the Author of the book:");
        return author;
        System.out.println("This is how many pages there are:");
        return pages;
        System.out.println("This is the Ref Number:");
        return refNumber;
        
    }
    
    public void setRefNumber(String ref){
    }
    
   
    
}
