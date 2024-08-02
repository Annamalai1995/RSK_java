package Core_java.OOPS.Inheritance;
class  bank
{
    public void customer_Details()
    {
        String name="Adithiyan";
        int Age=20;
        String place="Rasipuram";
        long Acco_no=145789556412l;
        System.out.println("My name is:"+name);
        System.out.println("Age is:"+Age);
        System.out.println("Place :"+place);
        System.out.println("Account_Number :"+Acco_no);



    }
}
class Bank_deatils extends  bank
{
    public void Details()
    {
        String Bank_name="HDFC";
        String Branch="Rasipuram";
        String IFSCCODE="14578HDFC05";
        System.out.println("BANK NAME :"+Bank_name);
        System.out.println("Branch is:"+Branch);
        System.out.println("IFSCCODE is:"+IFSCCODE);
    }
}


public class Single  {
    public static void main(String[] args) {
        Bank_deatils ss= new Bank_deatils();
        ss.customer_Details();
        ss.Details();

    }
}
