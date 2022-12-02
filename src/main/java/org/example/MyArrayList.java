package org.example;

import java.util.Arrays;

public class MyArrayList implements IntList {

    private Integer[] data;
    private int size = 0;

    public MyArrayList() {
        this.data = new Integer[]{};
    }

    @Override
    public Integer add(Integer item) {
        return add(size, item);
    }

    @Override
    public Integer add(int index, Integer item) {
        checkItem(item);

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Wrong index");
        }

        if (size + 1 > data.length) {
            grow();
        }
        System.arraycopy(this.data, index, this.data, index + 1, size - index);
        this.data[index] = item;

        this.size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        checkItem(item);
        checkIndex(index);
        this.data[index] = item;
        return item;
    }

    @Override
    public Integer remove(Integer item) {
        int elementIndex = indexOf(item);
        if (elementIndex == -1) {
            throw new IllegalArgumentException("Failed to find the elements to remove ");
        }
        return remove(elementIndex);
    }

    @Override
    public Integer remove(int index) {
        checkIndex(index);
        Integer elem = this.data[index];
        this.data[index] = null;
        if (index < size - 1) {
            System.arraycopy(this.data, index + 1, this.data, index, size - index - 1);
        }
        size--;
        this.data[index] = null;
        return elem;
    }

    @Override
    public boolean contains(Integer item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(Integer item) {
        checkItem(item);
        for (int i = 0; i < this.size; i++) {
            if (this.data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        checkItem(item);
        for (int i = size - 1; i >= 0; i--) {
            if (item.equals(this.data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        checkIndex(index);
        return this.data[index];
    }

    @Override
    public boolean equals(MyArrayList otherList) {
        if (otherList == null) {
            return false;
        }
        MyArrayList otherMyArrayList = (MyArrayList) otherList;
        if (otherMyArrayList.size != this.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!this.data[i].equals(otherMyArrayList.data[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            this.data[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Integer[] toArray() {
        Integer[] Integers = new Integer[size];
        System.arraycopy(this.data, 0, Integers, 0, size);
        return Integers;
    }

    private void grownIfNeeded(){
        if(size == data.length){
            grow();
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Wrong index");
        }
    }

    private void checkItem(Integer item) {
        if (item == null) {
            throw new IllegalArgumentException("Value in list cannot be null");
        }
    }

    private void grow() {
        this.data = Arrays.copyOf(this.data, size + size/2);
    }

    public class IntegerList {
    }

    private void sort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            while (j>0 && array[j-1] >= tmp){
                array[i] = array[j-1];
                j--;
            }
            array[j]= tmp;
        }
    }
    private int binarySearch(int[] array,int element){
        int min = 0;
        int max = array.length - 1;
        while ((min <= max)){
            int mid= (min + max)/2;
            if(element == array[mid]){
                return mid;
            }
            if(element < array[mid]){
                max = mid -1;
            }
            else{
                min = mid +1;
            }
        }
        return -1;
    }
}
