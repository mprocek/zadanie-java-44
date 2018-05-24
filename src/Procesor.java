class Procesor {
    String producent;
    String model;
    int taktowanie;

    Procesor(String producent, int taktowanie){
        this.producent = producent;
        this.taktowanie = taktowanie;
    }

    Procesor(String producent, String model, int taktowanie){
        this(producent, taktowanie);
        this.model = model;
    }

}
