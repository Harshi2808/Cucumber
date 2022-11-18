Feature: Verifying AdactinHotel to get order id

  Scenario Outline: Verifying AdactinHotel details with the given data
    Given User should launch the Browser
    When User should login "<username>" and "<password>"
    And User should search hotels "<location>", "<hotels>", "<room_type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    And User should select hotel Select
    And User should book hotel "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNo>", "<creditCardType>", "<selectMonth>", "<selectYear>" and "<cc_cvv>"
    Then User should get order id after booking

    Examples: 
      | username   | password  | location | hotels      | room_type | room_nos | datepick_in | datepick_out | adult_room | child_room | firstName | lastName | billingAddress | creditCardNo     | creditCardType | selectMonth | selectYear | cc_cvv |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
      | harshi2808 | Kala@1234 | Paris    | Hotel Creek | Standard  |        2 | 14/10/2022  | 15/10/2022   |          2 |          1 | kala      | Shri     | Subash Street  | 1234567891023456 | VISA           |          11 |       2022 |   1234 |
