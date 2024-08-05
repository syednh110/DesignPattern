package behavioraldesignpatterns.statedesignpattern.before;

public class SwitchDesign {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void stateChange(){
        if(state.equals("ON")){
            System.out.println("System is ON");
        }
        if(state.equals("OFF")){
            System.out.println("System is OFF");
        }
    }

}
