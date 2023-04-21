package ss8_dsa.BT;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elementArr[];

    public MyList() {
        elementArr = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
       this.size = capacity;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= elementArr.length) {
            E[] newArr = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elementArr, 0, newArr, 0, minCapacity);
            elementArr = newArr;
        }
    }
    void add(int index, E element) {
        ensureCapacity(size + 1);
        System.arraycopy(elementArr, index, element, index + 1, size - index);
        elementArr[index] = element;
        size++;
    }
    public E remove(int index) {
        E oldValue = (E) elementArr[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementArr, index + 1, elementArr, index, numMoved);
            elementArr[--size] = null;
            return oldValue;
        }
        return oldValue;
    }
    public int size(){
        return this.size;
    }
    public Object clone() {
        MyList<E> newArr = new MyList<>();
        newArr.elementArr = Arrays.copyOf(elementArr, size);
        newArr.size=size;
        return newArr;
    }
    public int indexOf(E o) {
        for (int j = 0; j < size; j++) {
            if (o.equals(elementArr[j])) {
                return j;
            }
        }
        return -1;
    }
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }
    boolean add(E e) {
        ensureCapacity(size + 1);
        elementArr[size++] = e;
        return true;
    }
    E get(int i) {
        return (E) this.elementArr[i];
    }
    void clear() {
        for (int i = 0; i < size; i++) {
            elementArr[i] = null;
        }
        size = 0;
    }

}
