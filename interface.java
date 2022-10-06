public class Main {
    public static void main(String[] args) {

        BMV bmv=new BMV();
       int bmvSpeed=100;
        bmvSpeed=bmv.accelerate(bmvSpeed);
        bmvSpeed=bmv.accelerate(bmvSpeed);
        bmvSpeed=bmv.accelerate(bmvSpeed);
        bmvSpeed=bmv.applyBrake(bmvSpeed);
        bmvSpeed=bmv.accelerate(bmvSpeed);
        System.out.println("Bmv speed is "+bmvSpeed);
        Tata tata=new Tata();
        int tataSpeed=45;
        tataSpeed=tata.accelerate(tataSpeed);
       tataSpeed=tata.accelerate(tataSpeed);
       tataSpeed=tata.accelerate(tataSpeed);
        tataSpeed=tata.applyBrake(tataSpeed);

        System.out.println("Tata speed is "+tataSpeed);
        Swift swift=new Swift();
        int swiftSpeed=70;
        swiftSpeed=swift.accelerate(swiftSpeed);
        swiftSpeed=swift.accelerate(swiftSpeed);
        swiftSpeed=swift.applyBrake(swiftSpeed);
        swiftSpeed=swift.applyBrake(swiftSpeed);
        swiftSpeed=swift.accelerate(swiftSpeed);
        System.out.println("Swift speed is "+swiftSpeed);
    }
}
interface Car
{
     int accelerate(int speed);
     int applyBrake(int speed);
}
class BMV implements Car{
    public int accelerate(int speed)
    {
        return speed+10;
    }
    public int applyBrake(int speed)
    {
        return speed-10;
    }
}
class Tata implements Car{
    public int accelerate(int speed)
    {
        return speed+5;
    }
    public int applyBrake(int speed)
    {
        return speed-5;
    }
}

class Swift implements Car{
    public int accelerate(int speed)
    {
        return speed+8;
    }
    public int applyBrake(int speed)
    {
        return speed-8;
    }
}

