package com.fastcampus.ch4.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {
    @Test
    public void Test(){
        PageHandler ph = new PageHandler(250,1);
        ph.print();
        System.out.println("ph = " + ph);
        assertTrue(ph.beginPage==1);
        assertTrue(ph.endPage==10);
    }


    @Test
    public void Test2(){
        PageHandler ph = new PageHandler(250,11);
        ph.print();
        System.out.println("ph = " + ph);
        assertTrue(ph.beginPage==11);
        assertTrue(ph.endPage==20);
    }

    @Test
    public void Test3(){
        PageHandler ph = new PageHandler(255,26);
        ph.print();
        System.out.println("ph = " + ph);
        assertTrue(ph.beginPage==21);
        assertTrue(ph.endPage==26);
    }
}