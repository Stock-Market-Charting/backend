package com.smc.sp.repository;

import com.smc.sp.entity.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface StockPriceRepository extends JpaRepository<StockPrice, Long> {

    Optional<StockPrice> findByCompanyCodeAndStockExchangeAndStockTimestamp(
            String companyCode, String StockExchange, Date StockTimestamp
    );

}
