package b;

import java.util.NoSuchElementException;

public class List<T> {
    private Object[] array;
    private Node<T> head;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public List() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            increaseArrayCapacity();
        }
        array[size++] = element;
    }

    public void add(T element, int index) {
        try {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }
            if (size == array.length) {
                increaseArrayCapacity();
            }
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
            size++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }

    public void set(T element, int index) {
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            array[index] = element;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }

    public T remove() {
        try {
            if (size == 0) {
                throw new NoSuchElementException();
            }
            T element = (T) array[--size];
            array[size] = null;
            return element;
        } catch (NoSuchElementException e) {
            System.out.println("No such element");
            return null;
        }
    }

    public T remove(int index) {
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            T element = (T) array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
            return element;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public T get(int index) {
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            return (T) array[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public int size() {
        return size;
    }

    private void increaseArrayCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            next = null;
        }
    }
}
