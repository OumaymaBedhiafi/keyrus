package com.keyrus.of.resource;

import com.keyrus.of.model.Screen;
import com.keyrus.of.model.User;
import com.keyrus.of.service.ScreenService;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/screens")
public class ScreenResource {

  @Inject
  ScreenService screenService;


  @POST
  @Path("/all")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response getAllScreens(User user) {

    return Response.ok(screenService.getAll(user.userName, user.appId)).build();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response addScreen(Screen screen) {
    Screen createdScreen = screenService.addScreen(screen);
    return Response.ok(createdScreen).build();
  }


  @DELETE
    @Path("/delete/{id}")
    public Response deleteScreen(@PathParam("id") String id) {
        screenService.deleteScreen(id);
        return Response.ok().build();
    }

  @PUT
  @Path("/PUT")
  public Response updateScreen(Screen screen) {
    screenService.updateScreenName(screen);
    return Response.ok().build();
  }

  @PUT
  @Path("/PUT/{id}")
  public Response updateScreen(@PathParam("id") ObjectId id, Screen screen) {
    screen.setId(id);
    screenService.updateScreenName(screen);
    return Response.ok().build();
  }
}
