import java.lang.String;
public class Book implements Comparable<Book>{
    private String bookName;
    private int pageNum;
    private int ID;

    public Book(int ID, String bookName, int pageNum) {
        this.ID = ID;
        this.bookName = bookName;
        this.pageNum = pageNum;

    }
    public int compareTo (Book c){
        return this.bookName.compareTo(c.bookName);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
