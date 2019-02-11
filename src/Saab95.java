import java.awt.*;

public class Saab95 extends AbstractCar implements Movable {
    /***
     * Variable which shows whether the turbo in SAAB95 is on or off
     */
    private boolean turboOn;


    /***
     * Constructor for SAAB95
     * @param nrDoors see AbstractCar
     * @param enginePower see AbstractCar
     * @param currentSpeed see AbstractCar
     * @param color see AbstractCar
     * @param modelName see AbstractCar
     * @param x see AbstractCar
     * @param y see AbstractCar
     * @param turboOn boolean if turbo is on or off
     */
    public Saab95(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, double x, double y, boolean turboOn) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
      /*  nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();*/
        //  super(nrDoors, enginePower, currentSpeed, color, modelName, x, y, dx, dy);
        this.turboOn = turboOn;
        //stopEngine();

    }


    /***
     * Sets boolean turboOn to true
     */
    public void setTurboOn() {
        this.turboOn = true;
    }

    /***
     * Sets boolean turboOn to false
     */
    public void setTurboOff() {
        this.turboOn = false;
    }

    /***
     * Checks turbo status
     * @return boolean turboOn
     */

    public boolean getTurboStatus() {
        return turboOn;
    }


    /***
     *  velocity factor of the Saab95
     * @return Total velocity of the Saab95
     */

    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }


}