@demy
  Feature: US0101 qualitydemy

    Scenario: kullanici basarili bir sekilde giris yapabilmeli

      Given Kullanici qualitydemy sayfasina gider
      When Email ve password bilgilerini girerek giris yapar
      Then Basarili bir sekilde giris yaptigini test eder
      And Sayfayi kapatir