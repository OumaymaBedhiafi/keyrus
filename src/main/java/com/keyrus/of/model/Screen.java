package com.keyrus.of.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;


@RegisterForReflection
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screen  {

  @BsonId
  private ObjectId id;
  private String screenName;
  private String appId ;
  private List<AddedComponents> addedComponents;

  private Date createdAt;
  private Date updatedAt;

  private String  userName ;

  public String getScreenName() {
    return screenName;
  }
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {

  }
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  public void setAddedComponents(List<AddedComponents>  addedComponents) {
    this.addedComponents = addedComponents;
  }

}
