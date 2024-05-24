package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY=5; // 수정불가(final)=>상수
    private Book[] elements;
    private int size=0;
    public BookArray() {
        elements=new int[DEFAULT_CAPACITY]; // 5개 크기 배열
    }
    // 저장하는 동작
    public void add(Book element){
        if(size==elements.length) {
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;

    }
    // 얻는 동작
    public Book get(int index){ // -1, 5~
        // index 체크 if
        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }
    public void ensureCapacity(){
        int newCapacity=elements.length*2;
        elements=Arrays.copyOf(elements, newCapacity);
    }
}
