package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1DownwardAPIVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<A>{
  public V1DownwardAPIVolumeSourceFluentImpl() {
  }
  public V1DownwardAPIVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource instance) {
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

  }
  private java.lang.Integer defaultMode;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> items;
  public java.lang.Integer getDefaultMode() {
    return this.defaultMode;
  }
  public A withDefaultMode(java.lang.Integer defaultMode) {
    this.defaultMode=defaultMode; return (A) this;
  }
  public java.lang.Boolean hasDefaultMode() {
    return this.defaultMode != null;
  }
  public A addToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder>();}
    io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
  }
  public A setToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder>();}
    io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(item);
    if (index < 0 || index >= _visitables.get("items").size()) { _visitables.get("items").add(builder); } else { _visitables.get("items").set(index, builder);}
    if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
     return (A)this;
  }
  public A addToItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder>();}
    for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item : items) {io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder>();}
    for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item : items) {io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A removeFromItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items) {
    for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item : items) {io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items) {
    for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item : items) {io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> getItems() {
    return items != null ? build(items) : null;
  }
  public java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> buildItems() {
    return items != null ? build(items) : null;
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildItem(java.lang.Integer index) {
    return this.items.get(index).build();
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildFirstItem() {
    return this.items.get(0).build();
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile> items) {
    if (this.items != null) { _visitables.get("items").removeAll(this.items);}
    if (items != null) {this.items = new java.util.ArrayList(); for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
  }
  public A withItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items) {
    if (this.items != null) {this.items.clear();}
    if (items != null) {for (io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item :items){ this.addToItems(item);}} return (A) this;
  }
  public java.lang.Boolean hasItems() {
    return items != null && !items.isEmpty();
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItem() {
    return new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluentImpl.ItemsNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item) {
    return new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluentImpl.ItemsNestedImpl(-1, item);
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item) {
    return new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluentImpl.ItemsNestedImpl(index, item);
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editItem(java.lang.Integer index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DownwardAPIVolumeSourceFluentImpl that = (V1DownwardAPIVolumeSourceFluentImpl) o;
    if (defaultMode != null ? !defaultMode.equals(that.defaultMode) :that.defaultMode != null) return false;
    if (items != null ? !items.equals(that.items) :that.items != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(defaultMode,  items,  super.hashCode());
  }
  public class ItemsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluentImpl<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<N>> implements io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent.ItemsNested<N>,io.kubernetes.client.fluent.Nested<N>{
    ItemsNestedImpl(java.lang.Integer index,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(this, item);
    }
    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) V1DownwardAPIVolumeSourceFluentImpl.this.setToItems(index,builder.build());
    }
    public N endItem() {
      return and();
    }
    
  }
  
}