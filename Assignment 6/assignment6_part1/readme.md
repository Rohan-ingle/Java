Stack Implementations in Java

This repository contains Java implementations of two types of stacks: a fixed-capacity stack (Fixed_stk) and a growable stack (Growable_stk), both conforming to the Interface_STK interface which defines basic stack operations.
Interface: Interface_STK

Located in the assignment6_part1 package, this interface outlines the essential methods for a stack:

    push(int element): Adds an element to the top of the stack.
    pop(): Removes and returns the top element of the stack.
    displayStack(): Displays all elements in the stack.
    overFlow(): Checks if the stack is full (mainly for the fixed stack).
    underFlow(): Checks if the stack is empty.

Class: Fixed_stk

Implements a stack with a fixed size defined by an array. It provides methods to perform standard stack operations while also checking for stack overflow and underflow conditions.
Constructor

    Fixed_stk(int[] s, int top): Initializes the stack with a given array and top index.

Methods

    push(int element): Adds an element to the stack; prints an error if the stack is full.
    pop(): Removes and returns the top element; prints an error if the stack is empty.
    displayStack(): Prints all elements in the stack; indicates if the stack is empty.
    overFlow(): Returns true if the stack is full.
    underFlow(): Returns true if the stack is empty.

Class: Growable_stk

Implements a stack using an ArrayList which can dynamically grow as needed. It mimics the standard stack operations without the risk of overflow.
Constructor

    Growable_stk(): Initializes an empty stack with an initial capacity.

Methods

    push(int element): Adds an element to the top of the stack.
    pop(): Removes and returns the top element; terminates the program if the stack is empty.
    displayStack(): Prints all elements in the stack; terminates the program if the stack is empty.
    overFlow(): Always returns false as the stack can grow indefinitely.
    underFlow(): Returns true if the stack is empty.

Main Class: StackDemo

Demonstrates the usage of both Fixed_stk and Growable_stk by performing a series of stack operations like push, pop, and displaying the stack contents.