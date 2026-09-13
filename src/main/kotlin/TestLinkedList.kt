package org.linked_data_structures


/**
 * Runs all unit tests for the LinkedList class
 *
 * @throws RuntimeException if any test fails
 */
fun testLinkedList() {
    testEmptyList()
    testFront()
    testBack()
    testLongList()
    testPoppedList()
    println("All tests passed for linked lists\n")
}


/**
 * Tests the isEmpty, peek, and pop functions on an empty linked list of integers.
 *
 * @throws RuntimeException if a test fails
 */
fun testEmptyList() {
    val testList = LinkedList<Int>()

    if (!testList.isEmpty())
        throw RuntimeException("isEmpty failure: empty list returned not empty")

    if(testList.peekFront() != null)
        throw RuntimeException("peekFront failure: empty list returned not null")

    if(testList.peekBack() != null)
        throw RuntimeException("peekBack failure: empty list returned not null")

    if(testList.popFront() != null)
        throw RuntimeException("popFront failure: empty list returned not null")

    if(testList.popBack() != null)
        throw RuntimeException("popBack failure: empty list returned not null")

    println("All tests passed for operations on empty linked list")
}


/**
 * Tests pushFront, popFront, isEmpty, and peek functions for a not-empty linked list of strings.
 *
 * @throws RuntimeException if a test fails
 */
fun testFront() {
    val testList = LinkedList<String>()
    testList.pushFront("item1")

    if (testList.isEmpty())
        throw RuntimeException("isEmpty or pushFront failure: 1-item list returned empty")

    if (testList.peekFront() != "item1")
        throw RuntimeException("peekFront failure: 1-item list returned wrong value")

    if (testList.peekBack() != "item1")
        throw RuntimeException("peekBack failure: 1-item list returned wrong value")

    if (testList.popFront() != "item1")
        throw RuntimeException("popFront failure: 1-item list returned wrong value")

    println("All tests passed for operations on front of list")
}


/**
 * Tests pushBack, popBack, isEmpty, and peek functions for a not-empty linked list of doubles
 *
 * @throws RuntimeException if a test fails
 */
fun testBack() {
    val testList = LinkedList<Double>()
    testList.pushBack(1.32)

    if (testList.isEmpty())
        throw RuntimeException("isEmpty or pushBack failure: 1-item list returned empty")

    if (testList.peekFront() != 1.32)
        throw RuntimeException("peekFront failure: 1-item list returned wrong value")

    if (testList.peekBack() != 1.32)
        throw RuntimeException("peekBack failure: 1-item list returned wrong value")

    if (testList.popBack() != 1.32)
        throw RuntimeException("popBack failure: 1-item list returned wrong value")

    println("All tests passed for operations on back of list")
}


/**
 * Tests peek, pop, and isEmpty functions for a list with >2 characters
 *
 * @throws RuntimeException if a test fails
 */
fun testLongList() {
    val testList = LinkedList<Char>()
    testList.pushFront('a')
    testList.pushFront('b')
    testList.pushFront('c')
    testList.pushFront('d')
    testList.pushFront('e')

    if (testList.isEmpty())
        throw RuntimeException("isEmpty failure: 5-item list returned empty")

    if (testList.peekFront() != 'e')
        throw RuntimeException("peekFront failure: 5-item list returned wrong value")

    if (testList.peekBack() != 'a')
        throw RuntimeException("peekBack failure: 5-item list returned wrong value")

    if (testList.popFront() != 'e')
        throw RuntimeException("popFront failure: 5-item list returned wrong value")

    if (testList.popBack() != 'a')
        throw RuntimeException("popBack failure: 4-item list returned wrong value")

    if (testList.popFront() != 'd')
        throw RuntimeException("popFront failure: 3-item list returned wrong value")

    if (testList.popBack() != 'b')
        throw RuntimeException("popBack failure: 2-item list returned wrong value")

    if (testList.isEmpty())
        throw RuntimeException("isEmpty failure: 1-item list returned empty")

    println("All tests passed for operations on long list")
}


/**
 * Tests peek, pop, isEmpty functions for a list that had its items removed, with booleans
 *
 * @throws RuntimeException if a test fails
 */
fun testPoppedList() {
    val testList = LinkedList<Boolean>()
    testList.pushBack(false)
    testList.pushBack(true)
    testList.pushFront(true)
    testList.popBack()
    testList.popFront()
    testList.popFront()

    if (!testList.isEmpty())
        throw RuntimeException("isEmpty failure: emptied list returned not empty")

    if(testList.peekFront() != null)
        throw RuntimeException("peekFront failure: emptied list returned not null")

    if(testList.peekBack() != null)
        throw RuntimeException("peekBack failure: emptied list returned not null")

    if(testList.popFront() != null)
        throw RuntimeException("popFront failure: emptied list returned not null")

    if(testList.popBack() != null)
        throw RuntimeException("popBack failure: emptied list returned not null")


    println("All tests passed for operations on popped list")
}