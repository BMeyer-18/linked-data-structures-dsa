package org.linked_data_structures

/**
 * Runs all unit tests for the Queue class
 *
 * @throws RuntimeException if any test fails
 */
fun testQueue() {
    testEmptyQueue()
    testShortQueue()
    testLongQueue()
    testPoppedQueue()
    println("All tests passed for queues\n")
}


/**
 * Tests the isEmpty, peek, and dequeue functions on an empty queue of integers.
 *
 * @throws RuntimeException if a test fails
 */
fun testEmptyQueue() {
    val queue = Queue<Int>()

    if (!queue.isEmpty())
        throw RuntimeException("isEmpty failure: empty queue returned not empty")

    if(queue.peek() != null)
        throw RuntimeException("peek failure: empty queue returned not null")

    if(queue.dequeue() != null)
        throw RuntimeException("dequeue failure: empty queue returned not null")

    println("All tests passed for operations on empty queue")
}


/**
 * Tests enqueue, dequeue, isEmpty, and peek functions for a not-empty queue of strings.
 *
 * @throws RuntimeException if a test fails
 */
fun testShortQueue() {
    val queue = Queue<String>()
    queue.enqueue("item1")

    if (queue.isEmpty())
        throw RuntimeException("isEmpty or enqueue failure: 1-item queue returned empty")

    if (queue.peek() != "item1")
        throw RuntimeException("peek failure: 1-item queue returned wrong value")

    if (queue.peek() != "item1")
        throw RuntimeException("peek failure: 1-item queue returned wrong value")

    if (queue.dequeue() != "item1")
        throw RuntimeException("dequeue failure: 1-item queue returned wrong value")

    println("All tests passed for operations on short queue")
}


/**
 * Tests peek, dequeue, and isEmpty functions for a queue with >2 characters
 *
 * @throws RuntimeException if a test fails
 */
fun testLongQueue() {
    val queue = Queue<Char>()
    queue.enqueue('a')
    queue.enqueue('b')
    queue.enqueue('c')
    queue.enqueue('d')
    queue.enqueue('e')

    if (queue.isEmpty())
        throw RuntimeException("isEmpty failure: 5-item queue returned empty")

    if (queue.peek() != 'a')
        throw RuntimeException("peek failure: 5-item queue returned wrong value")

    if (queue.dequeue() != 'a')
        throw RuntimeException("dequeue failure: 5-item queue returned wrong value")

    if (queue.dequeue() != 'b')
        throw RuntimeException("dequeue failure: 4-item queue returned wrong value")

    if (queue.dequeue() != 'c')
        throw RuntimeException("dequeue failure: 3-item queue returned wrong value")

    if (queue.dequeue() != 'd')
        throw RuntimeException("dequeue failure: 2-item queue returned wrong value")

    if (queue.isEmpty())
        throw RuntimeException("isEmpty failure: 1-item queue returned empty")

    println("All tests passed for operations on long queue")
}


/**
 * Tests peek, dequeue, isEmpty functions for a queue that had its items removed, with booleans
 *
 * @throws RuntimeException if a test fails
 */
fun testPoppedQueue() {
    val queue = Queue<Boolean>()
    queue.enqueue(false)
    queue.enqueue(true)
    queue.enqueue(true)
    queue.dequeue()
    queue.dequeue()
    queue.dequeue()

    if (!queue.isEmpty())
        throw RuntimeException("isEmpty failure: emptied queue returned not empty")

    if(queue.peek() != null)
        throw RuntimeException("peek failure: emptied queue returned not null")

    if(queue.dequeue() != null)
        throw RuntimeException("dequeue failure: emptied queue returned not null")


    println("All tests passed for dequeued queue")
}