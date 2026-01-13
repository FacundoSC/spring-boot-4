package com.faccordoba.coffe.menu;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    // Array with Null safe

    public String[] getMenuItems() {
        return new String[] { "Espresso", "Cappuccino", "Latte", "Mocha" };
    }


    public @Nullable String [] getDailySpecials() {
        return new @Nullable String[]
                { "Pumpkin Spice Latte"
                        , null  // martes not available
                        , "Gingerbread Mocha",
                null, // jueves not available
                "Peppermint Cappuccino" };
    }


}
