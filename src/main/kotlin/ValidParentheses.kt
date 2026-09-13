package org.linked_data_structures

// This is an implementation of exercise 4.
// The first function is my solution, and the next has the unit tests.


/**
 * A function to check if a string of parentheses, curly braces, and square brackets is valid.
 * A string is valid if all open brackets are closed by the same type of bracket, open brackets
 * are closed in the correct order, and every closing bracket has a corresponding open bracket
 * of the same type. For instance, "([])" would be valid, but "([)]" would not be.
 *
 * @param string a string that can only contain the characters "()[]{}" in any order and any
 * amounts.
 * @return true if the string is valid, and false otherwise.
 */
fun isValid(string: String): Boolean {
    val openings = Stack<Char>()
    for (char in string) {
        if(char == '(' || char == '{' || char == '[')
            openings.push(char)
        else {
            when(char) {
                ')' -> if (openings.pop() != '(') return false
                '}' -> if (openings.pop() != '{') return false
                ']' -> if (openings.pop() != '[') return false
            }
        }
    }
    return openings.isEmpty()
}


/**
 * A function to run unit tests on isValid and check that it works as intended.
 *
 * @throws RuntimeException if a test fails
 */
fun testIsValid() {
    val inputs = listOf<String>(
        "()",       // Checks a simple pair of parentheses
        "()[]{}",   // Checks all possible pairs of parentheses/brackets/braces
        "(]",       // Checks that a closing character of one type doesn't match another type
        "([])",     // Checks that a pair inside another pair will succeed
        "([)]",     // Checks that a valid set of characters closed in the wrong order fails
        "]"         // Checks that a valid closing character with no opening characters fails
    )

    val expectedOutputs = listOf<Boolean> (
        true,       // input: ()
        true,       // input: ()[]{}
        false,      // input: (]
        true,       // input: ([])
        false,      // input: ([)]
        false       // input: ]
    )

    for (i in inputs.indices) {
        if (isValid(inputs[i]) != expectedOutputs[i])
            throw RuntimeException("Test ${i+1} failed for input ${inputs[i]}")
    }
    println("All tests passed for isValid")
}