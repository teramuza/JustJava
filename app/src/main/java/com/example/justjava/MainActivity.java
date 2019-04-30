package com.example.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int qty = 0;
    int price = 38000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(qty);
        String msg = "Silahkan tekan tombol + untuk membeli kopi";
        displayMessage(msg);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage = qty + " gelas kopi dengan total harga " + displayPrice(qty * price) + ",-\n\nTeimakasih telah berbelanja di JustJava";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void incrementButton(View view){
        qty++;
        display(qty);
        String msg = qty + " gelas kopi seharga " + displayPrice(qty * price) + ",-";
        displayMessage(msg);
    }

    /**
     * This method is called when the decrement button is clicked.
     */
    public void decrementButton(View view){
        qty--;
        display(qty);
        String msg = qty + " gelas kopi seharga " + displayPrice(qty * price) + ",-";
        displayMessage(msg);
    }

    /**
     * This method displays the given price on the screen.
     */
    private String displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        return NumberFormat.getCurrencyInstance().format(number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
