package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Category;
import org.openapitools.model.Tag;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A pet for sale in the pet store
 */
@JsonTypeName("Pet")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:42:16.980474344+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class Pet   {
  private Long id;
  private Category category;
  private String name;
  private List<String> photoUrls = new ArrayList<>();
  private List<Tag> tags = new ArrayList<>();
  public enum StatusEnum {

    AVAILABLE(String.valueOf("available")), PENDING(String.valueOf("pending")), SOLD(String.valueOf("sold"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;

    /**
     */
    public Pet id(Long id) {
        this.id = id;
        return this;
    }

    
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     */
    public Pet category(Category category) {
        this.category = category;
        return this;
    }

    
    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     */
    public Pet name(String name) {
        this.name = name;
        return this;
    }

    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     */
    public Pet photoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
        return this;
    }

    
    @JsonProperty("photoUrls")
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    @JsonProperty("photoUrls")
    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public Pet addPhotoUrlsItem(String photoUrlsItem) {
        if (this.photoUrls == null) {
            this.photoUrls = new ArrayList<>();
        }

        this.photoUrls.add(photoUrlsItem);
        return this;
    }

    public Pet removePhotoUrlsItem(String photoUrlsItem) {
        if (photoUrlsItem != null && this.photoUrls != null) {
            this.photoUrls.remove(photoUrlsItem);
        }

        return this;
    }
    /**
     */
    public Pet tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Pet addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }

        this.tags.add(tagsItem);
        return this;
    }

    public Pet removeTagsItem(Tag tagsItem) {
        if (tagsItem != null && this.tags != null) {
            this.tags.remove(tagsItem);
        }

        return this;
    }
    /**
     * pet status in the store
     */
    public Pet status(StatusEnum status) {
        this.status = status;
        return this;
    }

    
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(StatusEnum status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return Objects.equals(this.id, pet.id) &&
            Objects.equals(this.category, pet.category) &&
            Objects.equals(this.name, pet.name) &&
            Objects.equals(this.photoUrls, pet.photoUrls) &&
            Objects.equals(this.tags, pet.tags) &&
            Objects.equals(this.status, pet.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, photoUrls, tags, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

