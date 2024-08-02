package Core_java.OOPS.Inheritance.Encapsulation;

public class Bank_deatails {
    public static void main(String[] args) {

        Bank_Accno bb1=new Bank_Accno();
        bb1.setAcco_no(12467894l);
        bb1.setAcc_Name("Saran");
        bb1.setAcco_bal(2000000);
        System.out.println(bb1.getAcco_no());
        System.out.println(bb1.getAcc_Name());
        System.out.println(bb1.getAcco_bal());




    }
}
