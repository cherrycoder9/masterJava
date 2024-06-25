package day14.step7;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
        // add(): 리스트에 요소를 추가하는 함수
        // size(): 리스트내 요소들의 개수를 반환하는 함수
        // remove(index): 리스트의 해당 요소 인덱스 삭제
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
