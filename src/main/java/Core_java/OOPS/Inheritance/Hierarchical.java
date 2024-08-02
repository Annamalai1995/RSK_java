package Core_java.OOPS.Inheritance;
class Tamilnadu
{
    public void  HeadQuaters()
    {
        String CM="MK.STALLIN";
        String ACM="Udayanithi stallin";
        System.out.println("State CM:"+CM);
        System.out.println("Assiant CM:"+ACM);

    }
}
class Ministers extends  Tamilnadu
{
    public void Minster_roll(){
        String Finance_minister="Thennarasu";
        String Education_minister="Anbil_mahesh";
        String Municipal_minister="K.N Nehru";
        System.out.println("Finance :"+Finance_minister);
        System.out.println("Education:"+Education_minister);
        System.out.println("Muncipal:"+Municipal_minister);
    }
}
class MLA extends Tamilnadu
{
    public  void ward()
    {
        String MLA_name="E.BalaSubramaniyan";
        String MLA_Name="Jayakumar";
        System.out.println("MLA:"+MLA_Name);
        System.out.println("MLA:"+MLA_name);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        MLA m= new MLA();
        m.ward();
        m.HeadQuaters();
    }

}
