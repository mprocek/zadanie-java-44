class ComputerAssembly {
    Computer assembly(String nazwa, String nazwaProcesora, int taktowanieProcesora, String nazwaPamięci, int ilosc, int taktowaniePamieci){
        Procesor procesor1 = new Procesor(nazwaProcesora, taktowanieProcesora);
        Memory memory1= new Memory(nazwaPamięci,ilosc, taktowaniePamieci);
        return new Computer(nazwa, procesor1, memory1);
    }
}

