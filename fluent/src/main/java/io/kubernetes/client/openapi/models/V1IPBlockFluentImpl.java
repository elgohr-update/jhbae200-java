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
public class V1IPBlockFluentImpl<A extends io.kubernetes.client.openapi.models.V1IPBlockFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1IPBlockFluent<A>{
  public V1IPBlockFluentImpl() {
  }
  public V1IPBlockFluentImpl(io.kubernetes.client.openapi.models.V1IPBlock instance) {
    this.withCidr(instance.getCidr());

    this.withExcept(instance.getExcept());

  }
  private java.lang.String cidr;
  private java.util.List<java.lang.String> except;
  public java.lang.String getCidr() {
    return this.cidr;
  }
  public A withCidr(java.lang.String cidr) {
    this.cidr=cidr; return (A) this;
  }
  public java.lang.Boolean hasCidr() {
    return this.cidr != null;
  }
  
  /**
   * Method is deprecated. use withCidr instead.
   */
  @java.lang.Deprecated
  public A withNewCidr(java.lang.String arg0) {
    return (A)withCidr(new String(arg0));
  }
  public A addToExcept(java.lang.Integer index,java.lang.String item) {
    if (this.except == null) {this.except = new java.util.ArrayList<java.lang.String>();}
    this.except.add(index, item);
    return (A)this;
  }
  public A setToExcept(java.lang.Integer index,java.lang.String item) {
    if (this.except == null) {this.except = new java.util.ArrayList<java.lang.String>();}
    this.except.set(index, item); return (A)this;
  }
  public A addToExcept(java.lang.String... items) {
    if (this.except == null) {this.except = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.except.add(item);} return (A)this;
  }
  public A addAllToExcept(java.util.Collection<java.lang.String> items) {
    if (this.except == null) {this.except = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.except.add(item);} return (A)this;
  }
  public A removeFromExcept(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.except!= null){ this.except.remove(item);}} return (A)this;
  }
  public A removeAllFromExcept(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.except!= null){ this.except.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getExcept() {
    return this.except;
  }
  public java.lang.String getExcept(java.lang.Integer index) {
    return this.except.get(index);
  }
  public java.lang.String getFirstExcept() {
    return this.except.get(0);
  }
  public java.lang.String getLastExcept() {
    return this.except.get(except.size() - 1);
  }
  public java.lang.String getMatchingExcept(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: except) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingExcept(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: except) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withExcept(java.util.List<java.lang.String> except) {
    if (except != null) {this.except = new java.util.ArrayList(); for (java.lang.String item : except){this.addToExcept(item);}} else { this.except = null;} return (A) this;
  }
  public A withExcept(java.lang.String... except) {
    if (this.except != null) {this.except.clear();}
    if (except != null) {for (java.lang.String item :except){ this.addToExcept(item);}} return (A) this;
  }
  public java.lang.Boolean hasExcept() {
    return except != null && !except.isEmpty();
  }
  public A addNewExcept(java.lang.String arg0) {
    return (A)addToExcept(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IPBlockFluentImpl that = (V1IPBlockFluentImpl) o;
    if (cidr != null ? !cidr.equals(that.cidr) :that.cidr != null) return false;
    if (except != null ? !except.equals(that.except) :that.except != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(cidr,  except,  super.hashCode());
  }
  
}