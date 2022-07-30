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


  private static final String indexPath =
    "C:\\Users\\user\\OneDrive\\Pulpit\\projekty-java-spring\\demo\\quickstart-jakarta-ee-guides\\deployment-to-wildfly-intellij\\src\\main\\resources\\static\\index.html";



  @GET
  @Produces({MediaType.TEXT_HTML})

  public InputStream getHomePage() throws FileNotFoundException {
    File f = new File(indexPath);
    return new FileInputStream(f);
  }

}
