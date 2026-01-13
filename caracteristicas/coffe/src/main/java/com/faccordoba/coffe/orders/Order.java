package com.faccordoba.coffe.orders;


import org.jspecify.annotations.Nullable;

public record Order(String email, @Nullable String promoCode) {
}
