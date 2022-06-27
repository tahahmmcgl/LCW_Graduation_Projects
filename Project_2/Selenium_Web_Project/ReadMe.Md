# Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak test otomasyon ödevi yapılacak.Ödeme ekranı doldurulmayacak.

 ## Aşağıdaki senaryoyu web ve mobil olmak üzere 2 çeşit oluşturabilirlerse çok iyi olur. En az Web’de yapmak zorunlu. 
 - Bir yeni müşteri kaydı oluşturulacak. 
 - Login olduktan sonra 
 - Kategoriler ---Kadın---Giyim---bluz bölümüne girip 
 - Filtreleme bölümünden renk seçeneği siyah seçilecek. 
 - Sonuçlar listele yapılıp ,gelen ürün sonuçlarından biri seçilip ,üstüne tıklanacak. 
 - Beden medium seçilecek ,sepete ekle butonuna tıklanacak 
 - Sepetim’e gidilecek ,ürünün adı ,adeti ,bedeni kontrol edilecek. 
 - Ödeme yap butonuna tıklayıp,ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.




# NASIL ÇALIŞIR
![](https://imgyukle.com/f/2022/06/27/Vgyn9x.jpg)

### Parallel.XML dosyasının herhangi bir yerine sağ tıklayıp Run butonuna basmanız yeterli ...
- - -
# İSTENİLEN CASEYİ ÇALIŞTIRMA
![](https://imgyukle.com/f/2022/06/27/Vgyujh.jpg)

### Runner içerisinde Tags bölümüne featureslerde olan taglerden koşulması istenilen case'in tag'i yazılarak case seçimi yapılır.

---

# ALLURE REPORT

## Bu raporlama sisteminin kulanılabilmesi için Allure'nin sisteminizde yüklü olması gerekmektedir !

![](https://imgyukle.com/f/2022/06/27/Vgya9U.jpg)

## Şeklinde cmd açıldıktan sonra aşağıdaki kod yazılarak raporlamaya bakılabilir.

 $ allure serve allure-results


# CUCUMBER REPORT

## Bu raporlama sistemi otomatik olarak Test koşulduğunda oluşmaktadır. Proje dosyasının içerisine Reports kılasörü oluşturarak içerisine HTML şeklinde gelmektedir.


---
# KULLANILAN TEKNOLOJİLER
- Selenium
- Cucumber
- Allure
- TestNG
