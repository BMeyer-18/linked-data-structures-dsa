package org.linked_data_structures

fun main() {
    val intList = LinkedList<Int>()
    intList.pushFront(3)
    intList.pushFront(4)
    intList.pushFront(10)
    print(intList.head?.next?.data)
}