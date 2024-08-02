package Core_java;
abstract  class bus {
    //non abstarct method
    public  void Benz()
    {
        System.out.println("its a luxuary buses");
    }
    //abstract method
    public  abstract void Volvo();


}
public   class Abstraction  extends  bus{
    @Override
    public void Volvo() {
        System.out.println("Its a costly bus rupees 2 Crores");
    }

    public static void main(String[] args) {
        Abstraction ab= new Abstraction();
        ab.Volvo();
        ab.Benz();
    }
}
