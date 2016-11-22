package pe.adcb.catalogo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.adcb.catalogo.db.AccesoDB;
import pe.adcb.catalogo.model.Producto;

public class ProductoService {

    public List<Producto> getLista(String nombre, String categoria) {
        List<Producto> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select idpro, nombre, categoria, precio, preciomayor, stock "
                    + "from producto where nombre like concat('%',?,'%') and categoria like concat('%',?,'%')";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, nombre);
            pstm.setString(2, categoria);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Producto bean = new Producto();
                bean.setIdProducto(rs.getInt("idpro"));
                bean.setNombre(rs.getString("nombre"));
                bean.setCategoria(rs.getString("categoria"));
                bean.setPrecio(Integer.parseInt(rs.getString("precio")));
                bean.setPrecioMayor(Integer.parseInt(rs.getString("preciomayor")));
                bean.setStock(Integer.parseInt(rs.getString("stock")));
                lista.add(bean);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) {
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
    public void add(Producto bean) {
        Connection cn = null;
        try {
            // La conexión
            cn = AccesoDB.getConnection();
            // Inicio de transacción
            cn.setAutoCommit(false);
            // Insertar registro
            String sql = "insert into producto(NOMBRE,CATEGORIA,PRECIO,PRECIOMAYOR,STOCK) "
                    + "values(?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, bean.getNombre());
            pstm.setString(2, bean.getCategoria());
            pstm.setInt(3, bean.getPrecio());
            pstm.setInt(4, bean.getPrecioMayor());
            pstm.setInt(5, bean.getStock());
            pstm.executeUpdate();
            pstm.close();
            // Recuperar ID
            sql = "SELECT LAST_INSERT_ID() codigo";
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            bean.setIdProducto(rs.getInt("codigo"));
            rs.close();
            pstm.close();
            // confirmar Tx
            cn.commit();
        } catch (Exception e) {
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
            throw new RuntimeException("Error en el proceso.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
}