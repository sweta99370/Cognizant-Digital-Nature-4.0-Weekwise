public class BuilderTest {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 4080")
                .build();

        System.out.println("Basic PC Configuration:");
        basicPC.showConfig();

        System.out.println("\nGaming PC Configuration:");
        gamingPC.showConfig();
    }
}
