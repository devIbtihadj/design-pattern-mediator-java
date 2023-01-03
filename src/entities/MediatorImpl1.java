package entities;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl1 extends Mediator{

    private List<Message> conversations = new ArrayList<Message>();

    @Override
    public void transmettreMessage(Message message) {
        System.out.println("--------- Debut Médiateur ---------");
        System.out.println("Enregistrement du message");
        conversations.add(message);
        System.out.println("Transmission du message");
        System.out.println("From : "+message.getExpediteur());
        System.out.println("To :"+message.getDestinataire());
        Colleague destinataire = colleagues.get(message.getDestinataire());
        destinataire.recevoirMessage(message);
        System.out.println("--------- Fin Médiateur --------------");
    }


    public void analyserConversations(){
        for (Message m: conversations) {
            System.out.println(m.toString());
        }
    }
}
