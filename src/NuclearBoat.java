public class NuclearBoat {
    void launchEngine(){
        NuclearBoatEngine nuclearBoatEngine = new NuclearBoatEngine();
        nuclearBoatEngine.startEngine();
    }
    public class NuclearBoatEngine{
        void startEngine(){
            System.out.println("You successfully launch nuclear engine of nuclear boat!");
        }
    }
}
