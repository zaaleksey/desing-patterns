package Example.Memento;

import java.util.LinkedList;
import java.util.List;

public class EditorMemento {

  private String content;
  public static List<EditorMemento> mementos = new LinkedList<>();

  public EditorMemento(String content) {
    this.content = content;
  }

  public String getContent() {
    return this.content;
  }

}
