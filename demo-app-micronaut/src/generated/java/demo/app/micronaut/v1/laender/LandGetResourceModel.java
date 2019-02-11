package demo.app.micronaut.v1.laender;

import ch.silviowangler.rest.model.ResourceModel;
import demo.app.micronaut.v1.CoordinatesType;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.annotation.Generated;

@Generated(
    date = "2019-02-11T14:56:02.260Z",
    comments = "Specification filename: land.v1.json",
    value = "ch.silviowangler.restapi"
)
public class LandGetResourceModel implements Serializable, ResourceModel {
  public static final String TYPE = "application/ch.silviowangler.land";

  private String id;

  private String name;

  private LocalDate gruendungsDatum;

  private Integer flaeche;

  private CoordinatesType koordinaten;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getGruendungsDatum() {
    return this.gruendungsDatum;
  }

  public void setGruendungsDatum(LocalDate gruendungsDatum) {
    this.gruendungsDatum = gruendungsDatum;
  }

  public Integer getFlaeche() {
    return this.flaeche;
  }

  public void setFlaeche(Integer flaeche) {
    this.flaeche = flaeche;
  }

  public CoordinatesType getKoordinaten() {
    return this.koordinaten;
  }

  public void setKoordinaten(CoordinatesType koordinaten) {
    this.koordinaten = koordinaten;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (! (other instanceof LandGetResourceModel)) return false;
    LandGetResourceModel that = (LandGetResourceModel) other;
    return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getGruendungsDatum(), that.getGruendungsDatum()) && Objects.equals(getFlaeche(), that.getFlaeche()) && Objects.equals(getKoordinaten(), that.getKoordinaten());
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, gruendungsDatum, flaeche, koordinaten);
  }
}
