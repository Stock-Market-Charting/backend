package com.smc.sp.controller;

import com.smc.sp.dto.PageDto;
import com.smc.sp.dto.ResponseResult;
import com.smc.sp.dto.StockPriceDto;
import com.smc.sp.dto.Summary;
import com.smc.sp.service.IStockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/api/v1/stock-prices")
public class StockPriceController {

    @Autowired
    private IStockPriceService stockPriceService;

    @GetMapping
    public ResponseResult<PageDto<StockPriceDto>> findAll(
            @PageableDefault(sort = {"stockTimestamp"}) Pageable pageable) {

        PageDto<StockPriceDto> page = stockPriceService.findAll(pageable);

        return ResponseResult.success("get all successfully", page);
    }

    @GetMapping("/templates")
    public ResponseEntity<Resource> downloadTemplate(@RequestParam(name = "filename") String filename) {
        Resource resource = new ClassPathResource("/templates/" + filename);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/x-download"))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
                .body(resource);
    }

    @PostMapping("/upload")
    public ResponseResult<Summary> upload(@RequestParam("file") MultipartFile file) {
        Summary summary = stockPriceService.importStockPrices(file);

        return ResponseResult.success("upload successfully", summary);
    }

}
