package org.linked_data_structures

/**
 * Runs all unit tests for the Stack class
 *
 * @throws RuntimeException if any test fails
 */
fun testStack() {
    testEmptyStack()
    testShortStack()
    testLongStack()
    testPoppedStack()
    println("All tests passed for stacks\n")
}


/**
 * Tests the isEmpty, peek, and pop functions on an empty stack of integers.
 *
 * @throws RuntimeException if a test fails
 */
fun testEmptyStack() {
    val stack = Stack<Int>()

    if (!stack.isEmpty())
        throw RuntimeException("isEmpty failure: empty stack returned not empty")

    if(stack.peek() != null)
        throw RuntimeException("peek failure: empty stack returned not null")

    if(stack.pop() != null)
        throw RuntimeException("pop failure: empty stack returned not null")

    println("All tests passed for operations on empty stack")
}


/**
 * Tests push, pop, isEmpty, and peek functions for a not-empty stack of strings.
 *
 * @throws RuntimeException if a test fails
 */
fun testShortStack() {
    val stack = Stack<String>()
    stack.push("item1")

    if (stack.isEmpty())
        throw RuntimeException("isEmpty or push failure: 1-item stack returned empty")

    if (stack.peek() != "item1")
        throw RuntimeException("peek failure: 1-item stack returned wrong value")

    if (stack.peek() != "item1")
        throw RuntimeException("peek failure: 1-item stack returned wrong value")

    if (stack.pop() != "item1")
        throw RuntimeException("pop failure: 1-item stack returned wrong value")

    println("All tests passed for operations on short stack")
}


/**
 * Tests peek, pop, and isEmpty functions for a stack with >2 characters
 *
 * @throws RuntimeException if a test fails
 */
fun testLongStack() {
    val stack = Stack<Char>()
    stack.push('a')
    stack.push('b')
    stack.push('c')
    stack.push('d')
    stack.push('e')

    if (stack.isEmpty())
        throw RuntimeException("isEmpty failure: 5-item stack returned empty")

    if (stack.peek() != 'e')
        throw RuntimeException("peek failure: 5-item stack returned wrong value")

    if (stack.pop() != 'e')
        throw RuntimeException("pop failure: 5-item stack returned wrong value")

    if (stack.pop() != 'd')
        throw RuntimeException("pop failure: 4-item stack returned wrong value")

    if (stack.pop() != 'c')
        throw RuntimeException("pop failure: 3-item stack returned wrong value")

    if (stack.pop() != 'b')
        throw RuntimeException("pop failure: 2-item stack returned wrong value")

    if (stack.isEmpty())
        throw RuntimeException("isEmpty failure: 1-item stack returned empty")

    println("All tests passed for operations on long stack")
}


/**
 * Tests peek, pop, isEmpty functions for a stack that had its items removed, with booleans
 *
 * @throws RuntimeException if a test fails
 */
fun testPoppedStack() {
    val stack = Stack<Boolean>()
    stack.push(false)
    stack.push(true)
    stack.push(true)
    stack.pop()
    stack.pop()
    stack.pop()

    if (!stack.isEmpty())
        throw RuntimeException("isEmpty failure: emptied stack returned not empty")

    if(stack.peek() != null)
        throw RuntimeException("peek failure: emptied stack returned not null")

    if(stack.pop() != null)
        throw RuntimeException("pop failure: emptied stack returned not null")


    println("All tests passed for popped stack")
}