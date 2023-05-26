package GitHup.day01;

public class GitHup02 {
    /*
    Local Repo Olusturma:
git init komutu kullanildiginda proje klasorunde .git klasoru olusturulur. Bu klasor git’in alt yapisini olusturacak klasordur.
Lokaldeyken version control sistemini nasil devreye aliriz? git init komutu bu isi yapiyor. Bu komutu kullaninca .
git isimli klasor olusuyor. Ancak git init komutunu kulanirken cok dikkatli olmali. Neyi repository’e cevireceksek onun
 icinde olmaliyiz. Terminalde desktop’da mi yoksa desktop uzerindeki uzerinde calisacagimiz klasorde miyiz onu control
  etmeliyiz. Repoya cevirme islemini biz desktop icindeyken yaparsak desktop’daki tum klasorleri bir repository icine
  alma ihtimalimiz var. Ancak klasorun icinde isek problem olmaz. Sifirdan klasoru terminalde actigimizda zaten bizi
  dogrudan klasorun icinde tutuyor. Terminali kapatip, new terminal’e basinca yine ana klasorumuz icinde oldugumuzu
  bize gosteriyor. Ancak biz klasor icindeki bir baska dosya icine girmek isteyebiliriz. Calismamizi orada gerceklestirebiliriz.
   Iste o dosyaya ulasmak istersek soyle yazmaliyiz; cd ve sonrasinda bir bosluk ve dosyamizin ismini eklemeliyiz.
Diyelim ki bizim klasorumuzun adi GIT01, onun icinde new folder’a tiklayarak yeni bir dosya actik, app1 isimli.
Bunu icin Terminalde cd app1 yazip enter’a basinca desktop\GIT01\app1’I gorururuz.Biz repro’yu bu app1 icinde yapmak istedik
 ve cd app1 yazarak app1 icine girdik. Geri gelmek icin cd ..
Yazmamiz gerekir. Bunu yapinca desktop\GIT01’I gorduk. Yani artik GIT01 icindeyiz. Tekrar app1’e gelmek icin cd app1
 yazmaliyiz terminal icinde. Artik git init komutunu kullanabiliriz. Biz app1 klasoru icindeyiz. Bundan eminiz.
 git init yazip enter’a basinca bize bos bir Git repository’si olustugunu yazar.
 (initialized empty Git repository in…One Drive\Desktop\GIT01\app1\ .git)
 Yani app1 klasoru icinde .git isimli bir klasor olusmus oldu. Artik herseyi, versiyonlari bu gizli klasorde tutacak.
 Burada bir repo olusturmus olduk. git init bir kere yapilir. Ancak baska bir proje icin calisirken o yeni proje icin de
  bir kere git init yapilir. Tekrarlanmaz.
Projeye lokalden ya da remote’dan baslayabiliriz. Lokalede bilgisayarimizda bir proje baslatip, onu gelistirdikce
onu github’a yonlendirebiliriz ya da github’da baslangicta bir repository olusturup, projemize orada baslayabiliriz.
Bireysel olarak olusturdugumuz projelerimiz icin lokalde baslayabiliriz. Ancak halihazirda baslatilmis bir proje
 uzerinde calismamiz halinde boyle bir proje remote’da repository olarak baslatilmis olur ve daha sonra biz bu projeyi kendi lokalimize aliriz.
Lokalde olusturdugumuz projeyi VKS’ye tabi tutmak istersek, projemizin oldugu dosya icinde isminin yazili oldugu
dosya yolu olarak sayilan kismi silip yerine cmd yazip enter yapinca terminal aciliyor. Yani terminal o dosyamiz icinden acilmis olur.
Terminalde cd desktop yazinca desktop’a git demis oluruz, oraya gider ve devaminda cd GitProject01 yazarsak desktop
icindeki projemize girebiliriz.
git init yazip enter yaparsak orada initializied by seklinde bir aciklama gorursek git icinde klasorumuz olusmus
demektir. Bu sekilde projemizi git ile iliskilendirmis oluruz. Local repository’de calismalarimizi boyle depolamis oluruz.
git init komutu ile dosyamiz icinde .git klasorunu goruruz. Boylece git ile baglanti kurduk.
Working Space: .git klasorunun bulundugu calisma alanidir. Klasorler ve dosylara uzerinden degisiklik burada yapilir.
 Az once yaptigimiz islemlerle .git klasorumuz olustu. Bu klasor bizim icin working space’dir.
Staging Area: Versiyon olusturulacak olan dosya veya klasorlerin gecici olarak toplandigi yerdir. Versiyon(commit)
 olusturulduktan sonra otomatik olarak staging area bosaltilir. Staging area bir bekleme salonu gibi dusunulebilir.
  Henuz bir degisiklik yapmadik ancak degisiklik yapmayi dusundugumuz bolumleri gecici olarak bu alanda tutariz.
Commit Store: git’in komutlarini kullanarak degisiklik sonrasinda olusan versiyonlari kaydederiz. Commit Store,
commitlerimizin tutuldugu, depolandigi alandir.
Working space repository oluyor. Stage ve commit store .git klasorunde yer alir.
Working Space’den Staging Area’ya bir dosyadaki bir degisiklik nedeniyle gitmek icin git add ve dosya adini yazariz
veya tum dosyalardaki degisiklikleri gondermek istersek sadece git add . seklinde yazariz. Boylece working Space’deki degisiklikler
Staging Area’ya tasinmis oldu.
Staging Area’dan Commit Store’a giderken git commit -m”bir mesaj” yazariz. Commit demek version demektir.
git init komutu bize stage area ve commit store’u olusturdu.
Text’imizde ekleme yaptiktan sonra git status yaziyoruz terminalde ve boylece son durumu gormus oluruz.
Bu asamada degismis hali staging area’ya gecmis oldu.
Bir dosyamiz icin hic add komutunu kullanmadiysak untracked seklinde bir aciklama goruruz. Bir kere add komutunu kullandiysak
 artik bu dosya uzerinde degisiklik yapilmasi hallerinde dosyamiz modified asamasinda olur. Bir dosya uzerindeki degisiklik
  staging area’ya git add  , tum degisiklikleri staging area’ya git add . ile almis oluruz.
Artik bir version olusturmak istersek versiyonlari commit olarak adlandiririz. Git commit -m” “ tirnak isareti icine o degisiklige,
 projeye uygun bir mesaj yazilmali.
Dosyamiz uzerinde degisiklik yaptiktan sonra hem git add hem git commit komutlarini kullanmak istersek git commit -am”v2” yazariz.
 Bu sekilde hic beklemeden degisikligi staging area’dan commit store’a almis olduk. Ancak bu komutu kullanabilmemiz icin
 bir kere git add komutu kullanilmis olmali. Bu komut sonrasinda terminalde yaptigimiz ekleme ve cikarmadan bahsedilecek sekilde aciklama goruruz.
git commit --amend -m”” komutu, en son commit'i değiştirmek için kullanılır ve bu komutu kullanmadan önce bir değişiklik
yaptıysanız, bu değişiklikler de son commit ile birleştirilir.
git status komutu ile genel durumu ne var ne yok diye soruyoruz.
git log ile tum degisiklikleri, versiyonlari kimin yaptigi, versiyonun olusturulma tarihleri ile birlikte detayli
bilgilerini goruruz. Commit kelimesi devaminda her version icin ayri ayri kodlar var. Bunlara hashcode denir.
git log –online komutu mevcut versiyonlarin tum detaylari yerine mesajini ve hashcode’un ilk yedi karakterini gorebiliriz.
 Versiyonlar arasinda gezinti yaparken hashcode’larin ilk yedi karakterine ihtiyac duyariz. Bu 7 karakteri almak icin
 git log –online’I kullaniyoruz.
git log ve git log  --online ile degisiklik detaylarini tam olarak goremeyiz. Bunun icin git show komutunu kullaniriz.
git show komutunu hashcode’un ilk 7 karakterini yazarak kullaniriz. Degisiklik olarak neyi eklediysek onu bir metin
halinde gorebiliyoruz. 7 karakteri oncesinde git log –online yazinca gormustuk ve git show yanina o 7 karakteri ekledik.
git add ile birlikte degisiklik yapilan dosya ismi yazilirsa, bu dosyayi uzantisi ile birlikte yazariz, ornegin text
ise dosya adi nokta koyarak txt, word belgesi ise ismi nokta ve devaminda doc, java script ise nokta java yazilmali.
git init Repo olusturur ve her projede en basta bir kere kullanilir.
Commit Store & Head:
git log –oneline kullandigimizda bize head’I isaret etti. Bu Head nedir? En son icinde bulundugumuz, aktif olan
commitimiz head olarak kabul ediliyor.
git restore ve bir bosluk devaminda dosyanin adini yaziyoruz. Once git status ile mevcut durumumuzu goruntuledik.
git1 ve git2 dosyalarimizda degisiklik yapildigi, modified edildigini ancak degisikliklerin eklenmedigi uyarisini gorduk.
Daha sonra git restore dosya adi yazdik enter sonrasi bu defa git status ile mevcut duruma bird aha baktik.
git1 dosyamizdaki degisikligin iptal edildigini gorduk. Ancak her iki dosyada da degisikligi iptal etmek istersek
git restore . yazmaliyiz. Bu komut sonucunda git1 dosyamizi ve git2 dosyamizi control edince son degisikliklerin
her iki dosyada da silindigini gorduk.
     */
}
