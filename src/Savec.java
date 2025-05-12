public class Savec extends Zvire{
    private String getTypSrsti() {
        return typSrsti;
    }

    private String typSrsti;

    public Savec(){
        super();
        System.out.println("Jaký ma typ srsti?");
        this.typSrsti = sc.nextLine();
    }

    @Override
    public void predstavSe(){
        super.predstavSe();
        System.out.println("Jsem savec");
    }

}