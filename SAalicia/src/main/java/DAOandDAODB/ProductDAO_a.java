package DAOandDAODB;

import java.util.List;

import com.sample.product.entity.Product;

public interface ProductDAO_a {
	
	public List<Product> getList();
	public List<Product> getListArrival(String c);//category產品類別
	public List<Product> getListSale(String c);
	public List<Product> getListWomen(String c);
	public List<Product> getListAccessorizies(String c);
	public void insert(Product aProduct);
	
	

	public Product get(long id);
	
	public void update(Product aProduct);
	
	public void delete(long id);

	public int count();

}
