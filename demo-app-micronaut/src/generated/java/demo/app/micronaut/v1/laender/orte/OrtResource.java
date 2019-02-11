package demo.app.micronaut.v1.laender.orte;

import ch.silviowangler.rest.types.IdType;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Options;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.Put;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.validation.Valid;
import java.util.Collection;

@Generated(
    date = "2019-02-11T14:56:02.328Z",
    comments = "Specification filename: land.ort.v1.json",
    value = "ch.silviowangler.restapi"
)
@Controller("/v1/laender/{land}/orte")
public class OrtResource {
  public static final String OPTIONS_CONTENT = "{\"general\":{\"name\":\"land.ort\",\"description\":\"Ort\",\"version\":\"1.0.0\",\"lifecycle\":{\"deprecated\":false,\"info\":\"Diese Version ist noch immer gültig\"},\"searchable\":true,\"countable\":false,\"x-route\":\"/:version/laender/:land/orte/:entity\"},\"verbs\":[{\"verb\":\"GET_ENTITY\",\"rel\":\"Ort laden\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/ch.silviowangler.ort\"},{\"name\":\"jpeg\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"image/jpeg\"}],\"options\":[],\"permissions\":[]},{\"verb\":\"GET_COLLECTION\",\"rel\":\"Orte holen\",\"collectionLimit\":19,\"maxCollectionLimit\":101,\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/ch.silviowangler.ort.collection\"}],\"options\":[],\"permissions\":[]},{\"verb\":\"PUT\",\"rel\":\"Ort ändern\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/json\"}],\"options\":[],\"permissions\":[]},{\"verb\":\"POST\",\"rel\":\"Ort ändern\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/json\"}],\"options\":[],\"permissions\":[]},{\"verb\":\"DELETE_ENTITY\",\"rel\":\"Ort löschen\",\"responseStates\":[{\"code\":200,\"message\":\"200 Ok\",\"comment\":\"content in response body\"},{\"code\":503,\"message\":\"503 Service Unavailable\",\"comment\":\"Backend server eventually not reachable or to slow\"}],\"representations\":[{\"name\":\"json\",\"comment\":\"\",\"responseExample\":\"{...}\",\"isDefault\":true,\"mimetype\":\"application/json\"}],\"options\":[],\"permissions\":[]}],\"fields\":[{\"name\":\"id\",\"type\":\"uuid\",\"options\":null,\"mandatory\":[\"PUT\"],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"VOKey\"},{\"name\":\"name\",\"type\":\"string\",\"options\":null,\"mandatory\":[\"PUT\",\"POST\"],\"min\":null,\"max\":20,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"Ort\"},{\"name\":\"koordinaten\",\"type\":\"coordinates\",\"options\":null,\"mandatory\":[\"PUT\",\"POST\"],\"min\":null,\"max\":null,\"multiple\":false,\"defaultValue\":null,\"protected\":[],\"visible\":true,\"sortable\":false,\"readonly\":false,\"filterable\":false,\"alias\":[],\"x-comment\":\"Koordinaten\"}],\"parameters\":[],\"subresources\":[]}";

  private final OrtResourceDelegate delegate;

  @Inject
  public OrtResource(OrtResourceDelegate delegate) {
    this.delegate = delegate;
  }

  @Options
  @Produces("application/json")
  public String getOptions() {
    return OPTIONS_CONTENT;
  }

  @Produces("application/json")
  @Delete(
      uri = "/{id}"
  )
  public HttpResponse deleteEntity(String id, String land) {
    return delegate.deleteEntity(id, land);
  }

  @Produces("application/ch.silviowangler.ort.collection")
  @Get
  public Collection<OrtGetResourceModel> getCollection(String land) {
    return delegate.getCollection(land);
  }

  @Get(
      uri = "/{id}"
  )
  @Produces("application/ch.silviowangler.ort")
  public OrtGetResourceModel getEntity(String id, String land) {
    return delegate.getEntity(id, land);
  }

  @Produces("image/jpeg")
  @Get(
      uri = "/{id}.jpeg"
  )
  public HttpResponse getEntityJpeg(String id, String land) {
    return delegate.getEntityJpeg(id, land);
  }

  @Post
  @Produces("application/json")
  public IdType createEntity(@Valid OrtPostResourceModel model, String land) {
    return delegate.createEntity(model, land);
  }

  @Produces("application/json")
  @Put(
      uri = "/{id}"
  )
  public IdType updateEntity(@Valid OrtPutResourceModel model, String id, String land) {
    return delegate.updateEntity(model, id, land);
  }
}
