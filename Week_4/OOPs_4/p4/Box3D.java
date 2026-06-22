package Week_4.OOPs_4.p4;

class Box3D extends Box {
    double height;

    Box3D(double length,double breadth,double height) {
        super(length,breadth);
        this.height=height;
    }

    double volume(){
        return length*breadth*height;
    }
}
