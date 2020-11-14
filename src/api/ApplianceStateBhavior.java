package api;

public interface ApplianceStateBhavior {


    ApplianceState getState();
    ApplianceState start();
    ApplianceStateBhavior stop();
    ApplianceStateBhavior turnOff();
    ApplianceStateBhavior turnOn();


}
