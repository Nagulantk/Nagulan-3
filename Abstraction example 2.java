public class Main {
    public static void main(String[] args) {

        Average student=new Average();
        student.setEnglish(45);
        student.setMaths(56);
        student.setScience(50);
        student.setSocialscience(55);
        student.setTamil(70);
        student.calculatingAverage();
    }
}
abstract class Marks
{
    int english;
    int maths;
    int science;

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setSocialscience(int socialscience) {
        this.socialscience = socialscience;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    int socialscience;
    int tamil;
    abstract public void calculatingAverage();

}
class Average extends Marks{
    int average;
    public void calculatingAverage()
    {
        average=(english+maths+science+socialscience+tamil)/5;
        System.out.println(average);
    }
}