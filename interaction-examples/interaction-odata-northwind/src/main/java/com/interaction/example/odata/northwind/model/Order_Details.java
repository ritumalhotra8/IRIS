package com.interaction.example.odata.northwind.model;

/*
 * #%L
 * interaction-example-odata-northwind
 * %%
 * Copyright (C) 2012 - 2013 Temenos Holdings N.V.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Details")
public class Order_Details implements Serializable {
  private static final long serialVersionUID = 1L;
  @EmbeddedId
  protected Order_DetailsPK orderDetailsPK;
  @Basic(optional = false)
  @Column(name = "UnitPrice")
  private BigDecimal UnitPrice;
  @Basic(optional = false)
  @Column(name = "Quantity")
  private short Quantity;
  @Basic(optional = false)
  @Column(name = "Discount")
  private Float Discount;

  @JoinColumn(name = "ProductID", referencedColumnName = "ProductID",
      insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private Products Product;

  @JoinColumn(name = "OrderID", referencedColumnName = "OrderID",
      insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private Orders Order;

  public Order_Details() {}

  public Order_Details(Order_DetailsPK orderDetailsPK) {
    this.orderDetailsPK = orderDetailsPK;
  }

  public Order_Details(Order_DetailsPK orderDetailsPK, BigDecimal unitPrice,
      short quantity, Float discount) {
    this.orderDetailsPK = orderDetailsPK;
    this.UnitPrice = unitPrice;
    this.Quantity = quantity;
    this.Discount = discount;
  }

  public Order_Details(int orderID, int productID) {
    this.orderDetailsPK = new Order_DetailsPK(orderID, productID);
  }

  public Order_DetailsPK getOrderDetailsPK() {
    return orderDetailsPK;
  }

  public void setOrderDetailsPK(Order_DetailsPK orderDetailsPK) {
    this.orderDetailsPK = orderDetailsPK;
  }

  public BigDecimal getUnitPrice() {
    return UnitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.UnitPrice = unitPrice;
  }

  public short getQuantity() {
    return Quantity;
  }

  public void setQuantity(short quantity) {
    this.Quantity = quantity;
  }

  public Float getDiscount() {
    return Discount;
  }

  public void setDiscount(Float discount) {
    this.Discount = discount;
  }

  public Products getProducts() {
    return Product;
  }

  public void setProducts(Products products) {
    this.Product = products;
  }

  public Orders getOrders() {
    return Order;
  }

  public void setOrders(Orders orders) {
    this.Order = orders;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (orderDetailsPK != null
        ? orderDetailsPK.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Order_Details)) {
      return false;
    }
    Order_Details other = (Order_Details) object;
    if ((this.orderDetailsPK == null && other.orderDetailsPK != null)
        || (this.orderDetailsPK != null && !this.orderDetailsPK
            .equals(other.orderDetailsPK))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "org.odata4j.examples.producer.model.OrderDetails[orderDetailsPK="
        + orderDetailsPK + "]";
  }

}
