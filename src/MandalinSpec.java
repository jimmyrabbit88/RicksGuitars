public class MandalinSpec extends InstrumentSpec {
    private Style style;

    public MandalinSpec(Builder builder, String model, Type type, int numStrings, Wood backwood, Wood topwood){
        super(builder, model, type, backwood, topwood);
        this.style = style;
    }



    public Style getStyle() { return style; }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec)){
            return false;
        }
        if(!(otherSpec instanceof MandalinSpec)){
            return false;
        }
        MandalinSpec spec = (MandalinSpec) otherSpec;
        if(!style.equals(spec.style)){
            return false;
        }
        return true;
    }
}
