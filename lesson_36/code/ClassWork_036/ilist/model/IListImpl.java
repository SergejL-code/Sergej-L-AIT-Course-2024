package ClassWork_036.ilist.model;

import java.util.Arrays;
import java.util.Iterator;


public class IListImpl<E> implements IList<E> {

    Object[] elements;
    private int size;

    public IListImpl(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity" + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    public IListImpl() {
        this(10);//начальный массив на 10 элементов
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(Object element) {
        ensureCapacity();
        elements[size++] = element;//ставим элемент в конец
        return true;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError("überfordert");
            }
            //  int newCapacity = elements;
            int newCapacity = elements.length + elements.length / 2;
            elements = Arrays.copyOf(elements, newCapacity);
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }


    @Override
    public boolean add(int index, Object element) {
        if (index == size) {//добавление в конец массива
            add(element);
            return true;
        }
        //добавление в середину массива
        checkIndex(index);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size++ - index);
        elements[index] = element;
        return true;
    }

    private void checkIndex(int index) {
        //индекс не может быть <0 и больше size
        if (index < 0 || index > 0) {
            throw new IndexOutOfBoundsException("Wrong index " + index);
        }
    }
    //удаляем элемент
    @Override
    public E remove(int index) {
        checkIndex(index);
        E el=(E) elements[index];
        System.arraycopy(elements,index+1,elements,index,--size-index);
        elements[size]=null;
        /*/    После выполнения System.arraycopy, когда элементы сдвигаются на одну позицию назад,
//    последний элемент становится дублированным на предпоследней позиции.
//    Затирание последнего элемента elements[size] = null; выполняется для очистки этой дублированной позиции,
//    иначе в списке может остаться ссылка на ненужный объект, что может вызвать утечку памяти.
//    Этот шаг необходим для правильной работы списка и предотвращения утечек памяти. В Java объекты не удаляются
//    сразу после вызова remove, и сборка мусора может произойти позже. Поэтому затирание последнего элемента является
//    хорошей практикой для избежания утечек памяти.*/
        return el;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E updated= (E)elements[index];
        elements[index]=element;
        return updated;
    }

    @Override
    public int indexOf(Object o) {
        if(o!=null){
            for (int i = 0; i < size; i++) {
                if(elements[i].equals(o)){
                    return i;
                }
            }
        }else{
            for (int i = 0; i < size; i++) {
                if(elements[i]== null){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int LastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i=0;//указатель на текущий элемент коллекций

            @Override
            public boolean hasNext() {//true, когда "указатель" находится внутри коллекции
                return i<size;//true
            }

            @Override
            public Object next() {
                return (E)elements[i++];
            }
        };
    }
}
