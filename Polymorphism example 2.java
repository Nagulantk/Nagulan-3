public class Main {
    public static void main(String[] args) {

        Cello cello=new Cello();
        cello.color();
        cello.ledThickness();
        Renolds renolds=new Renolds();
        renolds.color();
        renolds.ledThickness();
    }
}
class Pen{
    public void color()
    {
        System.out.println("Blue");
    }
    public void ledThickness()
    {
        System.out.println("0.5mm");
    }
}
class Cello extends Pen{
    @Override
    public void color() {
        System.out.println("black");
    }

    @Override
    public void ledThickness() {
        System.out.println("0.4 mm");
    }
}
class Renolds extends Pen
{
    @Override
    public void color() {
        System.out.println("pink");
    }

    @Override
    public void ledThickness() {
        System.out.println("0.45mm");
    }
}