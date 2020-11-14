package ampl.ConcreteState;

import ampl.context.AbstractAppliance;
import api.ApplianceState;
import api.ApplianceStateBhavior;
import static api.ApplianceState.*;

public class StoppedState implements ApplianceStateBhavior {
    AbstractAppliance abstractAppliance;
    @Override
    public ApplianceState getState() {
        System.out.println("on reste dans l'etat"+this.getState());
        return abstractAppliance.getState();
    }

    @Override
    public ApplianceState start() {
        abstractAppliance.changeState(STARTED);
        return ApplianceState.STARTED.getStatebhavior().getState();
    }

    @Override
    public ApplianceStateBhavior stop() {
        return this;
    }

    @Override
    public ApplianceStateBhavior turnOff() {
        return null;
    }

    @Override
    public ApplianceStateBhavior turnOn() {
        return null;
    }
}
