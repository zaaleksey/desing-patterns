package Example.Memento;

public class Main {

  public static void main(String[] args) {

    Editor editor = new Editor("");
    editor.setContent("Первое новое состояние редактора...");
    editor.setContent("Второе новое состояние редактора...");
    editor.setContent("...");
    editor.setContent("...");
    editor.setContent("...");
    editor.setContent("...");

    System.out.println("Восстанавливаем историю редактора:");
    System.out.println("-".repeat(50));
    for (EditorMemento memento : editor.mementos) {
      System.out.println(memento.getContent());
    }
  }

}
