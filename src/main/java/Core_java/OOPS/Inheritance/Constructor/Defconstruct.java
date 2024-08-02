package Core_java.OOPS.Inheritance.Constructor;


public class Defconstruct {

    String product_Id;
    String Product_name;
    int price;

    public Defconstruct()
    {

        System.out.println(product_Id+""+Product_name+""+price);
    }
    public void print()
    {
        System.out.println(product_Id+""+Product_name+""+price);
    }

    public static void main(String[] args) {

        Defconstruct dd= new Defconstruct();
        dd.print();
    }

}
