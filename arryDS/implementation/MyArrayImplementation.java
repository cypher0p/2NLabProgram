package arryDS.implementation;

import arryDS.myinterface.MyArray;

public class MyArrayImplementation
            implements MyArray {
    private int[] arr;
    private int index;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public MyArrayImplementation(int size) {
        arr = new int[size];
        index = 0;
    }

    @Override
    public void traverse() {
        System.out.println("printing elements");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i] + ", ");
        }
        System.out.println();
    }

    @Override
    public boolean insert(int element) {
        boolean response = false;
        if (index != arr.length) {
            arr[index] = element;
            index++;
            response = true;
        }
        return response;
    }
}
