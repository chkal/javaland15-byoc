package de.chkal.todo.faces;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.chkal.todo.model.Item;
import de.chkal.todo.service.TodoService;

@Named
@RequestScoped
public class TodoAddBean {

  private String title;

  @Inject
  private TodoService todoService;

  public String add() {

    Item item = new Item();
    item.setTitle(title);

    todoService.addItem(item);

    title = null;
    return null;

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

}
