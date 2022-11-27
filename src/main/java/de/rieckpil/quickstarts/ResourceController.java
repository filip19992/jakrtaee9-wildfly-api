package de.rieckpil.quickstarts;

import de.rieckpil.quickstarts.model.AppUser;
import de.rieckpil.quickstarts.service.AppUserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.util.List;

@Path("v1")
public class ResourceController {
  InputStream index = ResourceController.class.getResourceAsStream("/static/index.html");

  AppUserService userService = new AppUserService();

  @GET
  @Produces({MediaType.TEXT_HTML})
  @Path("/index")
  public InputStream getHomePage() {
    return index;
  }
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  @Path("/users")
  public List<AppUser> getAllUsers() {
    return fetchAllUsers();
  }

  private List<AppUser> fetchAllUsers() {
    return userService.findAll();
  }
}
