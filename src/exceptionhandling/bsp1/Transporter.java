package exceptionhandling.bsp1;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {

        if(urgent && Math.random() < 0.5)
            throw new TransporterMalfunctionException();
        System.out.println(person + " has been beamed from " + from + " to " + to + "!");

    }

    public void shutdown(){
        System.out.println("Shutting down...");
    }

}
