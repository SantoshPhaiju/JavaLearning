package College.Inheritances;

public class Thiago implements Messi, Antonella {
    @Override
    public void playForArgentina() {
        System.out.println("Thiago is playing for Argentina");
    }

    @Override
    public void playForBarca() {
        System.out.println("Thiago is playing for Barca");
    }

    @Override
    public void practiseInGround() {
        System.out.println("Thiago is Training in Football Ground");
    }

    @Override
    public void showKindness() {
        System.out.println("Thiago is showing Kindness to all of his fans.");
    }

    @Override
    public void showRespect() {
        System.out.println("Thiago is showing Respect for his coaches and parents.");
    }
}
