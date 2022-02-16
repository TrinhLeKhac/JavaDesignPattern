package Builder;

public class TestBuilderPattern {

    public static void main(String[] args) {
        ComputerFull computerFull = new ComputerFull.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println("Builder pattern of ComputerFull: " + computerFull.toString());
    }
}
