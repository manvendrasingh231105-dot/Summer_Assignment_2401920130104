package Week_4.OOPs_4.p2;

public class MainClass {
    public static void main(String[] args){
        Outer objOuter=new Outer();
        objOuter.display();
        Outer.Inner objInner=objOuter.new Inner();
        objInner.display();
    }
}
