package ampl.ConcreteState;

import ampl.context.AbstractAppliance;
import api.ApplianceState;
import api.ApplianceStateBhavior;

import static api.ApplianceState.OFF;
import static api.ApplianceState.STARTED;

public class OnState implements ApplianceStateBhavior {
    private AbstractAppliance abstractAppliance;


    public ApplianceState getState() {
        return abstractAppliance.getState();
    }

    @Override
    public ApplianceState start() {

        System.out.println("on reste dans l'etat"+this.getState());
        return this.getState();
    }

    @Override
    public ApplianceStateBhavior stop() {
        System.out.println("on reste dans l'etat stop");
        return this;
    }

    @Override
    public ApplianceStateBhavior turnOff() {
        System.out.println("on va dans l'etat OFF");
        abstractAppliance.changeState(OFF);
        return ApplianceState.OFF.getStatebhavior();
    }

    @Override
    public ApplianceStateBhavior turnOn() {
        System.out.println("on va dans un etat démarrer");
        abstractAppliance.changeState(STARTED);
        return ApplianceState.STARTED.getStatebhavior();
    }
}
