package org.openapitools.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nablarch.core.validation.ee.DecimalRange;
import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Length;
import nablarch.core.validation.ee.NumberRange;
import nablarch.core.validation.ee.Required;
import nablarch.core.validation.ee.Size;
import org.openapitools.model.ValidationSubRequest;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("ValidationRequest")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2025-01-14T17:33:40.051298569+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class ValidationRequest   {
  private Integer integerProperty;
  private Integer integerRequiredProperty;
  private BigDecimal numberProperty;
  private BigDecimal numberRequiredProperty;
  private Boolean booleanProperty;
  private Boolean booleanRequiredProperty;
  private String stringProperty;
  private String stringRequiredProperty;
  private @Valid List<String> arrayStringProperty = new ArrayList<>();
  private @Valid List<String> arrayStringRequiredProperty = new ArrayList<>();
  private ValidationSubRequest objectProperty;
  private ValidationSubRequest objectRequiredProperty;

    /**
     */
    public ValidationRequest integerProperty(Integer integerProperty) {
        this.integerProperty = integerProperty;
        return this;
    }

    
    @JsonProperty("integerProperty")
    @Domain("integerProperty")
    public Integer getIntegerProperty() {
        return integerProperty;
    }

    @JsonProperty("integerProperty")
    public void setIntegerProperty(Integer integerProperty) {
        this.integerProperty = integerProperty;
    }

    /**
     */
    public ValidationRequest integerRequiredProperty(Integer integerRequiredProperty) {
        this.integerRequiredProperty = integerRequiredProperty;
        return this;
    }

    
    @JsonProperty("integerRequiredProperty")
    @Required @Domain("integerRequiredProperty")
    public Integer getIntegerRequiredProperty() {
        return integerRequiredProperty;
    }

    @JsonProperty("integerRequiredProperty")
    public void setIntegerRequiredProperty(Integer integerRequiredProperty) {
        this.integerRequiredProperty = integerRequiredProperty;
    }

    /**
     */
    public ValidationRequest numberProperty(BigDecimal numberProperty) {
        this.numberProperty = numberProperty;
        return this;
    }

    
    @JsonProperty("numberProperty")
    @Valid @Domain("numberProperty")
    public BigDecimal getNumberProperty() {
        return numberProperty;
    }

    @JsonProperty("numberProperty")
    public void setNumberProperty(BigDecimal numberProperty) {
        this.numberProperty = numberProperty;
    }

    /**
     */
    public ValidationRequest numberRequiredProperty(BigDecimal numberRequiredProperty) {
        this.numberRequiredProperty = numberRequiredProperty;
        return this;
    }

    
    @JsonProperty("numberRequiredProperty")
    @Required @Valid @Domain("numberRequiredProperty")
    public BigDecimal getNumberRequiredProperty() {
        return numberRequiredProperty;
    }

    @JsonProperty("numberRequiredProperty")
    public void setNumberRequiredProperty(BigDecimal numberRequiredProperty) {
        this.numberRequiredProperty = numberRequiredProperty;
    }

    /**
     */
    public ValidationRequest booleanProperty(Boolean booleanProperty) {
        this.booleanProperty = booleanProperty;
        return this;
    }

    
    @JsonProperty("booleanProperty")
    @Domain("booleanProperty")
    public Boolean getBooleanProperty() {
        return booleanProperty;
    }

    @JsonProperty("booleanProperty")
    public void setBooleanProperty(Boolean booleanProperty) {
        this.booleanProperty = booleanProperty;
    }

    /**
     */
    public ValidationRequest booleanRequiredProperty(Boolean booleanRequiredProperty) {
        this.booleanRequiredProperty = booleanRequiredProperty;
        return this;
    }

    
    @JsonProperty("booleanRequiredProperty")
    @Required @Domain("booleanRequiredProperty")
    public Boolean getBooleanRequiredProperty() {
        return booleanRequiredProperty;
    }

    @JsonProperty("booleanRequiredProperty")
    public void setBooleanRequiredProperty(Boolean booleanRequiredProperty) {
        this.booleanRequiredProperty = booleanRequiredProperty;
    }

    /**
     */
    public ValidationRequest stringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
        return this;
    }

    
    @JsonProperty("stringProperty")
    @Domain("stringProperty")
    public String getStringProperty() {
        return stringProperty;
    }

    @JsonProperty("stringProperty")
    public void setStringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
    }

    /**
     */
    public ValidationRequest stringRequiredProperty(String stringRequiredProperty) {
        this.stringRequiredProperty = stringRequiredProperty;
        return this;
    }

    
    @JsonProperty("stringRequiredProperty")
    @Required @Domain("stringRequiredProperty")
    public String getStringRequiredProperty() {
        return stringRequiredProperty;
    }

    @JsonProperty("stringRequiredProperty")
    public void setStringRequiredProperty(String stringRequiredProperty) {
        this.stringRequiredProperty = stringRequiredProperty;
    }

    /**
     */
    public ValidationRequest arrayStringProperty(List<String> arrayStringProperty) {
        this.arrayStringProperty = arrayStringProperty;
        return this;
    }

    
    @JsonProperty("arrayStringProperty")
    @Domain("arrayStringProperty")
    public List<String> getArrayStringProperty() {
        return arrayStringProperty;
    }

    @JsonProperty("arrayStringProperty")
    public void setArrayStringProperty(List<String> arrayStringProperty) {
        this.arrayStringProperty = arrayStringProperty;
    }

    public ValidationRequest addArrayStringPropertyItem(String arrayStringPropertyItem) {
        if (this.arrayStringProperty == null) {
            this.arrayStringProperty = new ArrayList<>();
        }

        this.arrayStringProperty.add(arrayStringPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringPropertyItem(String arrayStringPropertyItem) {
        if (arrayStringPropertyItem != null && this.arrayStringProperty != null) {
            this.arrayStringProperty.remove(arrayStringPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest arrayStringRequiredProperty(List<String> arrayStringRequiredProperty) {
        this.arrayStringRequiredProperty = arrayStringRequiredProperty;
        return this;
    }

    
    @JsonProperty("arrayStringRequiredProperty")
    @Required @Domain("arrayStringRequiredProperty")
    public List<String> getArrayStringRequiredProperty() {
        return arrayStringRequiredProperty;
    }

    @JsonProperty("arrayStringRequiredProperty")
    public void setArrayStringRequiredProperty(List<String> arrayStringRequiredProperty) {
        this.arrayStringRequiredProperty = arrayStringRequiredProperty;
    }

    public ValidationRequest addArrayStringRequiredPropertyItem(String arrayStringRequiredPropertyItem) {
        if (this.arrayStringRequiredProperty == null) {
            this.arrayStringRequiredProperty = new ArrayList<>();
        }

        this.arrayStringRequiredProperty.add(arrayStringRequiredPropertyItem);
        return this;
    }

    public ValidationRequest removeArrayStringRequiredPropertyItem(String arrayStringRequiredPropertyItem) {
        if (arrayStringRequiredPropertyItem != null && this.arrayStringRequiredProperty != null) {
            this.arrayStringRequiredProperty.remove(arrayStringRequiredPropertyItem);
        }

        return this;
    }
    /**
     */
    public ValidationRequest objectProperty(ValidationSubRequest objectProperty) {
        this.objectProperty = objectProperty;
        return this;
    }

    
    @JsonProperty("objectProperty")
    @Valid 
    public ValidationSubRequest getObjectProperty() {
        return objectProperty;
    }

    @JsonProperty("objectProperty")
    public void setObjectProperty(ValidationSubRequest objectProperty) {
        this.objectProperty = objectProperty;
    }

    /**
     */
    public ValidationRequest objectRequiredProperty(ValidationSubRequest objectRequiredProperty) {
        this.objectRequiredProperty = objectRequiredProperty;
        return this;
    }

    
    @JsonProperty("objectRequiredProperty")
    @Required @Valid 
    public ValidationSubRequest getObjectRequiredProperty() {
        return objectRequiredProperty;
    }

    @JsonProperty("objectRequiredProperty")
    public void setObjectRequiredProperty(ValidationSubRequest objectRequiredProperty) {
        this.objectRequiredProperty = objectRequiredProperty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationRequest validationRequest = (ValidationRequest) o;
        return Objects.equals(this.integerProperty, validationRequest.integerProperty) &&
            Objects.equals(this.integerRequiredProperty, validationRequest.integerRequiredProperty) &&
            Objects.equals(this.numberProperty, validationRequest.numberProperty) &&
            Objects.equals(this.numberRequiredProperty, validationRequest.numberRequiredProperty) &&
            Objects.equals(this.booleanProperty, validationRequest.booleanProperty) &&
            Objects.equals(this.booleanRequiredProperty, validationRequest.booleanRequiredProperty) &&
            Objects.equals(this.stringProperty, validationRequest.stringProperty) &&
            Objects.equals(this.stringRequiredProperty, validationRequest.stringRequiredProperty) &&
            Objects.equals(this.arrayStringProperty, validationRequest.arrayStringProperty) &&
            Objects.equals(this.arrayStringRequiredProperty, validationRequest.arrayStringRequiredProperty) &&
            Objects.equals(this.objectProperty, validationRequest.objectProperty) &&
            Objects.equals(this.objectRequiredProperty, validationRequest.objectRequiredProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerProperty, integerRequiredProperty, numberProperty, numberRequiredProperty, booleanProperty, booleanRequiredProperty, stringProperty, stringRequiredProperty, arrayStringProperty, arrayStringRequiredProperty, objectProperty, objectRequiredProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationRequest {\n");
        
        sb.append("    integerProperty: ").append(toIndentedString(integerProperty)).append("\n");
        sb.append("    integerRequiredProperty: ").append(toIndentedString(integerRequiredProperty)).append("\n");
        sb.append("    numberProperty: ").append(toIndentedString(numberProperty)).append("\n");
        sb.append("    numberRequiredProperty: ").append(toIndentedString(numberRequiredProperty)).append("\n");
        sb.append("    booleanProperty: ").append(toIndentedString(booleanProperty)).append("\n");
        sb.append("    booleanRequiredProperty: ").append(toIndentedString(booleanRequiredProperty)).append("\n");
        sb.append("    stringProperty: ").append(toIndentedString(stringProperty)).append("\n");
        sb.append("    stringRequiredProperty: ").append(toIndentedString(stringRequiredProperty)).append("\n");
        sb.append("    arrayStringProperty: ").append(toIndentedString(arrayStringProperty)).append("\n");
        sb.append("    arrayStringRequiredProperty: ").append(toIndentedString(arrayStringRequiredProperty)).append("\n");
        sb.append("    objectProperty: ").append(toIndentedString(objectProperty)).append("\n");
        sb.append("    objectRequiredProperty: ").append(toIndentedString(objectRequiredProperty)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}

