package dam.kum.dissanayakaclinicbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dam.kum.dissanayakaclinicbackend.dao.CategoryDAO;
import dam.kum.dissanayakaclinicbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Cardiology");
		category.setDescription("Best Category");
		category.setImageURL("DCat_1.png");

		categories.add(category);

		// adding second category
		category = new Category();
		category.setId(2);
		category.setName("Anesthesiologists");
		category.setDescription("Best Category");
		category.setImageURL("DCat_2.png");

		categories.add(category);

		// adding third category
		category = new Category();
		category.setId(3);
		category.setName("Allergists/Immunologists");
		category.setDescription("Best Category");
		category.setImageURL("DCat_3.png");

		categories.add(category);

		// adding Fourth category
		category = new Category();
		category.setId(4);
		category.setName("Allergists");
		category.setDescription("Best Category");
		category.setImageURL("DCat_4.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
