package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String gakka;

  public Student(String id, String name, String gakka) {
    this.setId(id);
    this.setName(name);
    this.setGakka(gakka);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGakka() {
    return gakka;
  }
  public void setGakka(String gakka) {
    this.gakka = gakka;
  }
}
