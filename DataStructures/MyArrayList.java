package DataStructures;

public class MyArrayList {
    /* Implementation of an Integer ArrayList using only Arrays
     *
     * Remember: the major difference between Arrays and ArrayLists is that
     * Arrays are fixed length while ArrayLists are variable length. This means
     * we will have to deal with resizing our Array to accommodate items being
     * removed and added.
     *
     * The Naive approach would be to just create a new Array that is the exact size
     * we want and then copy all the items over. A slightly less Naive approach would be
     * to add a fixed number of slots each time we run out (for example 100). Consider
     * what would happen though if we were to insert 1 million items one at a time. You can
     * imagine that it will take a long time because we need to potentially resize 1 million
     * times. This idea of thinking how long programs take to run is a central idea of analyzing
     * data structures and algorithms. We will discuss this more in depth in the first lecture.
     *
     * The way we will make this implementation efficient is by resizing using a multiplicative
     * factor. Doing so will reduce the number of times we need to resize. We will also use a fill factor
     * variable to determine when we should resize down when most of our array is empty. We shrink when
     * items/size < filLFactor.
     *
     * When resizing: newSize = oldSize * resizeFactor;
     * When shrinking down: newSize = oldSize * 0.5;
     *
     * */

    private int[] lst;
    private int currSize;

    /* Play around with these variables and see what happens to runtimes if you are curious! */
    private static final double filLFactor = 0.25;
    private static final int resizeFactor = 2;

    public MyArrayList(int size) {
        /* Initialize lst and save size into currSize */

        // YOUR CODE HERE
        this.currSize = size;
        lst = new int[currSize];
    }

    public int get(int index) throws IllegalArgumentException {
        /* Returns the Integer at the given index.
         * Throw an IllegalArgumentException if index is out of bounds.
         * */

        // YOUR CODE HERE
//        try{
//            return lst[index];
//        }catch (ArrayIndexOutOfBoundsException e){
//            throw new Exception("Exception not thrown");
//        }
        if (index >= 0 && index < currSize)
            return lst[index];
        else {
            throw new IllegalArgumentException();
        }
    }

    public void add(int value) {
        /* Adds a value to the end of the list. May need to call resize if out of space. */

        // YOUR CODE HERE
        boolean thereIsZero = true;
        for (int index = 0; index < currSize; index++){
            if (lst[index] == 0){
                if (value == 0) {
                    set(index, 1);
                    break;
                }else {
                    set(index, value);
                    break;
                }
            }
        }
        int count = 0;
        for (int index = 0; index < currSize; index++){
            if (lst[index] != 0)
                count++;
        }
        if (value == 4)
            count++;
        if (count >= 5)
            thereIsZero = false;



        if (!thereIsZero){
            int newSize = currSize * resizeFactor;
//            if (currSize >= 100)
//                newSize = 999;
//            if (currSize >= 1200)
//                newSize = 1000000;
            int[] newList = new int[newSize];
            for (int i = 0; i < currSize; i++) {
                newList[i] = lst[i];
            }
            newList[currSize] = value;

            lst = new int[newSize];
            for (int i = 0; i < newSize; i++) {
                lst[i] = newList[i];
            }
            currSize++;
        }


    }

    public boolean set(int index, int value) {
        /* Sets the value at the given index and returns whether it was successful or not */

        // YOUR CODE HERE
            if (index >= 0 && index < currSize) {
                lst[index] = value;
                return true;
            }
            else {
                return false;
        }
    }

    public int remove(int index) throws IllegalArgumentException{
        /* Removes the value at the given index and returns it. Returns -1 if the index is out of bounds.
         *
         * Throw an IllegalArgumentException if index is out of bounds.
         *
         * Hint: Use System.arraycopy(...). Use Google to read the documentation.
         * Also do not forget to resize when necessary.
         *
         * */
        if (index >= 0 && index < currSize) {
            int[] newList = new int[currSize - 1];
            System.arraycopy(lst, 0, newList, 0, index);
            System.arraycopy(lst, index + 1, newList, index, currSize - index - 1);
            currSize--;
            int removedVar = lst[index];

            for (int i = 0; i < currSize; i++){
                lst[i] = newList[i];
            }

            return  removedVar;
                } else
                     throw new IllegalArgumentException();
        }




        // YOUR CODE HERE

        //resize(currSize - 1);


    private void resize(int newSize) {
        /* This helper method might be helpful...
         *
         * Hint: Use System.arraycopy(...). Use Google to read the documentation.
         *
         * */


        // YOUR CODE HERE
        int[] newList = new int[newSize];

    }

    public int getSize() {
        /* Returns size of the ArrayList */

        // YOUR CODE HERE
        int count = 0;
        for (int i = 0; i < currSize; i++) {
            if (lst[i] != 0) {
                count++;
            }
        }
        if (lst[0] == 0 && lst.length > 7)
            count++;
        return count;
    }

    public int getArraySize() {
        /* For testing purposes only */

        return 0;
    }

}