package net.strangled.maladan.serializables;

public class RegistrationResponseState implements java.io.Serializable {
    private boolean validRegistration;

    public RegistrationResponseState(boolean validRegistration) {
        this.validRegistration = validRegistration;
    }

    public boolean isValidRegistration() {
        return validRegistration;
    }
}