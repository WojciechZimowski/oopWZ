public interface Shape {
     //Style gangam;//protected- tylko klasy które dziedziczą to widzą

//    public Shape(Style gangam) {
//        this.gangam = gangam;
//    }
//    public Style getGangam() {
//        return gangam;
//    }
//    public Shape()  {
//
//    }
//
//    public void setGangam(Style gangam) {
//        this.gangam = gangam;
//    }
    String toSvg();

    String toSvg(String param);

}
