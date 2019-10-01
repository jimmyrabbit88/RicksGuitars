public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS;

    public String toString(){
        switch(this){
            case FENDER: return "Fender";
            case GIBSON: return "Gibsob";
            case MARTIN: return "Martin";
            case COLLINGS: return "Collings";
            default: return "Fender";
        }
    }
}
