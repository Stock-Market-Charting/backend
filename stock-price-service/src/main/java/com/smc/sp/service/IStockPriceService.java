package com.smc.sp.service;

import com.smc.sp.dto.PageDto;
import com.smc.sp.dto.StockPriceDto;
import com.smc.sp.dto.Summary;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface IStockPriceService {
    PageDto<StockPriceDto> findAll(Pageable pageable);
    Summary importStockPrices(MultipartFile file);
}
