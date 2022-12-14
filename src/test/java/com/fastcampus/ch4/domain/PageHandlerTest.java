package com.fastcampus.ch4.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {
    @Test
    public void Test(){
        PageHandler ph = new PageHandler(250,1);
        ph.print();
        System.out.println("ph = " + ph);
        assertTrue(ph.getBeginPage() ==1);
        assertTrue(ph.getEndPage() ==10);
    }


    @Test
    public void Test2(){
        PageHandler ph = new PageHandler(250,11);
        ph.print();
        System.out.println("ph = " + ph);
        assertTrue(ph.getBeginPage() ==11);
        assertTrue(ph.getEndPage() ==20);
    }

    @Test
    public void Test3(){
        PageHandler ph = new PageHandler(255,26);
        ph.print();
        System.out.println("ph = " + ph);
        assertTrue(ph.getBeginPage() ==21);
        assertTrue(ph.getEndPage() ==26);
    }

    @Test
    public void Test4(){
        PageHandler ph = new PageHandler(255,10);
        ph.print();
        System.out.println("ph = " + ph);
        assertTrue(ph.getBeginPage() ==1);
        assertTrue(ph.getEndPage() ==10);
    }
}