class ComputerTest {
    public static void main(String[] args) {
        Procesor procesor1 = new Procesor("Intel", "i5", 1700);
        Memory memory1 = new Memory("Kingston", "DDR2", 8, 1100);
        Computer computer1 = new Computer("Model Standard", procesor1, memory1);

        Procesor procesor2 = new Procesor("Intel", "i7", 2500);
        Memory memory2 = new Memory("Kingston", "DDR4", 32, 2200);
        Computer computer2 = new Computer("Model High", procesor2, memory2);

        computer1.showInfo();
        computer2.showInfo();

        Overclock overclock = new Overclock();
        overclock.increaseCpuClock(computer1, 500); //zwiekszenie o 500
        computer1.showInfo();

        overclock.decreaseCpuClock(computer2, 100);//zmniejszenie o 100
        computer2.showInfo();

        ComputerAssembly computerAssembly = new ComputerAssembly();
        Computer computer3 = computerAssembly.assembly("Model ClassAssembly", "AMD", 1400, "Kingston", 16,900);
        computer3.showInfo();

    }
}
