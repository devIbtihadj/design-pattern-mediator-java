package entities;

public class ColleagueA extends Colleague{
    public ColleagueA(String name, Mediator mediator) {
        super(name, mediator);
    }
    @Override
    public void envoyerMessage(Message message) {
        System.out.println("---------------------------");
        System.out.println("Collègue nom "+name+", Envoi de message");
        message.setExpediteur(this.name);
        mediator.transmettreMessage(message);
        System.out.println("----------------------------");
    }
    @Override
    public void recevoirMessage(Message message) {
        System.out.println("-----------------------------");
        System.out.println("Collègue nom "+name+", Réception message");
        System.out.println("From :"+ message.getExpediteur());
        System.out.println("Contenu :"+message.getMessage());
        System.out.println("Traitement du message par "+this.name+"....");
    }
}
