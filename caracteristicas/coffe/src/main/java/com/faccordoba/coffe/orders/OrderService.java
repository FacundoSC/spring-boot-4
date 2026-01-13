package com.faccordoba.coffe.orders;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order createOrder(String email, @Nullable String promoCode) {

        // el email send cannot be null
        sendEmailConfirmation(email);

        // promoCode can be null
        if (promoCode != null)
            applyPromoCode(promoCode);

        return  new Order(email, promoCode);
    }

    private void applyPromoCode(@Nullable String promoCode) {
        System.out.println("Applying promo code: " + promoCode);
    }

    private void sendEmailConfirmation(String email) {
        // Logic to send email confirmation
        System.out.println("Email confirmation sent to: " + email);
    }
}
