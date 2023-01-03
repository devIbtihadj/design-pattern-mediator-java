package entities;
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addColleague(name, this);
    }
    //On pouvait toutefois implémenter directement les méthodes. Ici, les méthodes abstraites nous permettent de
    // pouvoir implementer
    //plusieurs protocoles de transmission selon les différentes implementations
    public abstract void envoyerMessage(Message message);
    public abstract void recevoirMessage(Message message);
}
