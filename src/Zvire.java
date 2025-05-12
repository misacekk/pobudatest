import java.util.Scanner;
public class Zvire {
    static Scanner sc = new Scanner(System.in);
    private String jmeno;
    private int vek;
    private int hmotnost;

    public int getHmotnost() {
        return hmotnost;
    }

    public int getVek() {
        return vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public Zvire(){
        System.out.println("jmeno");
        jmeno=sc.nextLine();
        sc.nextLine();
        System.out.println("vek");
        sc.nextLine();
        vek=sc.nextInt();
        sc.nextLine();
        System.out.println("hmotnost");
        hmotnost=sc.nextInt();
        sc.nextLine();
    }

    public void predstavSe(){
        System.out.println("Ahoj jmenuju se "+jmeno+" a je mi "+vek+" let a vážím "+hmotnost);
    }

}
