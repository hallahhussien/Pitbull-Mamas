package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * A class to represent a product.
 *
 * @author Hallah
 */
@Entity
@Table(name = "products")
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
    private int productPrice;

    @Column(name = "featured")
    private String featured;

    @Column(name = "favorited")
    private String favorited;

    @Column(name = "productImage")
    private String productImage;


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
     * @param favorited user favorited
     * @param featured featured
     * @param productImage product image
     *
     */
    public Product(String productName, String productDescription, String productType, String productLink, int productPrice, String favorited, String featured, String productImage ) {

        this.productName = productName;
        this.productDescription = productDescription;
        this.productType = productType;
        this.productLink = productLink;
        this.productPrice = productPrice;
        this.favorited = favorited;
        this.featured = featured;
        this.productImage = productImage;


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

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getFeatured() {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }

    public String getFavorited() {
        return favorited;
    }

    public void setFavorited(String favorited) {
        this.favorited = favorited;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }




    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", image=" + productImage +
                '}';
    }
}