import org.junit.*;

import DataStructures.*;

public class DataStructuresTests {

    MyArray array;
    MyArrayList arrayList;

    @Before
    public void init() {
        array = new MyArray(4);
        arrayList = new MyArrayList(4);
    }

    @Test
    public void testArraySimpleSetAndGet() throws Exception {
        Assert.assertTrue(array.set(0, 1));
        Assert.assertEquals(1, array.get(0));
    }

    @Test
    public void testArraySetException() {
        Assert.assertFalse(array.set(-1, 1));
    }

    @Test
    public void testArrayGetException() throws Exception {
        try {
            array.get(-1);
            Assert.fail("Exception not thrown");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testArraySize() {
        Assert.assertEquals(4, array.getSize());
    }

    @Test
    public void testArrayComplete() throws Exception {
        Assert.assertTrue(array.set(0, 1));
        Assert.assertTrue(array.set(3, 8));
        Assert.assertEquals(1, array.get(0));
        Assert.assertFalse(array.set(4, 2));
        Assert.assertEquals(1, array.get(0));
        Assert.assertTrue(array.set(0, 9));
        Assert.assertEquals(9, array.get(0));
        Assert.assertEquals(8, array.get(3));
    }

    @Test
    public void testArrayListSimpleAddSetAndGet() {
        arrayList.add(4);
        arrayList.add(3);
        Assert.assertTrue(arrayList.set(1, 1));
        Assert.assertEquals(4, arrayList.get(0));
        Assert.assertEquals(1, arrayList.get(1));
    }

    @Test public void testArrayListSimpleRemove() {
        arrayList.add(4);
        arrayList.add(3);
        Assert.assertEquals(2, arrayList.getSize());
        Assert.assertEquals(4, arrayList.remove(0));
        Assert.assertEquals(3, arrayList.remove(0));
        Assert.assertEquals(0, arrayList.getSize());
    }

    @Test
    public void testArrayListGetException() {
        try {
            arrayList.get(-1);
            Assert.fail("Exception not thrown");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testArrayListSetException() {
        Assert.assertFalse(arrayList.set(-1, 1));
    }

    @Test (timeout = 100)
    public void testAddResize() {
        /* If you timeout on this test, it probably means you are resizing using Naive method. */
        Assert.assertEquals(0, arrayList.getSize());
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        Assert.assertEquals(1000000, arrayList.getSize());
        Assert.assertEquals(Math.pow(2, 20), arrayList.getArraySize(), 0);

        for (int i = 0; i < 1000000; i++) {
            Assert.assertEquals(i, arrayList.get(i));
        }
    }

    @Test
    public void testAddThenRemoveResize() {
        Assert.assertEquals(0, arrayList.getSize());
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
// change to 1000
        Assert.assertEquals(1000, arrayList.getSize());
        Assert.assertEquals(Math.pow(2, 10), arrayList.getArraySize(), 0);

        for (int i = 0; i < 1000; i++) {
            Assert.assertEquals(i, arrayList.get(i));
        }

        for (int i = 0; i < 900; i++) {
            Assert.assertEquals(i, arrayList.remove(0));
        }

        Assert.assertEquals(100, arrayList.getSize());
        Assert.assertEquals(Math.pow(2, 10) / 4, arrayList.getArraySize(), 0);

    }

}
