/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlsensores;

/**
 *
 * @author u1401
 */
public class Sensor {
    
    private String _nombre;
    private String _direccion;
    private boolean _status= false;

    public void setStatus(boolean _status) {
        this._status = _status;
    }

    public boolean isStatus() {
        return _status;
    }
    public boolean getStatus() {
        return _status;
    }

    public Sensor(String _nombre, String _direccion) {
        this._nombre = _nombre;
        this._direccion = _direccion;
    }
    
    public String getNombre() {
        return _nombre;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }  
}
