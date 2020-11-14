package ampl.context;

import ampl.ConcreteState.OnState;
import api.ApplianceState;
import api.ApplianceStateBhavior;
import static api.ApplianceState.*;

public class Toster extends AbstractAppliance {


    public Toster(ApplianceState initialeState) {
        super(initialeState);
    }

    @Override
    public ApplianceState start() {
        return getState().getStatebhavior().start();
    }

    @Override
    public ApplianceStateBhavior stop() {
        return getState().getStatebhavior().stop();
    }

    @Override
    public String toString() {
        return "Toster{}";
    }

    @Override
    public ApplianceStateBhavior tunOFF() {
        return getState().getStatebhavior().turnOn();
    }

    @Override
    public ApplianceStateBhavior turnOn() {
        return getState().getStatebhavior().turnOn();
    }


    @Override
    public ApplianceStateBhavior turnOff() {

        return getState().getStatebhavior().turnOff();
    }
}
