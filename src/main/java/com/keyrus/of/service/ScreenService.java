package com.keyrus.of.service;


import com.keyrus.of.model.Screen;
import com.keyrus.of.repository.ScreenRepository;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;

@ApplicationScoped

public class ScreenService {

    @Inject
    ScreenRepository screenRepository;



    public List<Screen> getAll(String user, String appId) {
      //return screenRepository.find("{ $and: [ { 'userName': '" + user + "' }, { 'appid': '" + appId + "' } ] }").list();
      return screenRepository.find("{ userName: ?1 , appId: ?2}", user, appId).list();

    }

  public Screen addScreen(Screen screen) {
    Screen screen1 = new Screen();
    screen1.setScreenName(screen.getScreenName());
    screen1.setUserName(screen.getUserName());
    screen1.setAddedComponents(screen.getAddedComponents());
    screen1.setAppId(screen.getAppId());
    screen1.setCreatedAt(new Date());
    screen1.setUpdatedAt(new Date());
    screenRepository.persist(screen1);
    return screen1;
  }


  public Screen updateScreenName(Screen screen) {

    if (screen != null) {
      screenRepository.update(screen);
    }
    return screen;
  }
    public Response deleteScreen(String id) {
        Screen screen = screenRepository.findById(new ObjectId(id));
        screenRepository.delete(screen);
        return Response.ok().build();
    }
}

