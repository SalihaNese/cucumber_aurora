
  Feature: US1116 Amazon Change Testi

    Scenario: Kullanici dil menusunden para birimini degistirdiginde urun fiyat birimlerinin degistigini test eder

      Given Kullanici "amazonUrl" sayfasina gider
      Then Kullanici dil bolumune gider ve change butonuna tiklar
      Then Kullanici Ayarlar kisminda para birimi olarak Turk Lirasini secer
      Then Kullanici yapilan degisiklikleri kaydeder
      Then Kullanici amazon arama kutusunda "nutella" arama yapar
      Then Kullanici urunlerin para birimi olarak Turk Lirasi oldugunu test eder
      And Sayfayi kapatir


     Scenario: Kullanici saffanın alt kismindan para birimini degistirdiginde urun fiyat birimlerinin degistigini test eder

       Given Kullanici "amazonUrl" sayfasina gider
       Then Kullanici sayfanin alt kismindan para birimi butonunu tiklar
       Then Kullanici Ayarlar kisminda para birimi olarak Turk Lirasini secer
       Then Kullanici yapilan degisiklikleri kaydeder
       Then Kullanici amazon arama kutusunda "canta" arama yapar
       Then Kullanici urunlerin para birimi olarak Turk Lirasi oldugunu test eder
       And Sayfayi kapatir






