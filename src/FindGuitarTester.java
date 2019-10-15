import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec( Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER,Wood.ALDER);

        List matchingGuitars = inventory.search(whatLookingFor);
        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like these: ");

            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar) i.next();

                System.out.println("We have a " + guitar.getGuitarSpec().getBuilder() +
                        " " + guitar.getGuitarSpec().getModel() + " " + guitar.getGuitarSpec().getType() + " guitar: " +
                        guitar.getPrice());
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }

    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        inventory.addGuitar("v1",
                1000,
                Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("v1",
                1000,
                Builder.FENDER ,
                "Stratocastor",
                Type.ACOUSTIC,
                Wood.ALDER,
                Wood.ALDER);

    }
}