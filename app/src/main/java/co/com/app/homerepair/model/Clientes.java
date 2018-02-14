package co.com.app.homerepair.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.List;

import co.com.app.homerepair.dao.ClientesDao;
import co.com.app.homerepair.dao.CotizacionDao;
import co.com.app.homerepair.dao.DaoSession;
import co.com.app.homerepair.dao.SolicitudDao;
import co.com.app.homerepair.dao.UsuariosDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "CLIENTES".
 */
@Entity(active = true)
public class Clientes {

    @Id
    private Long id;

    @NotNull
    private String cl_nombre;

    @NotNull
    private String cl_apellidos;
    private String cl_email;
    private String cl_telefono;
    private String cl_direccion;
    private String cl_fecha_naci;
    private String cl_estado;
    private long cl_usu_id;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient ClientesDao myDao;

    @ToOne(joinProperty = "cl_usu_id")
    private Usuarios usuarios;

    @Generated
    private transient Long usuarios__resolvedKey;

    @ToMany(joinProperties = {
        @JoinProperty(name = "id", referencedName = "sol_cl_id")
    })
    private List<Solicitud> solicitudes;

    @ToMany(joinProperties = {
        @JoinProperty(name = "id", referencedName = "cot_cl_id")
    })
    private List<Cotizacion> cotizaciones;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Clientes() {
    }

    public Clientes(Long id) {
        this.id = id;
    }

    @Generated
    public Clientes(Long id, String cl_nombre, String cl_apellidos, String cl_email, String cl_telefono, String cl_direccion, String cl_fecha_naci, String cl_estado, long cl_usu_id) {
        this.id = id;
        this.cl_nombre = cl_nombre;
        this.cl_apellidos = cl_apellidos;
        this.cl_email = cl_email;
        this.cl_telefono = cl_telefono;
        this.cl_direccion = cl_direccion;
        this.cl_fecha_naci = cl_fecha_naci;
        this.cl_estado = cl_estado;
        this.cl_usu_id = cl_usu_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getClientesDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getCl_nombre() {
        return cl_nombre;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCl_nombre(@NotNull String cl_nombre) {
        this.cl_nombre = cl_nombre;
    }

    @NotNull
    public String getCl_apellidos() {
        return cl_apellidos;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCl_apellidos(@NotNull String cl_apellidos) {
        this.cl_apellidos = cl_apellidos;
    }

    public String getCl_email() {
        return cl_email;
    }

    public void setCl_email(String cl_email) {
        this.cl_email = cl_email;
    }

    public String getCl_telefono() {
        return cl_telefono;
    }

    public void setCl_telefono(String cl_telefono) {
        this.cl_telefono = cl_telefono;
    }

    public String getCl_direccion() {
        return cl_direccion;
    }

    public void setCl_direccion(String cl_direccion) {
        this.cl_direccion = cl_direccion;
    }

    public String getCl_fecha_naci() {
        return cl_fecha_naci;
    }

    public void setCl_fecha_naci(String cl_fecha_naci) {
        this.cl_fecha_naci = cl_fecha_naci;
    }

    public String getCl_estado() {
        return cl_estado;
    }

    public void setCl_estado(String cl_estado) {
        this.cl_estado = cl_estado;
    }

    public long getCl_usu_id() {
        return cl_usu_id;
    }

    public void setCl_usu_id(long cl_usu_id) {
        this.cl_usu_id = cl_usu_id;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Usuarios getUsuarios() {
        long __key = this.cl_usu_id;
        if (usuarios__resolvedKey == null || !usuarios__resolvedKey.equals(__key)) {
            __throwIfDetached();
            UsuariosDao targetDao = daoSession.getUsuariosDao();
            Usuarios usuariosNew = targetDao.load(__key);
            synchronized (this) {
                usuarios = usuariosNew;
            	usuarios__resolvedKey = __key;
            }
        }
        return usuarios;
    }

    @Generated
    public void setUsuarios(Usuarios usuarios) {
        if (usuarios == null) {
            throw new DaoException("To-one property 'cl_usu_id' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.usuarios = usuarios;
            cl_usu_id = usuarios.getId();
            usuarios__resolvedKey = cl_usu_id;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<Solicitud> getSolicitudes() {
        if (solicitudes == null) {
            __throwIfDetached();
            SolicitudDao targetDao = daoSession.getSolicitudDao();
            List<Solicitud> solicitudesNew = targetDao._queryClientes_Solicitudes(id);
            synchronized (this) {
                if(solicitudes == null) {
                    solicitudes = solicitudesNew;
                }
            }
        }
        return solicitudes;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetSolicitudes() {
        solicitudes = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<Cotizacion> getCotizaciones() {
        if (cotizaciones == null) {
            __throwIfDetached();
            CotizacionDao targetDao = daoSession.getCotizacionDao();
            List<Cotizacion> cotizacionesNew = targetDao._queryClientes_Cotizaciones(id);
            synchronized (this) {
                if(cotizaciones == null) {
                    cotizaciones = cotizacionesNew;
                }
            }
        }
        return cotizaciones;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetCotizaciones() {
        cotizaciones = null;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
