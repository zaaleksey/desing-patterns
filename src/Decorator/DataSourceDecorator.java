package Decorator;

public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    @Override
    public void writeData(Data data) {
        wrappee.writeData(data);
    }

    @Override
    public void readData() {
        wrappee.readData();
    }

}
