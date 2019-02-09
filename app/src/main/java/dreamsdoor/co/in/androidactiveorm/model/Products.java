package dreamsdoor.co.in.androidactiveorm.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Products", id = "_id")
public class Products extends Model {

    public Products() {
        super();
    }

    @Column(name = "productName")
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
