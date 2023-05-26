package javaders.day37exceptionsenums;
//Olusturdugumuz Class'i RunTimeException'in Child' i yaparsak o class RunTimeException olur
// ama Exception Class'in childí yaparsak Compile Time Exception olur.
public class IllegalAgeException extends RuntimeException {

    /*
        Eger Runtime Custom Exception uretmek isterseniz RuntimeException Class'a extend etmelisiniz.
    */
    public IllegalAgeException(){

    }

    public IllegalAgeException(String message){
        super(message);
    }

}

