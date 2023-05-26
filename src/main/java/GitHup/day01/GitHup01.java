package GitHup.day01;

public class GitHup01 {
    /*
    Git: Uygulamamizdaki herbir gelisim ve herbir degisim ile uygulamamiz yeni bir version
     kazanir. Git version kontrol sistemidir.
GitHub: Git’i kullanarak remote’da version control sistemini saglar.
Yani Git versiyon control sistemini kullanan depolama servisleridir.
Projelerimizi burada private(sadece bizim erisebilecegimiz) ya da public
olarak burada tutabiliriz.
Versiyon Kontrol Sistemi: Sunu hayal edelim, ortaogretim doneminde donem
odevlerimiz vardi. Bu odevleri bir gunde bitiremezdik. Doneme yayilacak sekilde yapardik.
Bu odevi her ele aldigimizda gelistirir sonra kayit ederdik ve ertesi gun tekrar ele
alarak odevimize yeni seyler ekledik ya da bazi seyleri sildik. Odevimizin ilk
versiyonunu degistirmeden kayit etmek ve gelistirdigimiz odevimizi ise gelistirilmis
hali ile kaydetmek isteyebilirdik. Boylelikle biz odevin onceki haline gidip o
kisimdan calismalar yapmak isteyebilirdik ya da gelismis hali ile calismak isteyebilirdik.
Farkli sekillerde kaydettigimiz odevimizi danismanimiza gosterdigimizde aldigimiz
yorumlar neticesinde odevimize son halini verip onu son version olarak kaydetsek dahi
bir gun sonra aklimiza yeni bir sey daha geldi ve eklemeler yapmak isteyebiliriz.
Birden fazla kaydedilmis farkli versiyonlardaki odevimizle calisirken bunlari bir
control sistemi ile yonetebilir, karisikligi engellemis oluruz.
Iste Git ile projelerimiz uzerinde calisirken birden fazla versiyonu olan
projelerimizi kaydetmek, karsilastirmak ve gelistirmek mumkun olabilir.
Farkli tarihlerde olusan projemizin versiyonlari arasinda gidip gelebiliz.
Versiyon control sistemi ile bu isleri saglikli bir sekilde yurutebiliriz.

Versiyon Kontrol Sisteminin faydasi, bazi dosyalarin veya projenin tamaminin bir
onceki versiyona dondurulmesidir. Zaman icerisnde yapilan degisikliklerin
karsilastirirlmasi versiyonlar arasi gezerek mumkun olabilir.
Probleme neden olabilecek degisikliklerin en son kimin tarafindan yapildigi
version control sistemi sayesinde mumkundur.
3 cesit versiyon control sistemi vardir.
1-Yerel 2-Merkezi 3-Distributed (Dagitik)
Yerel Versiyon Kontrol Sistemi:
Kendi lokalinizde versiyonlar arasi calisma imkan verir, ancak ortak calisma
ile versiyonlara ulasma ve onlar uzerinde calisma imkani sunmuyor.
2-Merkezi Versiyon Kontrol Sistemi:
Merkezde sadece bir bilgisayar var. Ortak calismaya imkan saglar, ancak bir
sebeple A sahsi merkezdeki bilgisayara ulasamadiginda ya da merkezdeki bilgisayarin
server’I coktugunde calismaya devam etmek mumkun olmayabilir.
3-Distributed Versiyon Kontrol Sistemi:
A, B, C kisileri uzaktaki merkezi bir alana gidebildikleri, oradaki proje
uzerinde calisabildikleri gibi, dilediklerinde merkezdeki projeyi,
versiyonlari kendi bilgisayarinda, yerelde kullanabilecekleri sekilde
alabiliyorlar. Aldiklari versiyonlara son sekillerini verip son varsiyonlari
merkeze gonderebilirler. Distributed Versiyon Kontrol Sistemi hem yerel hem
merkezi version control sisteminin ozelliklerine sahiptir.

     */

    /*
    Git Kurulum ve Ilk Ayarlar
Git configuration
git config –global user.name “ “
git config –global user.email “ “
git config –global color.ui true  //terminaldeki komutlarin renklendirilmesini saglar
global yerine local parametresini kullanirsak projenin sadece yerel kullanim ayarlarini yapmis oluruz.


    Bu ayarlari yaptiktan sonra yaptigim ayarlari unutmus olabilirim.
    Terminalde git config --list yazarsak configurasyon ayarlarimizi detayli olarak gorebiliriz.(list yaninda iki kisa cizgi var)

    git config --global user.name ""
    git config --global color.ui true
    git config --list

     */

    /*
    Git   local --> offline    merkezi VKS
GitHub    remote --> with wifi       Dagitik VKS

Repository: Bizim bir projemizi version control sistemine tabi tutmak istedigimizde her bir projemizi ayri bir yapida tutulur. Bu ayri yapiya repository denir. Genellikle her proje icin ayri bir repository tanimlanir.
Local repo olusturma
git init komutu kullanildiginda proje klasorunde git klasoru olusturulur.
Projeye lokalden ya da remote’dan baslayabiliriz. Lokalede bilgisayarimizda bir proje baslatip, onu gelistirdikce onu github’a yonlendirebiliriz ya da github’da baslangicta bir repository olusturup, projemize orada baslayabiliriz.
Bireysel olarak olusturdugumuz projelerimiz icin lokalde baslayabiliriz. Ancak halihazirda baslatilmis bir proje uzerinde calismamiz halinde boyle bir proje remote’da repository olarak baslatilmis olur ve daha sonra biz bu projeyi kendi lokalimize aliriz.
Lokalde olusturdugumuz projeyi VKS’ye tabi tutmak istersek, projemizin oldugu dosya icinde isminin yazili oldugu dosya yolu olarak sayilan kismi silip yerine cmd yazip enter yapinca terminal aciliyor. Yani terminal o dosyamiz icinden acilmis olur.


     */

    /*
    Working Space: .git klasorunun bulundugu calisma alanidir. Klasorler ve dosylara uzerinden degisiklik burada yapilir. Az once yaptigimiz islemlerle .git klasorumuz olustu. Bu klasor bizim icin working space’dir.
Staging Area: Versiyon olusturulacak olan dosya veya klasorlerin gecici olarak toplandigi yerdir. Versiyon(commit) olusturulduktan sonra otomatik olarak staging area bosaltilir. Staging area bir bekleme salonu gibi dusunulebilir. Henuz bir degisiklik yapmadik ancak degisiklik yapmayi dusundugumuz bolumleri gecici olarak bu alanda tutariz.
    Commit Store: git’in komutlarini kullanarak degisiklik sonrasinda olusan versiyonlari kaydederiz. Commit Store, commitlerimizin tutuldugu, depolandigi alandir.
     */

    // git add git1.txt
    // git status
    //git commit -m"v1"
    //git commit -m komutu mesaj vererek versiyon oluşturmamızı sağlar.
    //version2
    //git commit -am ikisini birarada kullanmamizi saglar.
    /*
    git commit -am"v2" : add+commit komutlarını birlikte kullanmamı sağlar.
ancak bu komutu kullanabilmek için bir kere add komutu kullanılmış olmalı.
version3
     */
    //git commit --amend -m"v3"

    //git show+ hash code


}
