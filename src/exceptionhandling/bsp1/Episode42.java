package exceptionhandling.bsp1;

public class Episode42 {

    public static void main(String[] args) {

        Starship starship = new Starship("Enterprise", new Transporter());
        starship.beamUp("Captain Kirk", "Riga IV");

    }

}
