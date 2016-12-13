/**
 * sample program for web programming written by Ben Wu
 * reference: http://www.mkyong.com/spring/maven-spring-jdbc-example/
 */
package com.sample.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sample.product.entity.Product;

public class ProductDAODB implements ProductDAO {
	private DataSource dataSource;
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement smt = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Product> getList() {
		String sql = "SELECT * FROM product";
		return getList(sql);
	}

	public List<Product> getListArrival(String c) {
		String sql1 = "SELECT * FROM product where Category='" + c + "'";

		return getList(sql1);
	}

	public List<Product> getListSale(String c) {
		String sql2 = "SELECT * FROM product where Category='" + c + "'";
		return getList(sql2);

	}

	public List<Product> getListWomen(String c) {
		String sql3 = "SELECT * FROM product where Category='" + c + "'";
		return getList(sql3);
	}

	public List<Product> getListAccessorizies(String c) {
		String sql4 = "SELECT * FROM product where Category='" + c + "'";
		return getList(sql4);
	}

	// make it a generic method for different conditions
	public List<Product> getList(String sql) {

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
				//aProduct.setSize(rs.getString("size"));
				//aProduct.setColor(rs.getString("color"));
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
		String sql = "INSERT INTO product (Category, Description, price, Inventory, ReorderPoint) VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			smt.setString(1, aProduct.getCategory());
			smt.setString(2, aProduct.getDesc());
			//smt.setString(3, aProduct.getSize());
			//smt.setString(3, aProduct.getColor());
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
			//smt.setString(3, aProduct.getSize());
			//smt.setString(3, aProduct.getColor());
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
			//smt.setString(3, aProduct.getSize());
			//smt.setString(3, aProduct.getColor());
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

}// ProductDAOBean
