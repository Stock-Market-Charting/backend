package com.smc.sp.dto;

import lombok.Data;

import java.util.Date;

@Data
public class StockPriceDto {

    private Float currentPrice = 0.0f;

    private Date stockTimestamp;

}
