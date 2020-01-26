Feature: Open Exchange Rates

  Scenario: Open Exchange Rates checking

    Given Open "www.google.com"
    When Type to input with name: "q" text: "Открытие" and press Enter
    Then Website with domain: "www.open.ru" is visible and Go to that website
    And selling rate for USD is greater than the purchase rate
    And selling rate for EUR is greater than the purchase rate




