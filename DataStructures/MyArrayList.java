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

    }

    public int get(int index) {
        /* Returns the Integer at the given index.
         * Throw an IllegalArgumentException if index is out of bounds.
         * */

        // YOUR CODE HERE

    }

    public void add(int value) {
        /* Adds a value to the end of the list. May need to call resize if out of space. */

        // YOUR CODE HERE

    }

    public boolean set(int index, int value) {
        /* Sets the value at the given index and returns whether it was successful or not */

        // YOUR CODE HERE

    }

    public int remove(int index) {
        /* Removes the value at the given index and returns it. Returns -1 if the index is out of bounds.
         *
         * Throw an IllegalArgumentException if index is out of bounds.
         *
         * Hint: Use System.arraycopy(...). Use Google to read the documentation.
         * Also do not forget to resize when necessary.
         *
         * */

        // YOUR CODE HERE

    }

    private void resize(int newSize) {
        /* This helper method might be helpful...
         *
         * Hint: Use System.arraycopy(...). Use Google to read the documentation.
         *
         * */

        // YOUR CODE HERE

    }

    public int getSize() {
        /* Returns size of the ArrayList */

        // YOUR CODE HERE

    }

    public int getArraySize() {
        /* For testing purposes only */
        return lst.length;
    }

}