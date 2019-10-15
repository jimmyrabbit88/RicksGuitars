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


//    public Guitar getGuitar(String serialNumber){
//        for(Iterator i = guitarSpecs.iterator(); ((Iterator) i).hasNext();){
//            Guitar guitar = (Guitar)i.next();
//            if(guitar.getSerialNumber().equals(serialNumber)){
//                return guitar;
//            }
//        }
//        return null;
//    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is unique

            Builder builder = searchSpec.getBuilder();
            if((builder !=null) && (!builder.equals("")) &&
                    (!builder.equals(guitar.getGuitarSpec().getBuilder())))
                continue;

            String model = searchSpec.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getGuitarSpec().getModel())))
                continue;

            Type type = searchSpec.getType();
            if ((type != null) && (!searchSpec.equals("")) &&
                    (!type.equals(guitar.getGuitarSpec().getType())))
                continue;

            Wood backWood = searchSpec.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) &&
                    (!backWood.equals(guitar.getGuitarSpec().getBackWood())))
                continue;
            Wood topWood = searchSpec.getBackWood();
            if ((topWood != null) && (!topWood.equals("")) &&
                    (!topWood.equals(guitar.getGuitarSpec().getTopWood())))
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
