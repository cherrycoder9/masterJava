package day08.step2;

public class Bookmain {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("책이름1", "저자1");
        library[1] = new Book("책이름2", "저자2");
        library[2] = new Book("책이름3", "저자3");
        library[3] = new Book("책이름4", "저자4");
        library[4] = new Book("책이름5", "저자5");
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            // System.out.println(library[i].getBookName()); // 널포인터익셉션
            // 객체가 null일때 도트연산자 사용 불가능
            library[i].showBookInfo();
        }

    }
}
