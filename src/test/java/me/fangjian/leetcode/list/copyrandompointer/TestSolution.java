package me.fangjian.leetcode.list.copyrandompointer;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

/**
 * Created at 7/28/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class TestSolution {
    @Test
    public void testNull(){
        assertEquals(new Solution().copyRandomList(null), null);
    }

    @Test
    public void testMultipleNodes(){
        RandomListNode[] nodes = new RandomListNode[]{
          new RandomListNode(1),
          new RandomListNode(2),
          new RandomListNode(3),
          new RandomListNode(4)
        };
        nodes[0].next = nodes[1];
        nodes[0].random = nodes[2];
        nodes[1].next = nodes[2];
        nodes[1].random = nodes[2];
        nodes[2].next = nodes[3];
        nodes[2].random = null;
        nodes[3].next = null;
        nodes[3].random = nodes[3];

        RandomListNode newNode = new Solution().copyRandomList(nodes[0]);
        RandomListNode p1 = nodes[0], p2 = newNode;
        while(p1 != null && p2 != null){
            assertEquals(p2.label, p1.label);
            if(p1.next == null){
                assertEquals(p2.next, null);
            } else {
                assertEquals(p2.next.label, p1.next.label);
            }
            if(p1.random == null){
                assertEquals(p2.random, null);
            } else {
                assertEquals(p2.random.label, p1.random.label);
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        assertEquals(p2, null);
    }
}
