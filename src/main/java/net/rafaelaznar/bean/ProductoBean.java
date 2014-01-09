/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.bean;

/**
 *
 * @author Sergio
 */
public class ProductoBean {

    private int id;
    private String codigo;
    private String descripcion;
    private Double precio;
    private int id_tipoproducto;

    public ProductoBean() {
    }

    public ProductoBean(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the id_tipoproducto
     */
    public int getId_tipoproducto() {
        return id_tipoproducto;
    }

    /**
     * @param id_tipoproducto the id_tipoproducto to set
     */
    public void setId_tipoproducto(int id_tipoproducto) {
        this.id_tipoproducto = id_tipoproducto;
    }
}