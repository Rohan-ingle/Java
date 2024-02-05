This project implements a simple menu-driven calculator in Java that supports basic arithmetic operations, square root, power, mean, and variance calculations. The calculator is divided into two main components: the Calculator class, which contains all the mathematical functions, and the MainCalculator class, which handles user interactions and menu display.
Calculator Class Functions
add(double a, double b)

    Description: Adds two numbers.
    Parameters: a and b are the numbers to be added.
    Returns: The sum of a and b.

subtract(double a, double b)

    Description: Subtracts one number from another.
    Parameters: a is the number from which b is to be subtracted.
    Returns: The difference between a and b.

multiply(double a, double b)

    Description: Multiplies two numbers.
    Parameters: a and b are the numbers to be multiplied.
    Returns: The product of a and b.

divide(double a, double b)

    Description: Divides one number by another.
    Parameters: a is the dividend and b is the divisor.
    Returns: The quotient of a divided by b. Throws IllegalArgumentException if b is zero.

sqrt(double a)

    Description: Calculates the square root of a number.
    Parameters: a is the number whose square root is to be calculated.
    Returns: The square root of a.

power(double a, double b)

    Description: Raises a number to the power of another.
    Parameters: a is the base and b is the exponent.
    Returns: a raised to the power of b.

mean(double[] numbers)

    Description: Calculates the mean (average) of an array of numbers.
    Parameters: numbers is an array containing the numbers for which the mean is to be calculated.
    Returns: The mean of the numbers in the array.

variance(double[] numbers)

    Description: Calculates the variance of an array of numbers.
    Parameters: numbers is an array containing the numbers for which the variance is to be calculated.
    Returns: The variance of the numbers in the array.

MainCalculator Class

The MainCalculator class provides a user interface for interacting with the calculator. It displays a menu of operations, accepts user input, and performs the selected calculations using the Calculator class. It supports continuous operation until the user chooses to exit.
Menu Options

    Add: Adds two numbers.
    Subtract: Subtracts one number from another.
    Multiply: Multiplies two numbers.
    Divide: Divides one number by another.
    Square Root: Calculates the square root of a number.
    Power: Raises a number to the power of another.
    Mean: Calculates the mean of a series of numbers entered by the user, ending with the string "end".
    Variance: Calculates the variance of a series of numbers entered by the user, ending with the string "end".
    Exit: Exits the calculator program.