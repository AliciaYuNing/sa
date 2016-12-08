package DAOandDAODB;

import java.util.List;

import com.sample.product.entity.Product;

public interface ProductDAO_a {
	
	public List<Product> getListHome();
	public List<Product> getListMobilephone(String c);
	public List<Product> getListAudioeq(String c);
	public List<Product> getListCharger(String c);
	public List<Product> getListMouse(String c);
	
	public Product get(long id);
	
	public void insert(Product aProduct);
	
	public void update(Product aProduct);
	
	public void delete(long id);

	public int count();

}
