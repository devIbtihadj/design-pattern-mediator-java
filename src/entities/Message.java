package entities;

public class Message {
    private String message;
    private String destinataire;

    private String expediteur;

    public Message(String message, String destinataire) {
        this.message = message;
        this.destinataire = destinataire;
    }

    public Message() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", destinataire='" + destinataire + '\'' +
                ", expediteur='" + expediteur + '\'' +
                '}';
    }
}
