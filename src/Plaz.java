public class Plaz extends Zvire{
private boolean supiny=true;

    public boolean isSupiny() {
        return supiny;
    }

    public Plaz(){
    System.out.println("Má šupiny?");
    this.supiny=sc.nextBoolean();
}

    @Override
    public void predstavSe(){
        super.predstavSe();
        System.out.println("Jsem plaz");
    }

}