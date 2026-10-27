public class Book {
    String title;
    String author;

    Book (String someTitle, String someAuthor) {
        this.author = someAuthor;
        this.title = someTitle;
    }

    String getTitle () {
        return this.title;
    }

    String getAuthor () {
        return this.author;
    }

    void setTitle (String newTitle) {
        this.title = newTitle;
    }

    void setAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    public void printInfo () {
        System.out.println("Название книги: " + this.title + ", Автор книги: " + this.author);
    }
}
