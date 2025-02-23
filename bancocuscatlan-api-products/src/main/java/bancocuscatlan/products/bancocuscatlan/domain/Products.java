package bancocuscatlan.products.bancocuscatlan.domain;

import java.math.BigDecimal;

public class Products {
    private Long id;
    private String title;
    private BigDecimal price;
    private String description;
    private String category;
    private String image;
    private Rating rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

   private Products(ProductsBuilder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.price = builder.price;
        this.description = builder.description;
        this.category = builder.category;
        this.image = builder.image;
        this.rating = builder.rating;
   }

   public static class ProductsBuilder {
       private Long id;
       private String title;
       private BigDecimal price;
       private String description;
       private String category;
       private String image;
       private Rating rating;

       public ProductsBuilder id(Long id){
            this.id = id;
            return this;
       }

       public ProductsBuilder title(String title){
           this.title = title;
           return this;
       }

       public ProductsBuilder price(BigDecimal price){
            this.price = price;
            return this;
       }

       public ProductsBuilder description(String description){
           this.description = description;
           return this;
       }

       public ProductsBuilder category(String category){
           this.category = category;
           return this;
       }

       public ProductsBuilder image(String image){
           this.image = image;
           return this;
       }

       public ProductsBuilder rating(Rating rating){
           this.rating = rating;
           return this;
       }

       public Products build(){
           return new Products(this);
       }
   }

   public static ProductsBuilder builder(){
        return new ProductsBuilder();
   }

}
