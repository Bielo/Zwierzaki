package zwierzaki;

public enum NazwaPotrawy {

    SZYNKA("Szynka"),
    MLEKO("Mleko"),
    KOSCI("Kosci"),
    KARMA_DLA_KOTA("Karma dla kota"),
    KARMA_DLA_PSA("Karma dla psa"),
    WODA("Woda"),



    private String name;

    NazwaPotrawy(String name){
        this.name=name;
    }
    public String getNazwaPotrawy(){
        return name;
    }
}
