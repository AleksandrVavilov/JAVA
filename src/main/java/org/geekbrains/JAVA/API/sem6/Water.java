package org.geekbrains.JAVA.API.sem6;

import java.time.LocalDateTime;

public class Water extends Goods {
    public boolean isSparking;

    public Water(double price, String vendorCode, LocalDateTime creationDate, int guarantee, boolean isSparking) {
        super(price, vendorCode, creationDate, guarantee);
        this.isSparking = isSparking;
    }
}
