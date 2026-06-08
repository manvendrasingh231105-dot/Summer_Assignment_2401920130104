package Week_1.OOPs_1;
public class LibraryInterface {
    public static void main(String[] args) {
        KidUsers k1 = new KidUsers(10, "Kids");
        k1.registerAccount();
        k1.requestBook();
        System.out.println();
        KidUsers k2 = new KidUsers(15, "Fiction");
        k2.registerAccount();
        k2.requestBook();
        System.out.println();

        AdultUsers a1 = new AdultUsers(25, "Fiction");
        a1.registerAccount();
        a1.requestBook();
        System.out.println();
        AdultUsers a2 = new AdultUsers(10, "Kids");
        a2.registerAccount();
        a2.requestBook();
    }
}