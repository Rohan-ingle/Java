# Factorial Calculator with Exception Handling

This Java project provides a simple implementation for calculating the factorial of a number with built-in exception handling for specific cases. The project is structured into three main classes, each serving a unique role in the process.

## Classes Overview

### `Factorial`

- **Package**: `Assignment7P2`
- **Description**: This class contains the logic for calculating the factorial of a number. It includes error handling for edge cases, such as negative numbers or numbers too large for the calculation.
- **Key Method**:
  - `calc(int number)`: Accepts an integer and returns its factorial. Throws `FactorialException` for invalid inputs.

### `FactorialException`

- **Package**: `Assignment7P2`
- **Description**: Custom exception class that extends `Exception`. It's used to signal errors encountered during factorial calculation, such as inputting a negative number or a number too large for the calculation to handle.
- **Constructor**:
  - `FactorialException(String message)`: Constructs a new exception with the specified detail message.

### `Main`

- **Package**: `Assignment7P2`
- **Description**: Contains the `main` method that drives the program. It prompts the user for input, invokes the factorial calculation, and handles any exceptions that arise.
- **Key Features**:
  - User input via `Scanner`
  - Exception handling for `FactorialException` and `NumberFormatException`

## Usage

To use this program, compile and run the `Main` class. When prompted, enter an integer for which you'd like to calculate the factorial. The program will display the result or an error message if the input is not valid.

## Example

```console
Enter number for factorial: 5
The Factorial = 120
