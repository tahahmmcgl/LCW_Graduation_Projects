@LoginedHomePage @All
    Feature: Logined Home Page

      @CheckBasketCount
      Scenario:Add Product To Basket and Check Basket Count
        Given User is Logined Home Page
        When Click on the "Bluz" product from the "GİYİM" submenu in the "KADIN" menu
        When user click "Siyah" to colour filter
        When user custom filter top selling
        When user click "LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz"product
        When user select "M" size of product
        When User add basket product
        Then Basket header button counts should be "1"

      @CheckBasketMessage
      Scenario:Add Product To Basket and Check Basket Message
        Given User is Logined Home Page
        When Click on the "Bluz" product from the "GİYİM" submenu in the "KADIN" menu
        When user click "Siyah" to colour filter
        When user custom filter top selling
        When user click "LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz"product
        When user select "M" size of product
        When User add basket product
        When User click "Sepetim" Header Button
        Then User should see "Sepetim (1 Ürün)" basket message

      @CheckProductSizeInBasket
      Scenario:Add Product To Basket and Check Product Size in Basket
        Given User is Logined Home Page
        When Click on the "Bluz" product from the "GİYİM" submenu in the "KADIN" menu
        When user click "Siyah" to colour filter
        When user custom filter top selling
        When user click "LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz"product
        When user select "M" size of product
        When User add basket product
        When User click "Sepetim" Header Button
        Then User should see product size "M"

      @CheckProductColourInBasket
      Scenario:Add Product To Basket and Check Product Colour in Basket
        Given User is Logined Home Page
        When Click on the "Bluz" product from the "GİYİM" submenu in the "KADIN" menu
        When user click "Siyah" to colour filter
        When user custom filter top selling
        When user click "LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz"product
        When user select "M" size of product
        When User add basket product
        When User click "Sepetim" Header Button
        Then User should see "Siyah" colour added product

      @BasketToPayment
      Scenario:Add Product To Basket and Buy Products
        Given User is Logined Home Page
        When Click on the "Bluz" product from the "GİYİM" submenu in the "KADIN" menu
        When user click "Siyah" to colour filter
        When user custom filter top selling
        When user click "LCW CASUAL Bisiklet Yaka Parlak Görünümlü Uzun Kollu Tül Kadın Bluz"product
        When user select "M" size of product
        When User add basket product
        When User click "Sepetim" Header Button
        When User click "ÖDEME ADIMINA GEÇ" payment step button
        When User select "Afyonkarahisar / Bayat" address to post address
        When User select "Banka / Kredi Kartı" payment method
        Then User check "Kart bilgilerinizi giriniz." payment message




