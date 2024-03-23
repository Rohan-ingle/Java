# No Match Exception Demo

This project demonstrates custom exception handling in Java by checking if a given string matches a predefined value ("India") and throwing an exception if it does not. The project is structured around two main components: the custom exception class `NOMATCHEXCP` and the main class `NoMatchExceptionDemo` that uses this exception.

## Components

### `NOMATCHEXCP`

- **Description**: A custom exception class that extends `Exception`. It's designed to be thrown when a provided string does not match the expected value "India".
- **Constructor**:
  - `NOMATCHEXCP(int lineNum, String input)`: Constructs the exception with a message indicating the line number and the input string that caused the exception.
- **Key Methods**:
  - `getLineNum()`: Returns the line number where the exception was thrown.
  - `getInput()`: Returns the input string that did not match the expected value.

### `NoMatchExceptionDemo`

- **Description**: The main class of the project that demonstrates the use of `NOMATCHEXCP`. It includes a method to check the input string and the `main` method to run the demonstration.
- **Key Methods**:
  - `checkString(String input)`: Checks if the provided string matches "India" and throws `NOMATCHEXCP` if it does not.
  - `main(String[] args)`: The entry point of the program. It calls `checkString` with a test string and handles the `NOMATCHEXCP` exception.

## Usage

To run this demonstration, compile and execute the `NoMatchExceptionDemo` class. By default, it checks the string "Canada" against the expected "India" and throws `NOMATCHEXCP`, catching it and displaying the error message.

## Example Output

```console
No Match Exception: Line [line number] - 'Canada' does not match 'India'
