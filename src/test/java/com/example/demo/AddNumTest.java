package com.example.demo;

import com.example.demo.nums.AddNum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AddNumTest {


    @Test
    public void addTwoNumTest(){
        assertEquals(5, AddNum.addTwoNum(2,3));
    }

    @Test
    public void subTwoNum(){
        assertEquals(5,AddNum.subTwoNum(10,5));
    }

    @Test
    public void addThreeNumTest(){
        assertEquals(15,AddNum.addThreeNum(5,5,5));
    }

    @Test
    public void duplicateTest(){
        assertEquals(8,AddNum.duplicate(4));
    }
}
