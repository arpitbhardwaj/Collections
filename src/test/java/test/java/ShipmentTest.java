package test.java;

import com.ab.collection.lists.Shipment;
import org.junit.Test;


import static com.ab.collection.lists.ProductFixtures.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShipmentTest {
    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception{
        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, contains(door,window));
    }

    @Test
    public void shouldReplaceItems() throws Exception{
        shipment.add(door);
        shipment.add(window);
        shipment.replace(door,floorPanel);

        assertThat(shipment, contains(floorPanel,window));
    }
    @Test
    public void shouldNotReplaceMissingItems() throws Exception{
        shipment.add(window);
        shipment.replace(door,floorPanel);

        assertThat(shipment,contains(window));
    }
    @Test
    public void shouldIdentifyVanRequirements() throws Exception{
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();

        assertThat(shipment.getHeavyVanProducts(), contains(floorPanel,door));
        assertThat(shipment.getLightVanProducts(),contains(window));
    }
}