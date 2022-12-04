@demy
  Feature: US1111 AutomationLogin Testi

    Scenario: Kullanici basarili bir sekilde giris yapabilmeli

      Given Kullanici "myAutomationUrl" sayfasina gider
      And Kullanici Signup butonuna tiklar
      Then Kullanici mail bolumune "mail" gonderir
      Then Kullanici password bolumune "password" gonderir
      Then Kullanici login butonunu tiklar
      Then Kullanici Automatiın sayfasina giris yaptigini test eder
      And Sayfayi kapatir