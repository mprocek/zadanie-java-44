class Computer {
    String nazwa;
    Procesor procesor;
    Memory memory;

    Computer(String nazwa, Procesor procesor, Memory memory){
        this.nazwa = nazwa;
        this.procesor = procesor;
        this.memory = memory;
    }

    void showInfo(){
        System.out.println("Nazwa: " + nazwa + ", procesor: " + procesor.producent + " " + procesor.model + " " + procesor.taktowanie +
                ", pamiec: " + memory.producent + " " + memory.model + " " + memory.ilosc + " " + memory.taktowanie);

    }
}
