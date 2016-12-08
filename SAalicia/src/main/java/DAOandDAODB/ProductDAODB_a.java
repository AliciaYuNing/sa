package DAOandDAODB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sample.product.entity.Product;

public class ProductDAODB_a implements ProductDAO_a {
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Product> getListHome() {
		String sql = "SELECT * FROM product";
		return getListHome(sql);
	}

	public List<Product> getListMobilephone(String sql12) {
		String sql1 = "SELECT * FROM product where category_id='" + 1 + "'";

		return getListMobilephone(sql1);
	}

	public List<Product> getListAudioeq(String c) {
		String sql2 = "SELECT * FROM product where Category='" + c + "'";
		return getListAudioeq(sql2);

	}

	public List<Product> getListCharger(String c) {
		String sql3 = "SELECT * FROM product where Category='" + c + "'";
		return getListCharger(sql3);
	}

	public List<Product> getListMouse(String c) {
		String sql4 = "SELECT * FROM product where Category='" + c + "'";
		return getListMouse(sql4);
	}

	// make it a generic method for different conditions
	public List<Product> getListHome(String sql) {

		List<Product> productList = new ArrayList<Product>();
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next()) {
				Product aProduct = new Product();
				aProduct.setId(rs.getInt("ProductID"));
				aProduct.setCategory(rs.getString("Category"));
				aProduct.setDesc(rs.getString("Description"));
				aProduct.setPrice(rs.getInt("price"));
				aProduct.setInventory(rs.getInt("inventory"));
				aProduct.setReorderPoint(rs.getInt("reorderPoint"));
				productList.add(aProduct);

			}
			System.out.println("size = " + productList.size());
			rs.close();
			smt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return productList;
	}

	public void insert(Product aProduct) {

		// remove first parameter when Id is auto-increment
		String sql = "INSERT INTO product (Category, Description, price, Inventory, ReorderPoint) VALUES(?, ?, ?, ?, ?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//rs = smt.executeQuery();不確定用途自己加的
			smt.setString(1, aProduct.getCategory());
			smt.setString(2, aProduct.getDesc());
			smt.setInt(3, aProduct.getPrice());
			smt.setInt(4, aProduct.getInventory());
			smt.setInt(5, aProduct.getReorderPoint());
			smt.executeUpdate();
			ResultSet rs = smt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				long key = rs.getLong(1);
			}
			smt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public Product get(long id) {
		Product aProduct = new Product();
		String sql = "SELECT * FROM product WHERE productID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setLong(1, id);
			rs = smt.executeQuery();
			if (rs.next()) {
				aProduct.setId(rs.getInt("productID"));
				aProduct.setCategory(rs.getString("category"));
				aProduct.setDesc(rs.getString("description"));
				aProduct.setPrice(rs.getInt("price"));
				aProduct.setInventory(rs.getInt("inventory"));
				aProduct.setReorderPoint(rs.getInt("reorderPoint"));
			}
			rs.close();
			smt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return aProduct;
	}

	public void update(Product aProduct) {

		String sql = "UPDATE product SET Category=?, Description=?, Price=?, Inventory=?, ReorderPoint=? "
				+ "WHERE productID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aProduct.getCategory());
			smt.setString(2, aProduct.getDesc());
			smt.setInt(3, aProduct.getPrice());
			smt.setInt(4, aProduct.getInventory());
			smt.setInt(5, aProduct.getReorderPoint());
			smt.setLong(6, aProduct.getId());
			smt.executeUpdate();
			smt.close();
			System.out.println(" db success inv:" + aProduct.getInventory());
			System.out.println(" db success id:" + aProduct.getId());

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public void BuyList(Product aProduct) {

		String sql = "UPDATE product SET Category=?, Description=?, Price=?, Inventory=?, ReorderPoint=? "
				+ "WHERE productID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, aProduct.getCategory());
			smt.setString(2, aProduct.getDesc());
			smt.setInt(3, aProduct.getPrice());
			smt.setInt(4, aProduct.getInventory());
			smt.setInt(5, aProduct.getReorderPoint());
			smt.setLong(6, aProduct.getId());
			smt.executeUpdate();
			smt.close();
			System.out.println(" db success inv:" + aProduct.getInventory());
			System.out.println(" db success id:" + aProduct.getId());

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public void delete(long id) {

		String sql = "DELETE FROM product WHERE productID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setLong(1, id);
			smt.executeUpdate();
			smt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public int count() {
		return 0; // no longer needed
	}


	

}
