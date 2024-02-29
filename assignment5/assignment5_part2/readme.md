# Java Employee Management System

This Java project consists of multiple classes designed to manage employee details and calculate their salaries based on different criteria. Below is an overview of each class and its functionalities.

## Files Overview

### `Employee.java`

- **Abstract Class**: Serves as the base for all employee types.
- **Attributes**: Includes common employee details such as name, address, designation, and salary components (gross wage, basic wage, net salary).
- **Methods**:
  - `theMonthly()`: An abstract method to be implemented by subclasses for calculating the monthly salary.

### `NormalEmployee.java`

- **Extends**: `Employee`
- **Functionality**: Represents a regular employee without any additional bonuses. The salary calculation takes into account the working days, leaves taken, and loss of pay (LOP).

### `BonusEmployee.java`

- **Extends**: `Employee`
- **Functionality**: Represents an employee that receives a bonus. The salary calculation includes a dynamic bonus percentage added to the gross wage, which is input by the user.

### `TestEmployee.java`

- **Usage**: The main driver class that allows user interaction to choose between a normal or bonus employee, set their details, and calculate their net salary.
- **Methods**:
  - `main(String[] args)`: Prompts the user to input employee details and selects the type of employee for salary calculation.
