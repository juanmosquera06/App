package co.com.app.homerepair.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

import co.com.app.homerepair.model.EstadoSolicitud;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "ESTADO_SOLICITUD".
*/
public class EstadoSolicitudDao extends AbstractDao<EstadoSolicitud, Long> {

    public static final String TABLENAME = "ESTADO_SOLICITUD";

    /**
     * Properties of entity EstadoSolicitud.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Estsol_descripcion = new Property(1, String.class, "estsol_descripcion", false, "ESTSOL_DESCRIPCION");
    }

    private DaoSession daoSession;


    public EstadoSolicitudDao(DaoConfig config) {
        super(config);
    }
    
    public EstadoSolicitudDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ESTADO_SOLICITUD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ESTSOL_DESCRIPCION\" TEXT);"); // 1: estsol_descripcion
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ESTADO_SOLICITUD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EstadoSolicitud entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String estsol_descripcion = entity.getEstsol_descripcion();
        if (estsol_descripcion != null) {
            stmt.bindString(2, estsol_descripcion);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EstadoSolicitud entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String estsol_descripcion = entity.getEstsol_descripcion();
        if (estsol_descripcion != null) {
            stmt.bindString(2, estsol_descripcion);
        }
    }

    @Override
    protected final void attachEntity(EstadoSolicitud entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public EstadoSolicitud readEntity(Cursor cursor, int offset) {
        EstadoSolicitud entity = new EstadoSolicitud( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // estsol_descripcion
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EstadoSolicitud entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEstsol_descripcion(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(EstadoSolicitud entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(EstadoSolicitud entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EstadoSolicitud entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
