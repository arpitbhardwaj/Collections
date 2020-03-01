package test.java;

import com.ab.collections.Supplier;
import com.ab.collections.sets.ProductCatalogue;
import org.junit.After;
import org.junit.Test;

import static com.ab.collections.lists.ProductFixtures.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception{
        ProductCatalogue productCatalogue = new ProductCatalogue();

        productCatalogue.isSuppliedBy(bobs);
        productCatalogue.isSuppliedBy(kates);

        assertThat(productCatalogue, containsInAnyOrder(door,floorPanel,window));
    }
    @Test
    public void shouldFindLightVanProducts() throws Exception{
        ProductCatalogue productCatalogue = new ProductCatalogue();

        productCatalogue.isSuppliedBy(bobs);
        productCatalogue.isSuppliedBy(kates);

        assertThat(productCatalogue.lightVanProducts(), containsInAnyOrder(window));
    }

    @Test
    public void shouldFindHeavyVanProducts() throws Exception{
        ProductCatalogue productCatalogue = new ProductCatalogue();

        productCatalogue.isSuppliedBy(bobs);
        productCatalogue.isSuppliedBy(kates);

        assertThat(productCatalogue.heavyVanProducts(), containsInAnyOrder(door,floorPanel));
    }
}