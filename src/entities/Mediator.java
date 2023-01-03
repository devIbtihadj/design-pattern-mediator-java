package entities;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediator {
    protected Map<String, Colleague> colleagues = new HashMap<String, Colleague>();

    public abstract void transmettreMessage(Message message);

    public void addColleague(String ref, Colleague colleague){
        colleagues.put(ref, colleague);
    }
}
