import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        Book b1 = new Book(1,"Kızıl Soruşturma",160);
        Book b2 = new Book(2,"Satranç",88);
        Book b3 = new Book(3,"Dönüşüm",102);
        Book b4 = new Book(4,"Fareler ve İnsanlar",111);
        Book b5 = new Book(5,"Savaş sanatı",80);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("Kitap adına göre sıralama...");
        System.out.printf("%3s %-24s %-10s\n", "#ID","KitapAdı","SayfaSayısı");

        for (Book book : books){
            System.out.printf("%3d %-24s %-10d\n",book.getID(), book.getBookName(), book.getPageNum());
        }

        TreeSet<Book> bookSortedPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o2.getPageNum(), o1.getPageNum());
            }
        });

        bookSortedPageNum.addAll(books);

        System.out.println();
        System.out.println("Sayfa sayısına göre sıralama...");
        System.out.printf("%3s %-24s %-10s\n", "#ID","KitapAdı","SayfaSayısı");

        for (Book book : bookSortedPageNum){
            System.out.printf("%3d %-24s %-10d\n",book.getID(), book.getBookName(), book.getPageNum());
        }
    }
}