package Decorator;

public class Main {

    public static void main(String[] args) {
        String fileName = "input.txt";
        Data data = new Data() {};

        DataSource dataSource = new FileDataSource(fileName);
        dataSource.writeData(data);
        dataSource.readData();
        System.out.println("-".repeat(50));

        DataSourceDecorator decorator1 = new EncryptionDecorator(dataSource);
        decorator1.writeData(data);
        decorator1.readData();
        System.out.println("-".repeat(50));

        DataSourceDecorator decorator2 = new CompressionDecorator(decorator1);
        decorator2.writeData(data);
        decorator2.readData();
        System.out.println("-".repeat(50));

        // - or -
        DataSourceDecorator decorator = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(fileName)
                )
        );
        decorator.writeData(data);
        decorator.readData();
        System.out.println("-".repeat(50));
    }

}
