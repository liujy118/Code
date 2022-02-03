package code;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author K
 * @Description 剑指 Offer 59 - II. 队列的最大值
 * @Mark
 * @Date 2022/2/3 20:14
 * @EndTime 20.21
 **/
public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.pollLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        int value = queue.isEmpty() ? -1 : queue.poll();
        if (!deque.isEmpty() && deque.peekFirst().equals(value)) {
            deque.pollFirst();
        }
        return value;
    }
}