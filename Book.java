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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
    
    public int getPages(){
        return pages;
    }
    
   
    
}
