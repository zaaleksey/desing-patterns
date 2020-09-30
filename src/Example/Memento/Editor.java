package Example.Memento;

import java.util.LinkedList;
import java.util.List;

public class Editor {

  private String content;

  public Editor(String content) {
    this.content = content;
  }

  public EditorMemento saveState() {
    return new EditorMemento(this.content);
  }

  public void restore(EditorMemento memento) {
    this.content = memento.getContent();
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
    EditorMemento.mementos.add(saveState());
  }

}
