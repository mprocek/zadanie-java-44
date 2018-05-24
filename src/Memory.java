class Memory {
    String producent;
    String model;
    int ilosc;
    int taktowanie;

    Memory(String producent, int ilosc, int taktowanie){
        this.producent = producent;
        this.ilosc = ilosc;
        this.taktowanie = taktowanie;
    }

    Memory(String producent, String model, int ilosc, int taktowanie){
        this(producent, ilosc, taktowanie);
        this.model = model;
    }
}
