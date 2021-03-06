/**
 * 
 */
package ija.ija2017.items.connection;

import ija.ija2017.interfaces.PortItemInterface;

/**
 * @author xfryct00
 *
 */
public class PortItem implements PortItemInterface {

    static private int currentPortItemId = 1;
    private int portItemId;
    private int pipeItemId;
    private int inputBlockId = 0;
    private String name;
    private type type;
    private double value = 0.0;

    public PortItem(type type) {
        this.type = type;
        this.portItemId = currentPortItemId++;
    }

    public int getInputBlockId() {
        return inputBlockId;
    }

    public void setInputBlockId(int inputBlockId) {
        this.inputBlockId = inputBlockId;
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

    public int getPipeItemId() {
        return this.pipeItemId;
    }

    public int getPortItemId() {
        return this.portItemId;
    }

    public type getType() {
        return this.type;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setPipeItemId(int pipeItemId) {
        this.pipeItemId = pipeItemId;
    }
}
