package HomeWork_21.find_min_max_numbers_and_min_max_index_in_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArraysTest {


    MyArrays myArrays;
    int[] musterArrays = {5, 4, -1, -7, 4, 15, 3, -2};

    @BeforeEach
    void setUp() {

        myArrays = new MyArrays(musterArrays);

    }

    @Test
    void sucheMin() { //expected -7
        int expected = -7;
        int actuel = myArrays.sucheMin(musterArrays);
        assertEquals(expected, actuel);
    }

    @Test
    void sucheMaxx() {
        int expected = 15;
        int actual = myArrays.sucheMaxx(musterArrays);
        assertEquals(expected, actual);
    }

    @Test
    void sucheMinIndex() {

        int expected = 3;//element -7,index 3
        int actual = myArrays.sucheMinIndex(musterArrays);
        assertEquals(expected, actual);

    }

    @Test
    void sucheMaxIndex() {//element 15, index 5
        int expected = 5;
        int actual = myArrays.sucheMaxIndex(musterArrays);
        assertEquals(expected, actual);
    }
}//end of class