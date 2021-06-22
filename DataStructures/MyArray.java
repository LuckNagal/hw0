package DataStructures;

import java.util.ArrayList;

public class MyArray {
    /* Implementation of an Integer Array using only ArrayLists */

    private final int size;
    private final ArrayList<Integer> lst;

    public MyArray(int size) {
        /* Save the size into the size variable and initialize lst.
         *  Make sure to fill the internal ArrayList with 0s up to size initially.
         */
        this.size = size;
        lst = new ArrayList<Integer>(size);
        for(int i=0;i<size;i++ ){
            lst.add(i,0);
        }

    }

    public int get(int index) throws IllegalArgumentException {
        /* Returns the Integer at the given index.
         * Throw an IllegalArgumentException if index is out of bounds.
         * */

        // YOUR CODE HERE
        if (index >= 0 && index < size)
           return lst.get(index);
        else {
            throw new IllegalArgumentException();
        }
    }

    public boolean set(int index, int value) throws IndexOutOfBoundsException{
        /* Sets the value at the given index and returns whether it was successful or not */

        // YOUR CODE HERE
        boolean setBool = false;
        if(index < lst.size() && index >= 0){
            if (lst.get(index) == lst.set(index, value)) {
                setBool = true;
            }
        }
        return setBool;


    }

    public int getSize() {
        /* Returns size of the Array */

        // YOUR CODE HERE

        return lst.size();
    }
}
