package api;

import ampl.ConcreteState.*;

public enum ApplianceState {
    OFF(new OffStat()),
    STOPPED(new StoppedState()),
    STARTED(new StartesState()),
    UNKNOW(new UnknowState()),
    ON(new OnState());
    private ApplianceStateBhavior statebhavior;
    private Appliance context;

    private ApplianceState(ApplianceStateBhavior stateBhavior) {
        this.statebhavior=stateBhavior;

    }


    public void setContext(Appliance appliance) {
        this.context=appliance;
    }

    public ApplianceStateBhavior getStatebhavior() {
        return statebhavior;
    }

    public Appliance getContext() {
        return context;
    }
}
