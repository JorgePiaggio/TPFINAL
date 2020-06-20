package TPF.Modelo;

import java.io.Serializable;

public enum Propulsion implements Serializable {
    HEL ("Motor a hélice"),
    REAC ("Motor a reaccion"),
    PIST ("Motor de pistones");

    private String motor;

    Propulsion(String motor) {
        this.motor=motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Propulsion: " + motor;
    }
}
