public enum Style {
    A, E, F, ,G;

    public String toString(){

        switch(this){
            case A: return "A";
            case E: return "E";
            case F: return "F";
            case G: return "G";
            default: return "A";
        }
    }
}
