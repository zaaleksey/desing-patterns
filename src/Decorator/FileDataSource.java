package Decorator;

public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(Data data) {
        System.out.println("(FileDataSource) Запись данных в файл с именем " + this.fileName);
    }

    @Override
    public void readData() {
        System.out.println("(FileDataSource) Чтение данных");
    }
}
