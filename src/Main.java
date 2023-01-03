import entities.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********** Test de notre programme **********");
        MediatorImpl1 mediatorImpl1 = new MediatorImpl1();
        Colleague a1 = new ColleagueA("C1", mediatorImpl1);
        Colleague a2 = new ColleagueA("C2", mediatorImpl1);
        Colleague b1 = new ColleagueB("C3", mediatorImpl1);

        a1.envoyerMessage(new Message("Je suis près de but", "C2"));
        a2.envoyerMessage(new Message("Tu es mon crush", "C1"));
        b1.envoyerMessage(new Message("Forget about", "C2"));

        mediatorImpl1.analyserConversations();
    }
}