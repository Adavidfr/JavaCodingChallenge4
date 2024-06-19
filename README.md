# Bank Account Management System

This Java programming challenge involves creating a console application to manage bank accounts.

## Challenge Description

### Objective:
Create a Java application to manage bank accounts using a console interface. The application should allow users to perform operations such as adding accounts, removing accounts, finding accounts by account number, displaying all accounts, and transferring money between accounts.

### Requirements:

1. **BankAccount Class**:
    - Attributes: `accountNumber` (String), `holder` (String), `balance` (double).
    - Methods: constructor, getters and setters, `deposit(double amount)`, `withdraw(double amount)`, and `toString` to display account information.

2. **Bank Class**:
    - Attributes: an ArrayList of `BankAccount` objects.
    - Methods:
        - `addAccount(BankAccount account)`: adds an account to the list.
        - `removeAccount(String accountNumber)`: removes an account by its account number.
        - `findAccount(String accountNumber)`: searches for an account by its account number and returns the account.
        - `displayAccounts()`: displays all bank accounts.
        - `transfer(String fromAccount, String toAccount, double amount)`: transfers money from one account to another.

### Steps to Implement:

1. **BankAccount Class**:
    - Implement the `BankAccount` class with appropriate attributes and methods for managing account information and transactions.

2. **Bank Class**:
    - Implement the `Bank` class to manage a collection of `BankAccount` objects. Include methods for adding, removing, finding, and displaying accounts, as well as transferring money between accounts.

3. **Main Application**:
    - Develop a main application (`Main` class) that provides a user-friendly console interface for interacting with the `Bank` class. This should include options to add accounts, remove accounts, find accounts, display all accounts, and transfer money between accounts.

4. **Testing and Validation**:
    - Test the application thoroughly to ensure all functionalities work correctly. Validate operations such as account creation, deletion, searching, displaying, and successful money transfers.

### Skills Practiced:
- Object-oriented programming in Java.
- Handling collections (ArrayList) and basic data structures.
- User input and console-based interaction.
- Error handling and validation of user inputs.

This challenge aims to reinforce fundamental Java programming concepts while providing practical experience in building a simple banking application with basic CRUD (Create, Read, Update, Delete) operations and transaction handling. Good luck!