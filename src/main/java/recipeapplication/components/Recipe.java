package recipeapplication.components;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Recipe {

	@NotNull
	String id;

	@NotNull
	String category;

	@NotNull
	List<String> ingridiant;

	@NotNull
	String preperation;

	String recipeImageId; // TODO: figure out how to store images

	public Recipe() {
	}

	public Recipe(String id, String category, List<String> ingridiant, String preperation, String recipeImageId) {
		super();
		this.id = id;
		this.category = category;
		this.ingridiant = ingridiant;
		this.preperation = preperation;
		this.recipeImageId = recipeImageId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getIngridiant() {
		return ingridiant;
	}

	public void setIngridiant(List<String> ingridiant) {
		this.ingridiant = ingridiant;
	}

	public String getPreperation() {
		return preperation;
	}

	public void setPreperation(String preperation) {
		this.preperation = preperation;
	}

	public String getRecipeImageId() {
		return recipeImageId;
	}

	public void setRecipeImageId(String recipeImageId) {
		this.recipeImageId = recipeImageId;
	}
}
