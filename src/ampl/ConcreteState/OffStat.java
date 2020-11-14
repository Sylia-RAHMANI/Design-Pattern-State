package ampl.ConcreteState;

import ampl.context.AbstractAppliance;
import api.ApplianceState;
import api.Appliance;
import api.ApplianceStateBhavior;

import static api.ApplianceState.ON;


public class OffStat implements ApplianceStateBhavior {
    AbstractAppliance abstractAppliance;



    public ApplianceState getState() {
        System.out.println("on reste dans l'etat"+this.getState());
        return abstractAppliance.getState();
    }


    public ApplianceState start() {
        return this.getState();
    }


    public ApplianceStateBhavior stop() {
        return this;
    }


    public ApplianceStateBhavior turnOff() {
        return this;
    }


    public ApplianceStateBhavior turnOn() {

        abstractAppliance.changeState(ON);
        return ON.getStatebhavior();
    }





}
