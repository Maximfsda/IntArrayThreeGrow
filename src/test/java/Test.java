import org.example.IntList;
import org.example.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class Test {
    private IntList intList;

    @BeforeEach
    public void setUp() {
        this.intList = new MyArrayList();
    }

    @org.junit.jupiter.api.Test
    public void whenItemAddedThenItCanBeFoundItList() {
        this.intList.add(1);
        Assertions.assertEquals(1, this.intList.size());
    }

    @org.junit.jupiter.api.Test
    public void whenItemAddedToSpecificIndexWhenElementsIsShiftedRight() {
        this.intList.add(0);
        this.intList.add(0, 1);
        this.intList.add(1, 2);
        Assertions.assertEquals(3, this.intList.size());
        Assertions.assertEquals(1, this.intList.get(0));
        Assertions.assertEquals(2, this.intList.get(1));
        Assertions.assertEquals(0, this.intList.get(2));
    }

    @org.junit.jupiter.api.Test
    public void whenValueIsSetWhenGetReturnsThisValue() {
        this.intList.add(1);
        this.intList.add(2);
        this.intList.add(3);

        this.intList.set(1, 5);
        Assertions.assertEquals(3, this.intList.size());
        Assertions.assertEquals(5, this.intList.get(1));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedInListThenIndexOfReturnsFirst() {
        this.intList.add(1);
        this.intList.add(2);
        Assertions.assertEquals(0, this.intList.indexOf(1));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedInListThenIndexOfUnknownReturnsMinusOne() {
        this.intList.add(1);
        this.intList.add(2);
        Assertions.assertEquals(-1, this.intList.indexOf(5));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedInListThenLastIndexOfReturnsSecond() {
        this.intList.add(1);
        this.intList.add(2);

        Assertions.assertEquals(0, this.intList.indexOf(1));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedAndSecondRemovedTheSizeIsOne() {
        this.intList.add(1);
        this.intList.add(2);
        this.intList.remove(1);
        Assertions.assertEquals(1, this.intList.size());
        Assertions.assertEquals(1, this.intList.get(0));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedAndFirstRemovedTheSizeIsOne() {
        this.intList.add(1);
        this.intList.add(2);
        this.intList.remove(1);
        Assertions.assertEquals(1, this.intList.size());
        Assertions.assertEquals(1, this.intList.get(0));
    }

    @org.junit.jupiter.api.Test
    public void whenTwoElementsAddedAndSecondRemovedTheSizeIsTwo() {
        this.intList.add(1);
        this.intList.add(2);
        this.intList.add(3);
        this.intList.remove(2);
        Assertions.assertEquals(2, this.intList.size());
        Assertions.assertEquals(1, this.intList.get(0));
        Assertions.assertEquals(2, this.intList.get(1));
    }

    @org.junit.jupiter.api.Test
    public void whenElementsAddedAndClearIsCalledThenListIsEmpty() {
        this.intList.add(1);
        this.intList.add(2);
        this.intList.add(3);
        this.intList.clear();
        Assertions.assertTrue(this.intList.isEmpty());
        Assertions.assertEquals(0, this.intList.size());

    }

    @org.junit.jupiter.api.Test
    public void clear() {
        this.intList.add(1);
        this.intList.add(2);
        this.intList.add(3);
        this.intList.clear();
        Assertions.assertTrue(this.intList.isEmpty());
        Assertions.assertEquals(0, this.intList.size());

    }
}

