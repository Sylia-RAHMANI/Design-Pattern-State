package ampl.ConcreteState;

import ampl.context.AbstractAppliance;
import api.ApplianceState;
import api.ApplianceStateBhavior;

import static api.ApplianceState.OFF;

public class StartesState implements ApplianceStateBhavior {
    AbstractAppliance abstractAppliance;
    @Override
    public ApplianceState getState() {
        System.out.println("on reste dans l'etat"+this.getState());
        return this.getState();
    }

    @Override
    public ApplianceState start() {
        return this.getState();
    }

    @Override
    public ApplianceStateBhavior stop() {

        abstractAppliance.changeState(OFF);
        System.out.println("on est dans l'état : " +this.getState());
        return OFF.getStatebhavior();
    }

    @Override
    public ApplianceStateBhavior turnOff() {
        return this;
    }

    @Override
    public ApplianceStateBhavior turnOn() {
        return this;
    }
}
