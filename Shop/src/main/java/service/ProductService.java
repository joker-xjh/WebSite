package service;

import java.util.List;

import model.Product;

public interface ProductService {
	
	// ���ݶ��������ѯ��Ʒ
	List<Product> findByCsID(Integer categorySecondID, Integer page);
	
	// ����һ�������ѯ��Ʒ
	List<Product> findByCID(Integer categoryID, Integer page);
	
	// �������ȵ���Ʒ10��
	List<Product> findHot();
	
	// �������µ���Ʒ10��
	List<Product> findNew();
	
	//������Ʒ��ID��ֵ��ѯ��Ʒ
	Product findByID(Integer productID);
	
	//����һ��������Ʒ������
	Integer countProductFromCategory(Integer categoryID);
	
	//���ض���������Ʒ������
	Integer countProductFromCategorySecond(Integer categorySecondID);
	
	//������Ʒ
	void save(Product product);
	
	//������Ʒ
	void update(Product product);
	

}
