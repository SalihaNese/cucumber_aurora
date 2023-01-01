
  Feature: US1112 amazon Arama Testi

   Scenario Outline: Kullanici arama kutusunda birden fazla arama yapabilmeli

      Given  Kullanici "amazonUrl" sayfasina gider
      Then Kullanici amazon arama kutusunda "<istenenKelimeleri>" arama yapar
      Then  Kullanici arattıgı "<istenenKelimeleri>" test eder
      Then  Sayfayi kapatir

     Examples:
     |istenenKelimeleri |

     |elma |
     |muz |
     |ayva|
     |karpuz |