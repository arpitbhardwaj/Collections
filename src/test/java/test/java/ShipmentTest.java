package test.java;

import com.ab.collections.Product;
import com.ab.collections.lists.ProductFixtures;
import com.ab.collections.lists.Shipment;
import org.junit.Test;


import static com.ab.collections.lists.ProductFixtures.*;
import static org.hamcrest.Matchers.contains;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

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

        assertThat(shipment, contains(door,floorPanel));
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
    }
}