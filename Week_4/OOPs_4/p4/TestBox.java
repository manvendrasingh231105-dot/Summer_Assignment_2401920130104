package Week_4.OOPs_4.p4;

public class TestBox {

    public static void main(String[] args) {

        Box box=new Box(10,5);
        System.out.println("Area of Box = "+box.area());
        Box3D box3d=new Box3D(10,5,8);
        System.out.println("Volume of Box3D = "+box3d.volume());
    }
}
