class Joystick {
    private Command buttonA;
    private Command buttonB;
    private Command buttonC;

    public void setButtonA(Command comando) {
        this.buttonA = comando;
    }

    public void setButtonB(Command comando) {
        this.buttonB = comando;
    }

    public void setButtonC(Command comando) {
        this.buttonC = comando;
    }

    public void pressButtonA() {
        if (buttonA != null) {
            buttonA.execute();
        }
    }

    public void pressButtonB() {
        if (buttonB != null) {
            buttonB.execute();
        }
    }

    public void pressButtonC() {
        if (buttonC != null) {
            buttonC.execute();
        }
    }
}