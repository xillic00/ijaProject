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
public class SubBlockItem extends BlockItemAbstract {

    public SubBlockItem() {
        super.BlockItemAbstract();
        this.type = BlockItemInterface.type.SUB;
        this.blockItemId = currentBlockItemId++;
        this.outputPort = new PortItem(PortItemInterface.type.output);
    }

    @Override
    public boolean execute() {
        double result = 0.0;

        for (int i = 0; i < getInputPorts().size(); i++){
            if(i == 0)
                result = getInputPorts().get(i).getValue();
            else
                result -= getInputPorts().get(i).getValue();
//            System.out.printf("The SUB is %f\n" , result);

            if (result > Double.MAX_VALUE) {
                System.out.printf("SUB pretekl\n");
                //            TODO    event
            } else if (result < -Double.MAX_VALUE) {
                System.out.printf("SUB podtekl\n");
            }
        }

        setOutputPortValue(result);
        return true;

//        System.out.printf("%f", getOutputPort().getValue());
    }
}
