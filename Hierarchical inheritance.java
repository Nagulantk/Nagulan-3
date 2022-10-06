public class Main {
    public static void main(String[] args) {
        Cricket cricket=new Cricket();
        System.out.println("Cricket");
        cricket.batting();
        cricket.fullSquad();
        cricket.bowling();
        cricket.fielding();
        cricket.coach();
        cricket.playingTeamMembers();
        cricket.audience();
        cricket.sponsors();
        Football football=new Football();
        System.out.println("Football");
        football.defending();
        football.fullSquad();
        football.striking();
        football.coach();
        football.audience();
        football.sponsors();
        football.playingTeamMembers();
        Kabaddi kabaddi=new Kabaddi();
        System.out.println("Kabaddi");
        kabaddi.playingTeamMembers();
        kabaddi.raiding();
        kabaddi.tackling();
        kabaddi.coach();
        kabaddi.audience();
        kabaddi.fullSquad();
        kabaddi.sponsors();
    }
}
class Sports
{
    public void playingTeamMembers()
    {
        System.out.println("Players counts will be 11");
    }
    public void fullSquad()
    {
        System.out.println("Having full squad of 20 members");
    }
    public void sponsors()
    {
        System.out.println("Having Jersey sponsor and Kit sponsor");
    }
    public void coach()
    {
        System.out.println("Having coaches for various deparment");
    }
    public void audience()
    {
        System.out.println("Having large fan following");
    }
}
class Cricket extends Sports
{
    public void batting()
    {
        System.out.println("Batsmen who scores runs");
    }
    public void bowling()
    {
        System.out.println("Bowlers who takes wickets");
    }
    public void fielding()
    {
        System.out.println("Fielders who saves runs");
    }
}
class Football extends Sports{
    public void striking()
    {
        System.out.println("Strikers who strikes goals");
    }
    public void defending()
    {
        System.out.println("Defenders who defends goals");
    }
}
class Kabaddi extends Sports{
    public void raiding()
    {
        System.out.println("Raiding who get touch points");
    }
    public void tackling()
    {
        System.out.println("Defenders who want to catch the raiders");
    }

    @Override
    public void playingTeamMembers() {
     System.out.println("Players count will be 7");
    }
}