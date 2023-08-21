package co.edu.sena.alejo.proyectoframework.data.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad mapeada desde la base de datos prueba proyecto lulobank
 * 
 * @author Alejandro Bautista Espitia
 *         Tecnologia en Analisis y Desarrollo de Software
 */

@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @Column(name = "nit")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_nit")
    private String tipoNit;

    @Column(name = "primer_nombre", nullable = false)
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "nacimiento")
    private Date nacimiento;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Column(name = "clave")
    private Integer clave;

    @Column(name = "token")
    private String token;

    public UsuarioEntity(Long id, String tipoNit, String primerNombre, String segundoNombre, String primerApellido,
            String segundoApellido, Date nacimiento, Date fechaRegistro, Integer clave, String token) {
        this.id = id;
        this.tipoNit = tipoNit;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nacimiento = nacimiento;
        this.fechaRegistro = fechaRegistro;
        this.clave = clave;
        this.token = token;
    }

    public UsuarioEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoNit() {
        return tipoNit;
    }

    public void setTipoNit(String tipoNit) {
        this.tipoNit = tipoNit;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}