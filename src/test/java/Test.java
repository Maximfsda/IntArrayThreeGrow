import org.example.IntList;
import org.example.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class Test {
    private IntList intLists;

    @BeforeEach
    public void setUp() {
        this.intLists = new MyArrayList();
    }

    @org.junit.jupiter.api.Test
    public void whenItemAddedThenItCanBeFoundItList() {
        this.intLists.add(1);
        Assertions.assertEquals(1, this.intLists.size());
    }

    @org.junit.jupiter.api.Test
    public void whenItemAddedToSpecificIndexWhenElementsIsShiftedRight() {
        this.intLists.add(0);
        this.intLists.add(0, 1);
        this.intLists.add(1, 2);
        Assertions.assertEquals(3, this.intLists.size());
        Assertions.assertEquals(1, this.intLists.get(0));
        Assertions.assertEquals(2, this.intLists.get(1));
        Assertions.assertEquals(0, this.intLists.get(2));
    }

    @org.junit.jupiter.api.Test
    public void whenValueIsSetWhenGetReturnsThisValue() {
        this.intLists.add(1);
        this.intLists.add(2);
        this.intLists.add(3);

        this.intLists.set(1, 5);
        Assertions.assertEquals(3, this.intLists.size());
        Assertions.assertEquals(5, this.intLists.get(1));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedInListThenIndexOfReturnsFirst() {
        this.intLists.add(1);
        this.intLists.add(2);
        Assertions.assertEquals(0, this.intLists.indexOf(1));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedInListThenIndexOfUnknownReturnsMinusOne() {
        this.intLists.add(1);
        this.intLists.add(2);
        Assertions.assertEquals(-1, this.intLists.indexOf(5));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedInListThenLastIndexOfReturnsSecond() {
        this.intLists.add(1);
        this.intLists.add(2);

        Assertions.assertEquals(0, this.intLists.indexOf(1));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedAndSecondRemovedTheSizeIsOne() {
        this.intLists.add(1);
        this.intLists.add(2);
        this.intLists.remove(1);
        Assertions.assertEquals(1, this.intLists.size());
        Assertions.assertEquals(1, this.intLists.get(0));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedAndFirstRemovedTheSizeIsOne() {
        this.intLists.add(1);
        this.intLists.add(2);
        this.intLists.remove(1);
        Assertions.assertEquals(1, this.intLists.size());
        Assertions.assertEquals(1, this.intLists.get(0));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedAndSecondRemovedTheSizeIsTwo() {
        this.intLists.add(1);
        this.intLists.add(2);
        this.intLists.add(3);
        this.intLists.remove(2);
        Assertions.assertEquals(2, this.intLists.size());
        Assertions.assertEquals(1, this.intLists.get(0));
        Assertions.assertEquals(2, this.intLists.get(1));
    }

    @org.junit.jupiter.api.Test
    public void whenElementsAddedAndClearIsCalledThenListIsEmpty() {
        this.intLists.add(1);
        this.intLists.add(2);
        this.intLists.add(3);
        this.intLists.clear();
        Assertions.assertTrue(this.intLists.isEmpty());
        Assertions.assertEquals(0, this.intLists.size());

    }

    @org.junit.jupiter.api.Test
    public void clear() {
        this.intLists.add(1);
        this.intLists.add(2);
        this.intLists.add(3);
        this.intLists.clear();
        Assertions.assertTrue(this.intLists.isEmpty());
        Assertions.assertEquals(0, this.intLists.size());

    }
}

