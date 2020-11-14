package api;

import api.ApplianceState;
import api.ApplianceStateBhavior;

public interface Appliance {


    ApplianceState start();
    ApplianceStateBhavior stop();
    ApplianceStateBhavior tunOFF();
    ApplianceStateBhavior turnOn();
}

