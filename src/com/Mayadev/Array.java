package com.Mayadev;

import java.util.Arrays;

public class Array {
    private int [] numbers;
    private int count = 0;
    public Array(int length)
    {
        numbers = new int[length];

    }
    public void insert(int number)
    {
        //If the Array is Full
        if(numbers.length == count)
        {
            //Create an Array twice the size of Previous Array
            int[] newnumbers = new int[count*2];
            //Copy All the existing items
            for (int i = 0; i<count;i++)
            {

                newnumbers[i] = numbers[i];
            }
            // Set "numbers" to this new array
            numbers = newnumbers;
        }
        numbers[count++] = number;
    }
    public void print(){
        for(int i = 0; i<count;i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public void removeAt(int index){
        //validate the index
        if (index < 0 || index >= count)
        {
            throw new IllegalArgumentException();
        }
        //shift the items to left to fill the hole
        // [10,20,30]
        // index:1
        // 1 <- 2
        //2 <- 3
        for(int i = index; i<count; i++)
        {
            numbers[i] = numbers[i+1];
        }
        count--;

    }
    public int indexof(int element){
        for(int i = 0; i< count;i++) {
            if (numbers[i] == element) {
                return i;
            }
        }
        return -1;
    }
    }









    //Synatx of an array declaration
//	int [] numbers = new int[3];
//	numbers[0] = 10;
//	numbers[1] = 20;
//	numbers[2] = 30;
    //Shortcut
//    int [] numbers = {10,20,30};
//        System.out.println(numbers.length);
                //System.out.println(Arrays.toString(numbers));