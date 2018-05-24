class Overclock {
    void increaseCpuClock(Computer computer, int wartosc){
        computer.procesor.taktowanie = computer.procesor.taktowanie + wartosc;
    }

    void decreaseCpuClock (Computer computer, int wartosc){
        computer.procesor.taktowanie = computer.procesor.taktowanie - wartosc;
    }
}
