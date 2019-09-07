package edu.baylor.ecs.csi5324.factoryMethod.strategy.impl;

import edu.baylor.ecs.csi5324.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi5324.factoryMethod.store.Store;
import edu.baylor.ecs.csi5324.factoryMethod.strategy.Strategy;

import java.util.List;

public class Price extends Strategy {


    public void selectDistributor(Store store) {
        int index = 0;
        double charge = 0;
        double distributorCharge;
        for (int i = 0; i < store.getDistributorList().size(); i++) {
            Distributor distributor = store.getDistributorList().get(i);
             distributorCharge = distributor.getCharge().doubleValue();
            if (distributorCharge > charge) {
                index = i;
                charge = distributorCharge;
            }
            System.out.println("* " + distributor.getClass().getSimpleName());
        }
        store.selectDistributor(index);
    }

}
