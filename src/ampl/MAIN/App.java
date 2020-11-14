package ampl.MAIN;


import ampl.ConcreteState.*;
import ampl.context.*;
import api.ApplianceState;
import api.ApplianceStateBhavior;


import static api.ApplianceState.ON;

public class App {

    public static void main(String[] args) {
        Toster toster=new Toster(ON);
        System.out.println( "à present on est dans l'état: "+toster.getState());
        ApplianceStateBhavior afterTunOFF= toster.turnOff();


    }


    }

