package de.rieckpil.quickstarts;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Path("index")
public class ResourceController {
  InputStream index = ResourceController.class.getResourceAsStream("/static/index.html");

  @GET
  @Produces({MediaType.TEXT_HTML})
  public InputStream getHomePage() throws FileNotFoundException {
    return index;
  }
}
