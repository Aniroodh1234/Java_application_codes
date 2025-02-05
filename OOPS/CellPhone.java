class Phone{
    public void ringing(){
        System.out.print("\nPhone is ringing");
    }
    public void Vibrating(){
        System.out.print("\nPhone is vibrating");
    }
}

public class CellPhone{
    public static void main(String[]args){
        Phone mob = new Phone();
        mob.ringing();
        mob.Vibrating();
    }
}