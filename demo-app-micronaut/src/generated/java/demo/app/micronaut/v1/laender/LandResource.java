package demo.app.micronaut.v1.laender;

import ch.silviowangler.rest.types.IdType;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Options;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.Put;
import java.util.Collection;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.validation.Valid;

@Generated(
    date = "2019-02-11T14:56:02.267Z",
    comments = "Specification filename: land.v1.json",
    value = "ch.silviowangler.restapi"
)
@Controller("/v1/laender")
public class LandResource {
  public static final String OPTIONS_CONTENT = "{\"general\":{\"name\":\"land\",\"description\":\"Land\",\"version\":\"1.0.0\",\"lifecycle\":{\"deprecated\":false,\"info\":\"Diese Version ist noch immer gültig\"},\"searchable\":true,\"countable\":false,\"x-route\":\"/:version/laender/:entity\"},\"verbs\":[{\"verb\":\"GET_ENTITY\",\"rel\":\"Land laden\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/ch.silviowangler.land\"},{\"name\":\"pdf\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":false,\"mimetype\":\"application/pdf\"}],\"parameters\":[],\"permissions\":[],\"caching\":{\"no-cache\":true,\"private\":false,\"max-age\":-2,\"Expires\":-1,\"ETag\":true}},{\"verb\":\"GET_COLLECTION\",\"rel\":\"Länder holen\",\"collectionLimit\":19,\"maxCollectionLimit\":101,\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/ch.silviowangler.land.collection\"}],\"permissions\":[]},{\"verb\":\"PUT\",\"rel\":\"Land ändern\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/json\"}],\"parameters\":[],\"permissions\":[{\"name\":\"mitarbeiter\",\"mode\":\"all\",\"comment\":\"Jeder darf ein Land ändern\"}]},{\"verb\":\"POST\",\"rel\":\"Land anlegen\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/json\"}],\"parameters\":[],\"permissions\":[{\"name\":\"mitarbeiter\",\"mode\":\"all\",\"comment\":\"Jeder darf Länder ändern\"}]}],\"fields\":[{\"name\":\"id\",\"type\":\"uuid\",\"options\":null,\"mandatory\":[\"PUT\"],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"VOKey\"},{\"name\":\"name\",\"type\":\"string\",\"options\":null,\"mandatory\":[\"PUT\",\"POST\"],\"min\":0,\"max\":100,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"Name des Landes\"},{\"name\":\"gruendungsDatum\",\"type\":\"date\",\"options\":null,\"mandatory\":[\"PUT\",\"POST\"],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"Wann wurde das Land gegründet?\"},{\"name\":\"flaeche\",\"type\":\"int\",\"options\":null,\"mandatory\":[\"PUT\",\"POST\"],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"Fläche in km\"},{\"name\":\"koordinaten\",\"type\":\"coordinates\",\"options\":null,\"mandatory\":[\"PUT\",\"POST\"],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"Koordinaten\"}],\"subresources\":[{\"name\":\"land.ort\",\"type\":\"application/vnd.ch.silviowangler.ort.collection\",\"rel\":\"orte\",\"href\":\"/v1/laender/{land}/orte/\",\"method\":\"GET\",\"expandable\":true}]}";

  private final LandResourceDelegate delegate;

  @Inject
  public LandResource(LandResourceDelegate delegate) {
    this.delegate = delegate;
  }

  @Options
  @Produces("application/json")
  public String getOptions() {
    return OPTIONS_CONTENT;
  }

  @Get
  @Produces("application/ch.silviowangler.land.collection")
  public Collection<LandGetResourceModel> getCollection() {
    return delegate.getCollection();
  }

  @Get(
      uri = "/{id}"
  )
  @Produces("application/ch.silviowangler.land")
  public LandGetResourceModel getEntity(String id) {
    return delegate.getEntity(id);
  }

  @Produces("application/pdf")
  @Get(
      uri = "/{id}.pdf"
  )
  public HttpResponse getEntityPdf(String id) {
    return delegate.getEntityPdf(id);
  }

  @Post
  @Produces("application/json")
  public IdType createEntity(@Valid LandPostResourceModel model) {
    return delegate.createEntity(model);
  }

  @Produces("application/json")
  @Put(
      uri = "/{id}"
  )
  public IdType updateEntity(@Valid LandPutResourceModel model, String id) {
    return delegate.updateEntity(model, id);
  }
}
