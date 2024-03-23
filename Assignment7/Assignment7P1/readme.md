# Rational Number Operations

This Java project consists of several classes designed to perform arithmetic operations on rational numbers and handle specific exceptions. Below is an overview of the classes and their functionalities:

## Classes

### `RationalNo`

- **Package**: `Assignment7P1`
- **Description**: Represents a rational number with a numerator and a denominator.
- **Key Methods**:
  - `getNume()`: Returns the numerator of the rational number.
  - `getDenom()`: Returns the denominator of the rational number.
  - `setNume(int nume)`: Sets the numerator of the rational number.
  - `setDenom(int denom)`: Sets the denominator of the rational number.

### `rNoFuncs`

- **Package**: `Assignment7P1`
- **Description**: Contains methods to perform arithmetic operations such as addition, subtraction, multiplication, and division on rational numbers. It also includes methods for comparing rational numbers, converting them to floating-point values, and finding their absolute values.
- **Key Methods**:
  - `addRationals(RationalNo r1, RationalNo r2)`: Adds two rational numbers.
  - `subRationals(RationalNo r1, RationalNo r2)`: Subtracts the second rational number from the first.
  - `multiplyRationals(RationalNo r1, RationalNo r2)`: Multiplies two rational numbers.
  - `divideRationals(RationalNo r1, RationalNo r2)`: Divides the first rational number by the second.
  - `compareRationals(RationalNo r1, RationalNo r2)`: Compares two rational numbers.
  - `convertToFloat(RationalNo r1)`: Converts a rational number to a floating-point value.
  - `absoluteRational(RationalNo r1)`: Finds the absolute value of a rational number.

### `ZeroException`

- **Package**: `Assignment7P1`
- **Description**: A custom exception class thrown when the denominator of a rational number is zero.
- **Key Features**:
  - Inherits from `Exception`.
  - Contains a parameterized constructor that takes a custom message.

### `Main`

- **Package**: `Assignment7P1`
- **Description**: Contains the `main` method to demonstrate the usage of the above classes. It prompts the user to input numerators and denominators for two rational numbers, performs various operations, and handles potential exceptions.
- **Key Features**:
  - Utilizes a `Scanner` object to read user input.
  - Demonstrates try-catch blocks to handle `ZeroException` and `NumberFormatException`.

## Running the Application

To run this application, compile the `Main.java` file and execute the generated class file. The program will prompt you to enter numerators and denominators for two rational numbers and will display the results of various operations on these numbers.