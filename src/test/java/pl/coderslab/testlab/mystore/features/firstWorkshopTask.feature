Feature: Managing user addresses in the application

  Background:
    Given the homepage is opened
    And the user is logged in with email "krdntcodtfotemamgh@hthlm.com" and password "password123"
  @done
  Scenario Outline: Adding a new address and verifying the data
    When the user clicks on the "Addresses" tile
    Then the user should be on the page "https://mystore-testlab.coderslab.pl/index.php?controller=addresses"
    When the user clicks on the "+ Create new address" button
    And the user fills in the new address form with:
      | field       | value         |
      | alias       | <alias>       |
      | address     | <address>     |
      | city        | <city>        |
      | zip code    | <zip_code>    |
      | country     | <country>     |
      | phone       | <phone>       |
    And the user saves the new address
    Then the new address should be displayed in the list of addresses and match the entered data:
      | field       | value         |
      | alias       | <alias>       |
      | address     | <address>     |
      | city        | <city>        |
      | zip code    | <zip_code>    |
      | country     | <country>     |
      | phone       | <phone>       |
    When the user deletes the address by clicking on delete
    Then the address should no longer be present in the list of addresses

    Examples:
      | alias           | address              | city         | zip_code | country          | phone         |
      | Home            | 123 Main St          | Warsaw       | 00-001   | United Kingdom   | +48123456789  |
      | Office          | 456 Office Rd        | Krakow       | 30-002   | United Kingdom   | +48111222333  |
      | Complaints Dept | 789 Complaint Ave    | Wroclaw      | 50-003   | United Kingdom   | +48444555666  |
