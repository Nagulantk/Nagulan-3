public class Main {
    public static void main(String[] args) {
        Son vijay=new Son();
        vijay.farming();
        vijay.business();
        vijay.playingCricket();
        vijay.watchingMovies();
    }
}
class GrandFather
{
    public void farming()
    {
        System.out.println("Having 10 acre farming land");
    }

}
class Father extends GrandFather
{
    public void business()
    {
        System.out.println("Having a private limited company");
    }

}
class Son extends Father{
    public void playingCricket()
    {
        System.out.println("Playing cricket");
    }
    public void watchingMovies()
    {
        System.out.println("Watching movies");
    }
}