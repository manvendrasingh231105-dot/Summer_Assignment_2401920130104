package Week_4.OOPs_4.p4;

class Box {
    double length;
    double breadth;

    Box(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        return length*breadth;
    }
}
