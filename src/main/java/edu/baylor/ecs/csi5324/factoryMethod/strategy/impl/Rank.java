package edu.baylor.ecs.csi5324.factoryMethod.strategy.impl;

import edu.baylor.ecs.csi5324.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi5324.factoryMethod.store.Store;
import edu.baylor.ecs.csi5324.factoryMethod.strategy.Strategy;

import java.util.List;


public class Rank extends Strategy {

    public void selectDistributor(Store store) {
        int index = 0;
        double rank = 0;
        for (int i = 0; i < store.getDistributorList().size(); i++) {
            Distributor distributor = store.getDistributorList().get(i);
            if (distributor.getRank() > rank) {
                index = i;
                rank = distributor.getRank();
            }
            System.out.println("* " + distributor.getClass().getSimpleName());
        }
         store.selectDistributor(index);
    }
}
