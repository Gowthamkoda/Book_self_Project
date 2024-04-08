Feature: Gift Card Scenarios

  Scenario Outline:
: Enter Gift Card Details
    Given navigate to home page
    And Click on GiftCards Label
    And Select Birthday/Anniversary Option
    And Enter Amount "<Amount>" and Select Date and Month
    And Fill To "<To_name>", "<To_Email>", "<To_Phone>" details
    When Fill From  "<From_name>", "<From_Email>", "<From_Phone>", "<Address>", "<Pincode>" details
    Then Validate the Displayed Details "<Amount>", "<To_name>", "<To_Email>", "<To_Phone>", "<From_name>", "<From_Email>", "<From_Phone>", "<Address>", "<Pincode>", "<Message>"

    Examples: 
      | Amount | To_name | To_Email      | To_Phone   | From_name | From_Email     | From_Phone | Address | Pincode | Message       |
      |   1000 | Ram     | ram@gmail.com | 9876543201 | Raju      | rajugmail.com  | 9876543210 | Chennai |  600001 | Invaild Email |
      |   1000 | Ram     | ram@gmail.com | 9876543201 | Raju      | raju@gmail.com | 9876543210 | Chennai |  600001 | Vaild Email   |
