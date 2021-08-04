#Autor: Alexander Bravo
@stories
Feature: uTest

  @scenario1
 Scenario Outline: Search for a automation join
    Given that alexander want to join in utest
      | StrFirstName   | StrLastName   | StrEmail   | StrDateMonth   | StrDateDay   | StrDateYear   | StrPassword   |
      | <StrFirstName> | <StrLastName> | <StrEmail> | <StrDateMonth> | <StrDateDay> | <StrDateYear> | <StrPassword> |
    When he search for the complete the join request


    Then he finds join request


    Examples:
      | StrFirstName | StrLastName | StrEmail              | StrDateMonth | StrDateDay | StrDateYear | StrPassword      |
      | Alexander    | Bravo       | abravo@gmail.com      | July         | 12         | 1996        | ABCdefghijk12345 |
