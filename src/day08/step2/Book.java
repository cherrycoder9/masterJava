package day08.step2;

public class Book {
    // 1. 멤버변수/필드
    private String bookName;
    private String author;

    // 2. 생성자
    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    // 3. 메소드
    // 1. 일반 함수
    public void showBookInfo() {
        System.out.println(bookName + ", " + author);
    }


    // 2. 게터 세터
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
