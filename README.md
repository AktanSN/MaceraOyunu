# Macera Oyunu
````
Java ile metin tabanlı bir macera oyunu

Oyunun içerisinde belirli savaş bölgeleri mevcut ve bu savaş bölgelerindeki canavarlar ile seçilen
karakterin savaşması isteniyor. Her canavar yendiğinde belirli bir ödül, her bölgeyi tamamladığında 
ise o bölgenin ganimetini kazanıyorsun. Bütün bölge ganimetleri toplanıp güvenli eve dönüldüğünde 
oyun bitmiş oluyor. Güvenli ev her bölge tamamlandıktan sonra can yenilemek için gelinmesi gereken
bir ana nokta. Ayrıca karakteri güçlendirmek için mağazadan zırh veya silah alarak karakterin hasar 
ve sağlık puanını artırıp aldığı darbeleri bloklamasını sağlayabiliyorsun.
````
## Console Ekranı Resimleri
</table>
<div>
  <table>
    <tr>
      <td valign="top" width="50%">
        <img src="https://user-images.githubusercontent.com/58556840/164526065-dff8e602-1a51-49c5-8e4a-2f5868ab26bf.png" height="600px" width="400px">
      </td>
      <td valign="top" width="50%">
        <img src="https://user-images.githubusercontent.com/58556840/164526070-50757882-33d1-41c7-8e09-3ed97d189f8e.png" height="600px"  width="400px">
      </td>  
    </tr>
    <tr>
      <td valign="top" width="50%">
        <img src="https://user-images.githubusercontent.com/58556840/164526040-256e0035-b4be-45f4-a4de-104644dc43f8.png" height="600px"  width="400px">
      </td>
      <td valign="top" width="50%">
        <img src="https://user-images.githubusercontent.com/58556840/164526052-ae30c6fe-1f6b-4b31-a26f-c0c87794b3b8.png" height="600px"  width="400px">
      </td>  
    </tr>
    <tr>
      <td valign="top" width="50%">
        <img src="https://user-images.githubusercontent.com/58556840/164526056-b34ca6af-1246-486a-aede-e3ab6921d4a9.png" height="600px"  width="400px">
      </td>
      <td valign="top" width="50%">
        <img src="https://user-images.githubusercontent.com/58556840/164526059-fe93e081-bb3c-4082-9503-555208acc85b.png" height="600px"  width="400px">
      </td>  
    </tr>
  </table>  
</div>

## Oyun Bilgileri
<div>
<table>
  <tr>
     <td ><img src="https://user-images.githubusercontent.com/58556840/163719197-e5595b85-6b01-4965-b87b-8a257856d391.png" ></td>
    
  </tr>
  
  <tr>
    <td ><img src="https://user-images.githubusercontent.com/58556840/163719199-93aa23aa-8800-48b9-9cbb-24e9191d5c67.png" ></td>
    
  </tr>
</table>
</div>

## MEKANLAR
<div>
  <table>
    <tr>
      <td valign="top" width="33%">
        <ul>
          <li>Güvenli Ev
            <ul>
              <li>Özellik : Can Yenileniyor</li>
            </ul>
          </li>
          <li>Mağara
            <ul>
              <li>Canavar : Zombi (1-3 Adet)</li>
              <li>Özellik : Savaş + Ganimet</li>
              <li>Eşya : Yemek (Food)</li>
            </ul>
          </li> 
        </ul>
      </td>
      <td valign="top" width="33%">
        <ul>
          <li>Orman
            <ul>
              <li>Canavar : Vampir (1-3 Adet)</li>
              <li>Özellik : Savaş + Ganimet</li>
              <li>Eşya : Odun (Firewood)</li>
            </ul>
          </li>
        </ul>
      </td>
      <td valign="top" width="33%">
        <ul>
          <li>Nehir
            <ul>
              <li>Canavar : Ayı (1-3 Adet)</li>
              <li>Özellik : Savaş + Ganimet</li>
              <li>Eşya : Su (Water)</li>
            </ul>
          </li>
          <li>Mağaza
            <ul>
              <li>Özellik : Destekleyici Eşyalar Satın Almak</li>
              <li>Silah : Tabanca,Kılıç,Tüfek</li>
              <li>Zırh : Hafif,Orta,Ağır</li>
            </ul>
          </li>     
        </ul>
      </td>
    </tr>
  </table>  
</div>

## Sınıf Diyagramı
````
Genel anlamda aşağıdaki diyagram yapısı takip edilmiş olup kodlama aşamasında bazı eklemeler yapıldı
````
<div>
<table>
  <tr>
     <td ><img src="https://user-images.githubusercontent.com/58556840/163719204-06a7393d-35bd-412b-bc7d-ae693c33658e.jpg" width="1000" height="750"></td>
    
  </tr>
  
  



