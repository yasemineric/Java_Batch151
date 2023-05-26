package b151practices.deneme;

public class loopsDeneme01 {

    public static void main(String[] args) {
        ///////SOR////////
      /*
    Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
            Örneğin; accessories ´ ces
     */
     String s="accessories";
     String d="";
        for(Integer i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                if(!d.contains(c)){
                    d = d + c;
                }
            }
        }
        System.out.println(d);
    }

}
