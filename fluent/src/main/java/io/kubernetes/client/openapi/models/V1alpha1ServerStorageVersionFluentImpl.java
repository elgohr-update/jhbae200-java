package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1alpha1ServerStorageVersionFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<A>{
  public V1alpha1ServerStorageVersionFluentImpl() {
  }
  public V1alpha1ServerStorageVersionFluentImpl(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion instance) {
    this.withApiServerID(instance.getApiServerID());

    this.withDecodableVersions(instance.getDecodableVersions());

    this.withEncodingVersion(instance.getEncodingVersion());

  }
  private java.lang.String apiServerID;
  private java.util.List<java.lang.String> decodableVersions;
  private java.lang.String encodingVersion;
  public java.lang.String getApiServerID() {
    return this.apiServerID;
  }
  public A withApiServerID(java.lang.String apiServerID) {
    this.apiServerID=apiServerID; return (A) this;
  }
  public java.lang.Boolean hasApiServerID() {
    return this.apiServerID != null;
  }
  
  /**
   * Method is deprecated. use withApiServerID instead.
   */
  @java.lang.Deprecated
  public A withNewApiServerID(java.lang.String arg0) {
    return (A)withApiServerID(new String(arg0));
  }
  public A addToDecodableVersions(java.lang.Integer index,java.lang.String item) {
    if (this.decodableVersions == null) {this.decodableVersions = new java.util.ArrayList<java.lang.String>();}
    this.decodableVersions.add(index, item);
    return (A)this;
  }
  public A setToDecodableVersions(java.lang.Integer index,java.lang.String item) {
    if (this.decodableVersions == null) {this.decodableVersions = new java.util.ArrayList<java.lang.String>();}
    this.decodableVersions.set(index, item); return (A)this;
  }
  public A addToDecodableVersions(java.lang.String... items) {
    if (this.decodableVersions == null) {this.decodableVersions = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.decodableVersions.add(item);} return (A)this;
  }
  public A addAllToDecodableVersions(java.util.Collection<java.lang.String> items) {
    if (this.decodableVersions == null) {this.decodableVersions = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.decodableVersions.add(item);} return (A)this;
  }
  public A removeFromDecodableVersions(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.decodableVersions!= null){ this.decodableVersions.remove(item);}} return (A)this;
  }
  public A removeAllFromDecodableVersions(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.decodableVersions!= null){ this.decodableVersions.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getDecodableVersions() {
    return this.decodableVersions;
  }
  public java.lang.String getDecodableVersion(java.lang.Integer index) {
    return this.decodableVersions.get(index);
  }
  public java.lang.String getFirstDecodableVersion() {
    return this.decodableVersions.get(0);
  }
  public java.lang.String getLastDecodableVersion() {
    return this.decodableVersions.get(decodableVersions.size() - 1);
  }
  public java.lang.String getMatchingDecodableVersion(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: decodableVersions) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingDecodableVersion(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: decodableVersions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withDecodableVersions(java.util.List<java.lang.String> decodableVersions) {
    if (decodableVersions != null) {this.decodableVersions = new java.util.ArrayList(); for (java.lang.String item : decodableVersions){this.addToDecodableVersions(item);}} else { this.decodableVersions = null;} return (A) this;
  }
  public A withDecodableVersions(java.lang.String... decodableVersions) {
    if (this.decodableVersions != null) {this.decodableVersions.clear();}
    if (decodableVersions != null) {for (java.lang.String item :decodableVersions){ this.addToDecodableVersions(item);}} return (A) this;
  }
  public java.lang.Boolean hasDecodableVersions() {
    return decodableVersions != null && !decodableVersions.isEmpty();
  }
  public A addNewDecodableVersion(java.lang.String arg0) {
    return (A)addToDecodableVersions(new String(arg0));
  }
  public java.lang.String getEncodingVersion() {
    return this.encodingVersion;
  }
  public A withEncodingVersion(java.lang.String encodingVersion) {
    this.encodingVersion=encodingVersion; return (A) this;
  }
  public java.lang.Boolean hasEncodingVersion() {
    return this.encodingVersion != null;
  }
  
  /**
   * Method is deprecated. use withEncodingVersion instead.
   */
  @java.lang.Deprecated
  public A withNewEncodingVersion(java.lang.String arg0) {
    return (A)withEncodingVersion(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1ServerStorageVersionFluentImpl that = (V1alpha1ServerStorageVersionFluentImpl) o;
    if (apiServerID != null ? !apiServerID.equals(that.apiServerID) :that.apiServerID != null) return false;
    if (decodableVersions != null ? !decodableVersions.equals(that.decodableVersions) :that.decodableVersions != null) return false;
    if (encodingVersion != null ? !encodingVersion.equals(that.encodingVersion) :that.encodingVersion != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiServerID,  decodableVersions,  encodingVersion,  super.hashCode());
  }
  
}