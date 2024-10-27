# Selenium Cucumber E-commerce Tests

This project contains a set of end-to-end automated tests for an e-commerce application. The tests are written in Java using Selenium WebDriver and Cucumber. The goal is to verify key functionalities of the application, such as user creation, address management, order placement, and data validation.

## Test Scenarios

### Task 1: Automated Login and Address Management
- Manually create a user on the [mystore-testlab.coderslab.pl](https://mystore-testlab.coderslab.pl) website.
- The script performs the following steps:
  1. Logs in as the created user.
  2. Navigates to the address management page.
  3. Adds a new address using data from the Examples table (Gherkin): alias, address, city, zip/postal code, country, phone.
  4. Verifies that the added address details are correct.

### Task 2: Automated Order Placement
- The script executes the following steps:
  1. Logs in as the same user from Task 1.
  2. Selects the "Hummingbird Printed Sweater" product for purchase.
  3. Parameterizes the size (S, M, L, XL) and the quantity.
  4. Adds the product to the cart and proceeds to checkout.
  5. Confirms the address, chooses the "pick up in store" delivery method, and selects the "Pay by Check" payment option.
  6. Places the order and takes a screenshot of the confirmation with the total amount.

## Technologies
- **Language**: Java
- **Frameworks**: Selenium WebDriver, Cucumber
- **Other Tools**: Maven, JUnit/TestNG

## Requirements
- **Java** 11 or higher
- **Maven** 3.x
- **Browser**: Google Chrome, Firefox, or another browser supported by Selenium
- **WebDriver** for the chosen browser

## Installation and Running
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/selenium-cucumber-ecommerce-tests.git
    ```
2. Navigate to the project directory:
    ```bash
    cd selenium-cucumber-ecommerce-tests
    ```
3. Install the dependencies:
    ```bash
    mvn clean install
    ```
4. Run the tests:
    ```bash
    mvn test
    ```

## Test Results
- After running the tests, the results can be found in the `target/cucumber-reports` directory.
- Reports are generated in HTML format and can be viewed in a web browser.

## Author
This project was completed as part of an automated testing course. The author is Rafał Nagawski. If you have any questions, feel free to contact me at rnagawski@gmail.com.



