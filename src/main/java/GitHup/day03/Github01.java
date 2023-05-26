package GitHup.day03;

public class Github01 {
    /*
    GITHUB 3. GUN
Github hesabimizi actik.
Git version sistemi ile calisabilmemiz icin ya local repo olustururuz ve remote’a gondeririz ya da remote’dan repo olustururuz. Yani github’dan repo olustururuz.
Github hesabimizda overwiev yanindaki sirada repository kismina geldik ve sag ustte new kismini tiklayinca your repository’I sectik. Hesap ismi yaninda repository name kismina dun olusturdugumuz project ismini ekledik. Description kismina gitgithub projesi yazdik. MyGitGitHubProject. Erisim kismini public olarak sectik. En altta create repository’I kismini tikladik. Acilan sayfada bu repo icin bir link olustugunu gorduk. Ayrica bize bu repository icin kullanacagimiz komutlarin gosterildigini gorduk.
Bu komutlari kullandik, ancak git init komutuna gerek yok, cunku bir kere git init yapmistik.
Komutlardan birinde git branch -M main yaziyor. Github benim ana branch’im main, dolayiyla main olarak degistir diyor. Ya localdeki ve remote’daki branch isimlerinin her ikisi master ya da main olmali.
Git remote add origin komutu ile remote’daki repo’muzu local’e haber vermemiz gerekir.
git remote add origin https://github.com/KurtQA/MyGitGitHubProject.git komutu ile repomuzu local’e tanimladik. Linki remote’daki repomuz icindeki linki kopyalayarak aldik ve terminalde ekledik.
git push -u origin master yazdik, aktif olan branch master ise master, main ise main yazdik son kisma
Bu komutu unuttuk, yani ilk defa push islemi yapmayi unuttuk, git push yazinca bize terminalde uyari verildigini gorduk. Use’dan sonra hangi komutu kullanacgimizi gosterdi ve biz bunu kopyaladik
use,
git push –set upstream origin master komutunu bize onerdi. Bunu kullandik. Github icinde ust tarafta Code secenegini tiklayinca 5 commits seklinde kac commit alindiysa goruldu ve onu tiklayinca ya da history secenegini tiklayinca localde olusturdugumuz versiyonlarin buraya aktarildigini gorduk
src’yi github hesabimizda tikladik ve ATMProject’I gorduk. Onu acinca sag ust kosede kalem seklinde bir secenegi tiklayip bu proje uzerinde calismamiz mumkun olacak.
ATMProject dosyamiza bir ekleme yaptik ve alt kisimda commit changes kismina remote1 yazdik ve en alta degisikligimizi kalici hale getirdik, saved oldu. Bu degisiklik github’da yapildi ve degisiklik otomatik olarak localde gorulmedi. Lokalde degisikligin gorulmesi icin git pull komutunu kullaniriz. git push ile lokalden remot’e gondermistik, git pull ile remote’daki degisikligi lokal’e aldik.
Devaminda git log –oneline ile branch ve versiyonlari gorduk. origin/master demek remote’daki main branch’imizdir. HEAD -> master, origin\master yaziliydi. Bastaki master lokaldeki main branch’imiz.
Clone komutu github daki bir repoyu locale indirme islemidir.
Push Lokalde olusturulan commitlerin github a gonderilmesi islemidir
Pull Fetch ve Merge islemini tek basina yapar.
Git                                                               GitHub
Locale Repository                                    Repository
Main Branch                                          Main Branch master ise ikisi de master,main ise iki taraf da main
Commit v32   ->  push
                                                            <- Pull    Commit v41
RentACar isimli remote’da yeni bir repository olusturduk ve yardimci olacak komutlari yine gorduk. Bunlari kullanmadik sadece repo’muz icin olusturulan linki aldik ve masa ustune gelip CloneProject isminde bir klasor oliusturduk ve icine girince terminali actik. Tepedeki cubuk icine girip cmd yazdik.
Terminal acilinca git clone yanina linkimizi yapistirdik. Daha sonra CloneProject klasoru acinca RentACar projesi ismini gorduk ve gizli bir .git klasoru olustugunu da gorduk. Zaten git ile iliskili bir klasor oldugundan git init komutuna ihtiyacimiz yok. Klasor icindeki RentACar’I actik ve orada terminali actik. Terminalde RentACar icinde oldugumuzu anladik, cunku C: siralamasinda en son RentACar yazili.
git status komutunu kullaninca on branch main’de oldugumuzu gorduk. RentACar klasorune gidip yeni bir metin belgesi olusturduk. Car.txt ya da Car.java
Bu dosya icinde bir seyler yazdik ve git add . daha sonra git commit -m””, git push ile buradaki calismamizi, degiziklikleri remote’a gonderdik. Daha sonra github hesabimizda Car.txt dosyamizi gorebildik. Oradayken dosyamizi actik ve kalem isaretini tiklayip dosyayi editleyip, degisikligi alt kisimda onayladik. Bu degisikligi lokal’e gondermek icin git pull dedik ve sonra git log –online ile degisikligin lokal’e geldigini anladik.
Lokalde versiyon olustur: git add .
Git commit -m “ “
Biz repo’yu git init ile lokalde olusturduysak, bunu remote’daki repoya tanitmaliyiz. Ilk defa push islemi yapilacaksa git remote add origin yanina remote url(link)
Ilk push islemini yaptiktan sonra dogrudan git push komutunu kullaniriz.
Remote’da bir repoyu klonlyarak yani git clone ile olusturduysak, bunu locale gondermek icin
Dogrudan git push islemi yapabiliriz.
git fetch: Degisiklikleri remote’dan referansi ile birlikte locale indirir.
git merge:Indirilen degisiklikleri lokalde uygular
git push ile hem fetch hem merge islemi yapilir.
Remote’daki repo’yu git clone ile locale cekebiliriz. Ikinci yol git push komutunu kullanmak.
git’i idea’nize entegre edeceginiz uygulamalar var ve bu sayede komutlari kullanabilirsiniz. Bu arayuzleri kullanabilmek icin oncelikle git’in temel mantigini ogrenmeniz ve bu komutlari nerede kullanmaniz gerektigini anlamalisiniz.
.gitignore: Birseyleri git haricinde birakmak istedigimizde soz konusu olur. Bazi dosyalarimizda ozel bilgileri tutabiliriz. Bu bilgilerin baskalarinca gorulmesini istemeyebiliriz. Bunlari version control sistemine dahil etmek istemeyebiliriz. Bu nedenle .gitignore isimli bir dosya olustururuz. Bu dosya icind egit’e dahil etmek istemediklerimizi
Out/
.idea/
.idea_modules/
*.iml
*.ipr
*.iws yazarak dahil etmeyebiliriz.
Bunu nasil yapariz?
CloneProject’I actik ve RenACar clasorumuze girdik. Bu klasorumuz git ile iliskili. Sagi tiklayip yeni bir dosya actik. .gitignore Bu dosyamiz icinde .idea/ ve sonrasinda yeni olusturacagimiz dosyanin ismini yazarak bu dosyanin ignore edilmesi, commitlenmemesi saglanir. .gitignore dosyasinda adini yazdigimiz dosyayi klasorumuz icinde sagi tiklayarak olusturduk ve icine bir seyler yazdik. Daha sonra terminale giderek git status yazilinca ornegin yeni dosyamiz gizlidosyam isimli dosyamizin gorulmedigini gorduk ve bu dosya ismi ile islem yapilmadigini anladik.

Merge Conflict :
Iki developer ayni projede calisirken kendi degisikliklerini ana projeye gonderebilir. Ancak projenin ayni sayfasi ve ayni satirda farkli degisiklikler yapilirsa burada degisiklikler nedenli cakisma olur. Bu conflict’I birini secerek cozmek gerekir. Ilgili developer ya da proje lideri kisa bir inceleme ile bir karar verebilir. Degisikligi duzeltebilir. Bu sekilde cakismalar yasamamak icin best practice sudur;
GitHub repo’da bir projemiz var. Main branch uzerinde calisma yapmayip, pull komutu ile oradaki commitleri kendi branch’imize getirip daha sonra yeni bir branch olusturup, onlar uzerinde calistiktan sonra calismamiz bitince dogrudan main branch’e gondermiyoruz, yine remote’daki kendi branch’imize gonderiyoruz. Main branch’de birlesmesi icin ilgili kisiye bir istek de bulunuyoruz. O kisi calismamizi inceledikten sonra merge islemini yapar.
Kendi branch’imizi olusturmadan remote’daki repomuzdan cekilmesi gerekli olan bir degisiklik var mi diye bakiyoruz. Git pull dedik ve cekilecek bir degisiklik olmadigini anlayinca kendi branch’imizi olusturduk. Branch’imiz uzerinde commitleri yapip push ile tekrar repoya gonderecegiz.
Bir conflict olusunca merge komutu calistirilmiyor. Resolve conflict secenegini github kismida secince isaretli kismi cikariyoruz ve sag ust kosede resolve kismini secerek resolved yapiyoruz ve artik merging yapilmasi icin merging kismini tikliyoruz. Car dosyamizi kontorl edince merging isleminin yapildigini anliyoruz.
Code’u sectigimizde main secenegi yaninda branches’lerimiz gorunur. Orayi acinca main ve kendi branch’imiz gorulur. Hangisi ile islem yapacaksak lokalde o branch’I seceriz.
Lokalimizde conflict ile karsilasirsak; remote’da iken dosya uzerinde degisiklik yapiyoruz ve degisikligi commitliyoruz. Lokale geliyoruz, dosyamizi aciyoruz. Main branch’imizdeyiz ve Car dosyamiz uzerinde yeni degisiklikler yaptik ayni satirda. Daha sonra git commit -am”n3” seklinde commitleme yapiyoruz ve git pull ile remote’daki degisikligi locale cekiyoruz. Lokale gelince kendi branch’imize git checkout Zeynep komutu ile geciyoruz ve git merge main yazinca Car dosyasinda conflict oldugu uyarisini gorduk.
Car dosyamizi acinca 9, 13 ve 17. Satirda renklendirilmis olarak cakisma oldugu uyarisini gorduk ve onlari sildik, cakisma olamayacak sekilde duzelttik.
Remote’da repo silme islemi settings kismindaki uygun secenekler ile mumkun. Delete this repository secenegi var. Oraya repo’nun linkini yazariz.



     */
}
