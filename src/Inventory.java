import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List inventory;

    public Inventory(){
        inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        Instrument instrument = null;
        if(spec instanceof GuitarSpec){
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
        }
        else if (spec instanceof MandalinSpec){
            instrument = new Mandalin(serialNumber, price, (MandalinSpec)spec);
        }
        inventory.add(instrument);

    }

    public Instrument get(String serialNumber){
        for(Iterator i = inventory.iterator(); i.hasNext();){
            Instrument instrument = (Instrument)i.next();
            if(instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSpec().matches((searchSpec))) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
    public List search(MandalinSpec searchSpec) {
        List matchingMandalins = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Mandalin mandalin = (Mandalin) i.next();
            if (mandalin.getSpec().matches((searchSpec))) {
                matchingMandalins.add(mandalin);
            }
        }
        return matchingMandalins;
    }
}
