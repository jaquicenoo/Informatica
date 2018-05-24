/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlsensores;

import java.util.UUID;

/**
 *
 * @author u1401
 */
public class Sensor {
    
    private UUID _idSensor;
    private String _nombre;
    private boolean _status= false;   
    private String _direcccion;   
    private String _unidades;  
    private String _descripcion;
    
    public Sensor(String nombre, String ubicacion, String unidades,String descripcion) {
        this._nombre = nombre;
        this._direcccion=ubicacion;
        this._unidades=unidades;
        this._descripcion= descripcion;
        this._idSensor=UUID.randomUUID();
    }

    /**
     * Get the value of _descripcion
     *
     * @return the value of _descripcion
     */
    public String getDescripcion() {
        return _descripcion;
    }

    /**
     * Set the value of _descripcion
     *
     * @param _descripcion new value of _descripcion
     */
    public void setDescripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }


    /**
     * Get the value of _unidades
     *
     * @return the value of _unidades
     */
    public String getUnidades() {
        return _unidades;
    }

    /**
     * Set the value of _unidades
     *
     * @param _unidades new value of _unidades
     */
    public void setUnidades(String _unidades) {
        this._unidades = _unidades;
    }

    

    /**
     * Get the value of _direcccion
     *
     * @return the value of _direcccion
     */
    public String getDirecccion() {
        return _direcccion;
    }

    /**
     * Set the value of _direcccion
     *
     * @param _direcccion new value of _direcccion
     */
    public void setDirecccion(String _direcccion) {
        this._direcccion = _direcccion;
    }


    public void setStatus(boolean _status) {
        this._status = _status;
    }

    public boolean isStatus() {
        return _status;
    }
    public boolean getStatus() {
        return _status;
    }

    
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

        /**
     * Get the value of _idSensor
     *
     * @return the value of _idSensor
     */
    public UUID getIdSensor() {
        return _idSensor;
    }
}
