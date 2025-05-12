import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        ArrayList<Zvire> zvire = new ArrayList<Zvire>();
    System.out.println("Zadej počet zvířat: ");
    int z = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < z; i++) {
        System.out.println("1=savec");
        System.out.println("2=plaz");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                Savec s = new Savec();
                zvire.add(s);
break;
                case 2:
                    Plaz p = new Plaz();
                    zvire.add(p);
                    break;
        }
    }
    System.out.println("Savec");
        for(int s = 0; s < zvire.size(); s++) {
            if(zvire.get(s) instanceof Savec) {
                zvire.get(s).predstavSe();
            }
        }
    System.out.println("Plaz");
        for(int p = 0; p < zvire.size(); p++) {
            if(zvire.get(p) instanceof Plaz) {
                zvire.get(p).predstavSe();
            }
        }
        int nejs=0;
        for(int o=0;o<zvire.size();o++){
            if(zvire.get(o) instanceof Savec){
                if (((Savec) zvire.get(o)).getVek() > nejs) {
                    nejs = ((Savec)zvire.get(o)).getVek();
                }
            }
        }
        System.out.println("nejstarsi" +nejs);
    }
}
