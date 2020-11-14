package ampl.ConcreteState;

import ampl.context.AbstractAppliance;
import api.ApplianceState;
import api.ApplianceStateBhavior;

public class UnknowState implements ApplianceStateBhavior {
    AbstractAppliance abstractAppliance;

    @Override
    public ApplianceState getState() {
        System.out.println("on reste dans l'etat"+this.getState());
        return this.getState();
    }

    @Override
    public ApplianceState start() {
        System.out.println("l'etat des départ est inconnu on reste " +this.getState());

        return this.getState();
    }

    @Override
    public ApplianceStateBhavior stop() {
        System.out.println("l'etat des départ est inconnu on reste " +this.getState());
        return this;
    }

    @Override
    public ApplianceStateBhavior turnOff() {
        System.out.println("l'etat des départ est inconnu on reste " +this.getState());
        return this;
    }

    @Override
    public ApplianceStateBhavior turnOn() {
        System.out.println("l'etat des départ est inconnu on reste " +this.getState());
        return this;
    }
}
