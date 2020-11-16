/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llist;

import list.ArrayList;
import list.LinkedList;
import list.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Bilal
 */
public class List2Test {

    public List2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCreate() {
        List list = new ArrayList();
        checkIfEmpty(list);
        list = new LinkedList();
        checkIfEmpty(list);
    }

    private void checkIfEmpty(List list) {
        Assert.assertTrue("When created, a list is expected to be empty.", list.size() == 0);
    }

    @Test
    public void testAddRemove() {
        List list = new ArrayList();
        testAddRemove(list);
        list = new LinkedList();
        // testAddRemove(list);
    }

    private void testAddRemove(List list) {
        final Object elt1 = new Object();
        list.add(elt1);
        Assert.assertTrue(list.size() == 1);
        final Object elt2 = new Object();
        list.add(elt2);
        Assert.assertTrue(list.size() == 2);
        final Object elt = list.remove(1);
        Assert.assertTrue(elt == elt2);
        Assert.assertTrue(list.size() == 1);
        final boolean isRemoved = list.remove(elt1);
        Assert.assertTrue(isRemoved);
        Assert.assertTrue(list.size() == 0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testWrongRemove() {
        List list = new ArrayList();
        list.remove(0);
    }
}
