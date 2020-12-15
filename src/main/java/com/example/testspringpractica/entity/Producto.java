/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testspringpractica.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LBRITEZ
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_producto")
    private Integer codigoProducto;
    @Basic(optional = false)
    @Column(name = "producto_descripcion")
    private String productoDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoProducto")
    private List<FacturaDetalle> facturadetalleList;

    public Producto() {
    }

    public Producto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Producto(Integer codigoProducto, String productoDescripcion) {
        this.codigoProducto = codigoProducto;
        this.productoDescripcion = productoDescripcion;
    }

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    @XmlTransient
    public List<FacturaDetalle> getFacturadetalleList() {
        return facturadetalleList;
    }

    public void setFacturadetalleList(List<FacturaDetalle> facturadetalleList) {
        this.facturadetalleList = facturadetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoProducto != null ? codigoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.codigoProducto == null && other.codigoProducto != null) || (this.codigoProducto != null && !this.codigoProducto.equals(other.codigoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.testspringpractica.entity.Productos[ codigoProducto=" + codigoProducto + " ]";
    }
    
}
