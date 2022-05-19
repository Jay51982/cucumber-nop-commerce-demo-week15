#done
Feature: Computer Tab
  As user I want to Computer tab into nop commerce website

  @smoke
  Scenario: verify User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When I click Computer tab "Computer"
    Then User should Verify Computer text

@sanity @regression
  Scenario: verify User Should Navigate To Desktops Page Successfully
    Given I am on homepage
    When I click Computer tab "Computer"
    And I click on Desktops "Desktops"
    Then User should Verify Desktops text

  @smoke @sanity @regression
  Scenario Outline: verify That User Should Build Own Computer And Add Them To Cart Successfully
    Given I am on homepage
    When I click Computer tab "Computer"
    And I click on Desktops "Desktops"
    And I Click on product name Build your own computer "Build your own computer"
    And I Select processor "<processor>"
    And I Select RAM "<ram>"
    And I Select HDD "<hdd>"
    And I Select OS "<os>"
    And I Select Software "<software>"
    And I Click on ADD TO CART Button
    Then I should Verify message The product has been added to your shopping cart

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |





