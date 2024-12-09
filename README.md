# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`.  The `bug.java` file contains code that attempts to access an array element using an invalid index, resulting in this exception.  The `bugSolution.java` file provides a corrected version with proper index checking.

## How to Reproduce

1. Compile `bug.java` using a Java compiler (like `javac`).
2. Run the compiled code using a Java virtual machine (like `java`).

You'll observe an `ArrayIndexOutOfBoundsException` being thrown.

## Solution

The solution involves adding checks to ensure the index is within the valid bounds of the array before attempting to access an element.