package Core_java.OOPS.Inheritance;
class Manangement
{
    public void Management_data()
    {
        String CEO="Kmadhasamy";
        String JS="Kumar";
        String Principal="Madheswaran";
        int totalcounts=5000;
        System.out.println("CEO:"+CEO);
        System.out.println("JS:"+JS);
        System.out.println("PRINCIPAL:"+Principal);
        System.out.println("TOTALCOUNT:"+totalcounts);
    }
}
class HOD extends Manangement
{
    public void HOD_Details()
    {
        String IT="Anitha";
        String CSE="Kavitha";
        String AI_DS="Suvitha";
        System.out.println("IT:"+IT);
        System.out.println("CSE:"+CSE);
        System.out.println("AI&DS:"+AI_DS);

    }
}
class Students extends  HOD
{
    public void Student_details()
    {
        System.out.println("Karthi");
        System.out.println("Rhaul");
        System.out.println("Saran");

    }
}

public class Multilevel {
    public static void main(String[] args) {
        Students ss= new Students();
        ss.Student_details();
        ss.HOD_Details();
        ss.Management_data();
    }
}
