package Decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(Data data) {
        System.out.println("(EncryptionDecorator) Кодируем данные");
        super.writeData(data);
    }

    @Override
    public void readData() {
        System.out.println("(EncryptionDecorator) Декодируем данные");
        super.readData();
    }


}
