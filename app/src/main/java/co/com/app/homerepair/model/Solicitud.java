package co.com.app.homerepair.model;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.List;

import co.com.app.homerepair.dao.AdjuntoSolicitudDao;
import co.com.app.homerepair.dao.CategoriaDao;
import co.com.app.homerepair.dao.ClientesDao;
import co.com.app.homerepair.dao.ComentarioDao;
import co.com.app.homerepair.dao.CotizacionDao;
import co.com.app.homerepair.dao.DaoSession;
import co.com.app.homerepair.dao.EstadoSolicitudDao;
import co.com.app.homerepair.dao.SolicitudDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "SOLICITUD".
 */
@Entity(active = true)
public class Solicitud {

    @Id(autoincrement = true)
    private Long id;
    private String sol_descripcion;
    private Integer sol_calificacion;
    private Long sol_cl_id;
    private Long sol_estsol_id;
    private Long sol_cat_id;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient SolicitudDao myDao;

    @ToOne(joinProperty = "sol_cl_id")
    private Clientes clientes;

    @Generated
    private transient Long clientes__resolvedKey;

    @ToOne(joinProperty = "sol_estsol_id")
    private EstadoSolicitud estadoSolicitud;

    @Generated
    private transient Long estadoSolicitud__resolvedKey;

    @ToOne(joinProperty = "sol_cat_id")
    private Categoria categoria;

    @Generated
    private transient Long categoria__resolvedKey;

    @ToMany(joinProperties = {
        @JoinProperty(name = "id", referencedName = "ctrio_sol_id")
    })
    private List<Comentario> comentarios;

    @ToMany(joinProperties = {
        @JoinProperty(name = "id", referencedName = "cot_sol_id")
    })
    private List<Cotizacion> cotizaciones;

    @ToMany(joinProperties = {
        @JoinProperty(name = "id", referencedName = "sol_id")
    })
    private List<AdjuntoSolicitud> adjuntosSolicitud;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Solicitud() {
    }

    public Solicitud(Long id) {
        this.id = id;
    }

    @Generated
    public Solicitud(Long id, String sol_descripcion, Integer sol_calificacion, Long sol_cl_id, Long sol_estsol_id, Long sol_cat_id) {
        this.id = id;
        this.sol_descripcion = sol_descripcion;
        this.sol_calificacion = sol_calificacion;
        this.sol_cl_id = sol_cl_id;
        this.sol_estsol_id = sol_estsol_id;
        this.sol_cat_id = sol_cat_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSolicitudDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSol_descripcion() {
        return sol_descripcion;
    }

    public void setSol_descripcion(String sol_descripcion) {
        this.sol_descripcion = sol_descripcion;
    }

    public Integer getSol_calificacion() {
        return sol_calificacion;
    }

    public void setSol_calificacion(Integer sol_calificacion) {
        this.sol_calificacion = sol_calificacion;
    }

    public Long getSol_cl_id() {
        return sol_cl_id;
    }

    public void setSol_cl_id(Long sol_cl_id) {
        this.sol_cl_id = sol_cl_id;
    }

    public Long getSol_estsol_id() {
        return sol_estsol_id;
    }

    public void setSol_estsol_id(Long sol_estsol_id) {
        this.sol_estsol_id = sol_estsol_id;
    }

    public Long getSol_cat_id() {
        return sol_cat_id;
    }

    public void setSol_cat_id(Long sol_cat_id) {
        this.sol_cat_id = sol_cat_id;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Clientes getClientes() {
        Long __key = this.sol_cl_id;
        if (clientes__resolvedKey == null || !clientes__resolvedKey.equals(__key)) {
            __throwIfDetached();
            ClientesDao targetDao = daoSession.getClientesDao();
            Clientes clientesNew = targetDao.load(__key);
            synchronized (this) {
                clientes = clientesNew;
            	clientes__resolvedKey = __key;
            }
        }
        return clientes;
    }

    @Generated
    public void setClientes(Clientes clientes) {
        synchronized (this) {
            this.clientes = clientes;
            sol_cl_id = clientes == null ? null : clientes.getId();
            clientes__resolvedKey = sol_cl_id;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public EstadoSolicitud getEstadoSolicitud() {
        Long __key = this.sol_estsol_id;
        if (estadoSolicitud__resolvedKey == null || !estadoSolicitud__resolvedKey.equals(__key)) {
            __throwIfDetached();
            EstadoSolicitudDao targetDao = daoSession.getEstadoSolicitudDao();
            EstadoSolicitud estadoSolicitudNew = targetDao.load(__key);
            synchronized (this) {
                estadoSolicitud = estadoSolicitudNew;
            	estadoSolicitud__resolvedKey = __key;
            }
        }
        return estadoSolicitud;
    }

    @Generated
    public void setEstadoSolicitud(EstadoSolicitud estadoSolicitud) {
        synchronized (this) {
            this.estadoSolicitud = estadoSolicitud;
            sol_estsol_id = estadoSolicitud == null ? null : estadoSolicitud.getId();
            estadoSolicitud__resolvedKey = sol_estsol_id;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Categoria getCategoria() {
        Long __key = this.sol_cat_id;
        if (categoria__resolvedKey == null || !categoria__resolvedKey.equals(__key)) {
            __throwIfDetached();
            CategoriaDao targetDao = daoSession.getCategoriaDao();
            Categoria categoriaNew = targetDao.load(__key);
            synchronized (this) {
                categoria = categoriaNew;
            	categoria__resolvedKey = __key;
            }
        }
        return categoria;
    }

    @Generated
    public void setCategoria(Categoria categoria) {
        synchronized (this) {
            this.categoria = categoria;
            sol_cat_id = categoria == null ? null : categoria.getId();
            categoria__resolvedKey = sol_cat_id;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<Comentario> getComentarios() {
        if (comentarios == null) {
            __throwIfDetached();
            ComentarioDao targetDao = daoSession.getComentarioDao();
            List<Comentario> comentariosNew = targetDao._querySolicitud_Comentarios(id);
            synchronized (this) {
                if(comentarios == null) {
                    comentarios = comentariosNew;
                }
            }
        }
        return comentarios;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetComentarios() {
        comentarios = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<Cotizacion> getCotizaciones() {
        if (cotizaciones == null) {
            __throwIfDetached();
            CotizacionDao targetDao = daoSession.getCotizacionDao();
            List<Cotizacion> cotizacionesNew = targetDao._querySolicitud_Cotizaciones(id);
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

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<AdjuntoSolicitud> getAdjuntosSolicitud() {
        if (adjuntosSolicitud == null) {
            __throwIfDetached();
            AdjuntoSolicitudDao targetDao = daoSession.getAdjuntoSolicitudDao();
            List<AdjuntoSolicitud> adjuntosSolicitudNew = targetDao._querySolicitud_AdjuntosSolicitud(id);
            synchronized (this) {
                if(adjuntosSolicitud == null) {
                    adjuntosSolicitud = adjuntosSolicitudNew;
                }
            }
        }
        return adjuntosSolicitud;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetAdjuntosSolicitud() {
        adjuntosSolicitud = null;
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
