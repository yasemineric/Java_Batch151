package b151practices.advancedPrectise.day07;

public class MenuItem {
    //yiyeceklerin kodu, ismi ve ücreti olsun.
    private int code;
    private String name;
    private  double price;

    public MenuItem(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public MenuItem() { //Diger Class.lardan lazim olursa diye parametresiz default Constructor olusturuyoruz.

    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
