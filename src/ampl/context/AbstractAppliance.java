package ampl.context;

import api.Appliance;
import api.ApplianceState;
import api.ApplianceStateBhavior;


public abstract class AbstractAppliance implements Appliance, ApplianceStateBhavior {
    ApplianceState state ;

    public AbstractAppliance(ApplianceState initialState) {
       this.state=initialState;
    }


    public void changeState(ApplianceState state){
        this.state=state;

    }

    public ApplianceState getState(){
        return this.state;
    }

    public abstract ApplianceState start();


    public abstract ApplianceStateBhavior stop();

    @Override
    public abstract ApplianceStateBhavior tunOFF();

    @Override
    public abstract ApplianceStateBhavior turnOn();



}
