package com.keyrus.of.model;

public class AddedComponents {
  private String type;
  private String organismName;
  private String sectionTitle;
  private String org_name;
  private String image;
  private String componentProperty;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  private  String uuid;
  private boolean isSelected;
  private Items items;

  public AddedComponents(String type, String organismName, String uuid ,String sectionTitle, String org_name, String image, String componentProperty, boolean isSelected, Items items) {
    this.type = type;
    this.organismName = organismName;
    this.sectionTitle = sectionTitle;
    this.org_name = org_name;
    this.image = image;
    this.uuid=uuid;
    this.componentProperty = componentProperty;
    this.isSelected = isSelected;
    this.items = items;
  }
  public AddedComponents() {
    this.type = type;
    this.organismName = organismName;
    this.sectionTitle = sectionTitle;
    this.org_name = org_name;
    this.image = image;
    this.uuid=uuid;
    this.componentProperty = componentProperty;
    this.isSelected = isSelected;
    this.items = items;
  }

  public String getType() {
    return type;
  }

  public AddedComponents(String type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOrganismName() {
    return organismName;
  }

  public void setOrganismName(String organismName) {
    this.organismName = organismName;
  }

  public String getSectionTitle() {
    return sectionTitle;
  }

  public void setSectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
  }

  public String getOrg_name() {
    return org_name;
  }

  public void setOrg_name(String org_name) {
    this.org_name = org_name;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getComponentProperty() {
    return componentProperty;
  }

  public void setComponentProperty(String componentProperty) {
    this.componentProperty = componentProperty;
  }

  public boolean isSelected() {
    return isSelected;
  }

  public void setSelected(boolean selected) {
    isSelected = selected;
  }

  public Items getItems() {
    return items;
  }

  public void setItems(Items items) {
    this.items = items;
  }
}
