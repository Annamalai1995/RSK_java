package Core_java.OOPS.Inheritance.Constructor;

public class Parameterconst {
    String product_Id;
    String Product_name;
    int price;
    public  Parameterconst(String product_Id,String product_name,int price)
    {
        System.out.println(product_Id);
        System.out.println(product_name);
        System.out.println(price);
    }
    public  void A()
    {
        System.out.println(product_Id+""+Product_name+""+price);
    }

    public static void main(String[] args) {
        Parameterconst pp = new Parameterconst("101","soap",152);
        pp.A();
    }


}
