package dreamsdoor.co.in.androidactiveorm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dreamsdoor.co.in.androidactiveorm.model.Products;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText productName;
    Button insertButton;
    Products products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            productName = findViewById(R.id.productName);
            insertButton = findViewById(R.id.buttom);
            insertButton.setOnClickListener(this);

        } catch (Exception e) {
            Log.i("Error Message : ", e.getMessage());
        }
    }

    @Override
    public void onClick(View v) {
        products = new Products();
        String product_name = productName.getText().toString();
        products.setProductName(product_name);
        products.save();
        Toast.makeText(getApplicationContext(), "Recorded", Toast.LENGTH_SHORT)
                .show();
        productName.setText("");
        productName.requestFocus();
    }
}
