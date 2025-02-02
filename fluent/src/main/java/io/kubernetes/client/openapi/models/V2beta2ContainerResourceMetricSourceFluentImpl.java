package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V2beta2ContainerResourceMetricSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent<A>{
  public V2beta2ContainerResourceMetricSourceFluentImpl() {
  }
  public V2beta2ContainerResourceMetricSourceFluentImpl(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSource instance) {
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

  }
  private java.lang.String container;
  private java.lang.String name;
  private io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder target;
  public java.lang.String getContainer() {
    return this.container;
  }
  public A withContainer(java.lang.String container) {
    this.container=container; return (A) this;
  }
  public java.lang.Boolean hasContainer() {
    return this.container != null;
  }
  
  /**
   * Method is deprecated. use withContainer instead.
   */
  @java.lang.Deprecated
  public A withNewContainer(java.lang.String arg0) {
    return (A)withContainer(new String(arg0));
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0) {
    return (A)withName(new String(arg0));
  }
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget getTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target) {
    _visitables.get("target").remove(this.target);
    if (target!=null){ this.target= new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(target); _visitables.get("target").add(this.target);} return (A) this;
  }
  public java.lang.Boolean hasTarget() {
    return this.target != null;
  }
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTarget() {
    return new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
    return new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(getTarget() != null ? getTarget(): new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2ContainerResourceMetricSourceFluentImpl that = (V2beta2ContainerResourceMetricSourceFluentImpl) o;
    if (container != null ? !container.equals(that.container) :that.container != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (target != null ? !target.equals(that.target) :that.target != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(container,  name,  target,  super.hashCode());
  }
  public class TargetNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2MetricTargetFluentImpl<io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<N>> implements io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricSourceFluent.TargetNested<N>,io.kubernetes.client.fluent.Nested<N>{
    TargetNestedImpl(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(this, item);
    }
    TargetNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder builder;
    public N and() {
      return (N) V2beta2ContainerResourceMetricSourceFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget() {
      return and();
    }
    
  }
  
}