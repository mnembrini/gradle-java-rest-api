package demo.app.micronaut.v1;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Options;
import io.micronaut.http.annotation.Produces;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated(
    date = "2019-02-11T14:56:02.193Z",
    comments = "Specification filename: root.v1.json",
    value = "ch.silviowangler.restapi"
)
@Controller("/v1")
public class RootResource {
  public static final String OPTIONS_CONTENT = "{\"general\":{\"name\":\"root\",\"description\":\"Das ist die Root Resource der Version 1.0.0\",\"version\":\"1.0.0\",\"x-route\":\"/:version\"},\"verbs\":[{\"verb\":\"GET_ENTITY\",\"rel\":\"Root Ressource laden\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/ch.silviowangler.land\"}],\"parameters\":[],\"permissions\":[]}],\"fields\":[{\"name\":\"id\",\"type\":\"uuid\",\"options\":null,\"mandatory\":[],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"VOKey\"},{\"name\":\"name\",\"type\":\"string\",\"options\":null,\"mandatory\":[],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"Name des Landes\"}],\"subresources\":[{\"name\":\"land\",\"type\":\"application/vnd.ch.silviowangler.land.collection\",\"rel\":\"Länder Dokumentation\",\"href\":\"/v1/laender/\",\"method\":\"OPTIONS\",\"expandable\":true}],\"pipes\":[],\"types\":[{\"name\":\"coordinates\",\"fields\":[{\"name\":\"longitude\",\"type\":\"decimal\",\"options\":null,\"min\":0.0,\"max\":null,\"multiple\":false,\"defaultValue\":null},{\"name\":\"latitude\",\"type\":\"int\",\"options\":null,\"min\":0.0,\"max\":null,\"multiple\":false,\"defaultValue\":null}]}],\"validators\":[]}";

  private final RootResourceDelegate delegate;

  @Inject
  public RootResource(RootResourceDelegate delegate) {
    this.delegate = delegate;
  }

  @Options
  @Produces("application/json")
  public String getOptions() {
    return OPTIONS_CONTENT;
  }

  @Produces("application/ch.silviowangler.land")
  @Get
  public RootGetResourceModel getEntity() {
    return delegate.getEntity();
  }
}
