package Decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(Data data) {
        System.out.println("(CompressionDecorator) Сжимаем данные");
        super.writeData(data);
    }

    @Override
    public void readData() {
        System.out.println("(CompressionDecorator) Возвращаем данные к исходным");
        super.readData();
    }

}
