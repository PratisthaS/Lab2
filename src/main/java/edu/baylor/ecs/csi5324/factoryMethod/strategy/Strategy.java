package edu.baylor.ecs.csi5324.factoryMethod.strategy;

import edu.baylor.ecs.csi5324.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi5324.factoryMethod.store.Store;

import java.util.List;

public abstract class Strategy {



    public abstract void selectDistributor(Store store);


}
