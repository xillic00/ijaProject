/**
 *
 */
package ija.ija2017.items.block;

import ija.ija2017.interfaces.BlockItemInterface;
import ija.ija2017.interfaces.PortItemInterface;
import ija.ija2017.items.connection.PortItem;

/**
 * @author xfryct00
 *
 */
public class SumBlockItem extends BlockItemAbstract {

    public SumBlockItem() {
        super.BlockItemAbstract();
        this.type = BlockItemInterface.type.SUM;
        this.blockItemId = currentBlockItemId++;
        this.outputPort = new PortItem(PortItemInterface.type.output);
    }

    @Override
    public boolean execute() {
        double result = 0.0;

        for (int i = 0; i < getInputPorts().size(); i++){
            result += getInputPorts().get(i).getValue();

            if (result > Double.MAX_VALUE) {
                System.out.printf("SUM pretekl\n");
                //            TODO    event
            } else if (result < -Double.MAX_VALUE) {
                System.out.printf("SUM podtekl\n");
            }
        }

        setOutputPortValue(result);
        System.out.printf("%f", getOutputPort().getValue());
        return true;
    }
}
