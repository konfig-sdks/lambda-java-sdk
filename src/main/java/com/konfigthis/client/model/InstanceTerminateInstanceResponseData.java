/*
 * Lambda Cloud API
 * API for interacting with the Lambda GPU Cloud
 *
 * The version of the OpenAPI document: 1.5.1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Instance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * InstanceTerminateInstanceResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InstanceTerminateInstanceResponseData {
  public static final String SERIALIZED_NAME_TERMINATED_INSTANCES = "terminated_instances";
  @SerializedName(SERIALIZED_NAME_TERMINATED_INSTANCES)
  private List<Instance> terminatedInstances = new ArrayList<>();

  public InstanceTerminateInstanceResponseData() {
  }

  public InstanceTerminateInstanceResponseData terminatedInstances(List<Instance> terminatedInstances) {
    
    
    
    
    this.terminatedInstances = terminatedInstances;
    return this;
  }

  public InstanceTerminateInstanceResponseData addTerminatedInstancesItem(Instance terminatedInstancesItem) {
    this.terminatedInstances.add(terminatedInstancesItem);
    return this;
  }

   /**
   * List of instances that were terminated. Note: this list might not contain all instances requested to be terminated.
   * @return terminatedInstances
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of instances that were terminated. Note: this list might not contain all instances requested to be terminated.")

  public List<Instance> getTerminatedInstances() {
    return terminatedInstances;
  }


  public void setTerminatedInstances(List<Instance> terminatedInstances) {
    
    
    
    this.terminatedInstances = terminatedInstances;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the InstanceTerminateInstanceResponseData instance itself
   */
  public InstanceTerminateInstanceResponseData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceTerminateInstanceResponseData instanceTerminateInstanceResponseData = (InstanceTerminateInstanceResponseData) o;
    return Objects.equals(this.terminatedInstances, instanceTerminateInstanceResponseData.terminatedInstances)&&
        Objects.equals(this.additionalProperties, instanceTerminateInstanceResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminatedInstances, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceTerminateInstanceResponseData {\n");
    sb.append("    terminatedInstances: ").append(toIndentedString(terminatedInstances)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("terminated_instances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminated_instances");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstanceTerminateInstanceResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstanceTerminateInstanceResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstanceTerminateInstanceResponseData is not found in the empty JSON string", InstanceTerminateInstanceResponseData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstanceTerminateInstanceResponseData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("terminated_instances").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminated_instances` to be an array in the JSON string but got `%s`", jsonObj.get("terminated_instances").toString()));
      }

      JsonArray jsonArrayterminatedInstances = jsonObj.getAsJsonArray("terminated_instances");
      // validate the required field `terminated_instances` (array)
      for (int i = 0; i < jsonArrayterminatedInstances.size(); i++) {
        Instance.validateJsonObject(jsonArrayterminatedInstances.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstanceTerminateInstanceResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstanceTerminateInstanceResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstanceTerminateInstanceResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstanceTerminateInstanceResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<InstanceTerminateInstanceResponseData>() {
           @Override
           public void write(JsonWriter out, InstanceTerminateInstanceResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public InstanceTerminateInstanceResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InstanceTerminateInstanceResponseData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstanceTerminateInstanceResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstanceTerminateInstanceResponseData
  * @throws IOException if the JSON string is invalid with respect to InstanceTerminateInstanceResponseData
  */
  public static InstanceTerminateInstanceResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstanceTerminateInstanceResponseData.class);
  }

 /**
  * Convert an instance of InstanceTerminateInstanceResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

