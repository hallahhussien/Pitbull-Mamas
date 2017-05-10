package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * A class to represent a product.
 *
 * @author Hallah
 */
@Entity
@Table(name="products")
public class Product {


    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "productId")
    private int productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "productType")
    private String productType;

    @Column(name = "productLink")
    private String productLink;

    @Column(name = "productPrice")
    private String productPrice;

    @Column(name = "featured")
    private String featured;

    @Lob
    @Column(name="image", columnDefinition="mediumblob")
    private byte[] image;



    /**
     * Instantiates a new Product.
     */
    public Product() {
    }

    /**
     * Instantiates a new Product.
     *
     * @param productName   the name
     * @param productDescription        the description
     * @param productType      the type
     * @param productLink        the link
     * @param productPrice price
     * @param featured featured
     * @param image image


     *
     */
    public Product(String productName, String productDescription, String productType, String productLink, String productPrice, String featured, byte[] image) {

        this.productName = productName;
        this.productDescription = productDescription;
        this.productType = productType;
        this.productLink = productLink;
        this.productPrice = productPrice;
        this.featured = featured;
        this.image = image;

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getFeatured(String featured) {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }



    public byte[] getImage() {

        return image;

    }

    public void setImage(byte[] image) {

        this.image = image;

    }

    public String getFeatured() {
        return featured;
    }


//
//
//
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "productName='" + productName + '\'' +
//                "productDescription" + productDescription + '\'' +
//                "productType='" + productType + '\'' +
//                "productLink" + productLink + '\'' +
//                "productPrice='" + productPrice + '\'' +
//                ", image=" + image +
//                '}';
//    }
}