package com.example.demo;

import com.example.demo.nums.AddNum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AddNumTest {


    @Test
    public void addTwoNumTest(){
        assertEquals(5, AddNum.addTwoNum(2,3));
    }
}
