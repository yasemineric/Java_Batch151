package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {
        String capitalOfIllinois= UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);//Springfield

        String abbreviationOfFlorida= UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);//FL

        UsStatesEnum state=UsStatesEnum.ALASKA; // Enumlar variable.larin data tipi olarak da kullanilir.
        //Normalde Alaska String gibi duruyor ancak onu String yapinca kizardi. Variable tipini degistirme uyarisini sectik
        //ve duzeldi. String yerine enum'in ismi yazildi. Ornek: UsStatesEnum state=UsStatesEnum.Alaska
        System.out.println(state);//ALASKA

        //Enumdaki datayi get methodu olmadan kullanirsak data tipini enum ismi yapalim
        String stateName=UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);//Alaska

        String abbreviaotionOfAlaska= UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviaotionOfAlaska);//AK






    }
}
