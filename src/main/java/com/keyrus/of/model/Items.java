package com.keyrus.of.model;

public  class Items {
    private String title;
    private String subtitle;
    private String coverImageUrl;

  public Items(){}
  public Items(String title, String subtitle, String coverImageUrl) {
    this.title = title;
    this.subtitle = subtitle;
    this.coverImageUrl = coverImageUrl;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }
}
