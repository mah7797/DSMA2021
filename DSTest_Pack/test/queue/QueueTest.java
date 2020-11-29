/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

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
public class QueueTest {

    public QueueTest() {
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
    public void testQueueCreation() {
        Queue q = new Queue();
        Assert.assertTrue(q.size() == 0);
    }

    @Test
    public void testEnqueueDequeue() {
        Queue q = new Queue();
        final String item1 = "Item 1";
        q.enqueue(item1);
        Assert.assertTrue(q.size() == 1);

        final String item2 = "Item 2";
        q.enqueue(item2);
        Assert.assertTrue(q.size() == 2);

        final String item3 = "Item 3";
        q.enqueue(item3);
        Assert.assertTrue(q.size() == 3);

        final Object firstDequeued = q.dequeue();
        Assert.assertEquals("First item in must be the first out.", item1, firstDequeued);
        Assert.assertTrue(q.size() == 2);

        final Object secondDequeued = q.dequeue();
        Assert.assertTrue(secondDequeued.equals(item2));
        Assert.assertTrue(q.size() == 1);

        final Object thirdDequeued = q.dequeue();
        Assert.assertTrue(thirdDequeued.equals(item3));
        Assert.assertEquals(0, q.size());
    }

    @Test(expected = Exception.class)
    public void testWrongDequeueOnEmpty() {
        Queue q = new Queue();
        q.dequeue();
    }
}
