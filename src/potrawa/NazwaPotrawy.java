package potrawa;

public enum NazwaPotrawy {

    SZYNKA("Szynka"),
    MLEKO("Mleko"),
    KOSCI("Kosci"),
    KARMA_DLA_KOTA("Karma dla kota"),
    KARMA_DLA_PSA("Karma dla psa"),
    WODA("Woda"),
    BULKA("Bułka"),
    CHLEB("Chleb"),
    KARMA_DLA_RYB("Karma dla rybek"),
    SER("Ser");


    private String name;

    NazwaPotrawy(String name){
        this.name=name;
    }
    public String getNazwaPotrawy(){
        return name;
    }
}
