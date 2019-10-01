import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type,  Wood backWood, Wood topWood){
        Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(Guitar searchGuitar) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is unique

            Builder builder = searchGuitar.getBuilder();
            if((builder !=null) && (!builder.equals("")) &&
                    (!builder.equals(guitar.getBuilder())))
                continue;

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel())))
                continue;

            Type type = searchGuitar.getType();
            if ((type != null) && (!searchGuitar.equals("")) &&
                    (!type.equals(guitar.getType())))
                continue;

            Wood backWood = searchGuitar.getBackwood();
            if ((backWood != null) && (!backWood.equals("")) &&
                    (!backWood.equals(guitar.getBackwood())))
                continue;
            Wood topWood = searchGuitar.getBackwood();
            if ((topWood != null) && (!topWood.equals("")) &&
                    (!topWood.equals(guitar.getTopwood())))
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
