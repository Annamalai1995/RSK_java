package Core_java.OOPS.Inheritance.Multiple;

public class TravelsMain implements  Travels,Travels_type {
    @Override
    public void KPN() {
        System.out.println("Its a Luxary vehicle");

    }

    @Override
    public void SwamyAyyappa() {
        System.out.println("Luxary Behyond");

    }

    @Override
    public void Volvo9600() {
        System.out.println("Its price is 2Crores");
    }

    @Override
    public void Benz() {
        System.out.println("costly bus");

    }

    public static void main(String[] args) {
        TravelsMain tt= new TravelsMain();
        tt.Benz();
        tt.KPN();
        tt.SwamyAyyappa();
        tt.Volvo9600();
    }
}
