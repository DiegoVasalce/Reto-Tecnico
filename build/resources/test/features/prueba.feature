# Author: Juan Diego Vasquez Salcedo

@stories
  Feature:prueba
    As a user, I want to create a new user on UTEST platform
  @scenario1
  Scenario: New User
    Given than Diego wants create a new profile
    When he complete all the forms present in the profile
      |strFirstName|strLastName|strEmail|strMonth|strLenguage|strCity|strCountry|strPassword|strComputerOS|strComputerVersion|strComputerLenguage|strBrandMobil|strModelMobil|strMobilOS|intDay|intYear|intZipCode|
      |DIEGO|VASALCE|qwer0988@gmail.com|May|Spanish|Ibague|Colombia|Qwerty0987%&|Windows|10|Spanish|Huawei|P30 Lite|Android 10|01|2000|730001|
    Then he use the platform
      |strQuestion|
      |Complete Setup|




