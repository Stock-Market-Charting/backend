package com.smc.company;

import com.smc.company.entity.StockExchange;
import com.smc.company.service.ICompanyService;
import com.smc.company.vo.CompanyVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CompanyTest extends CompanyServiceTests {

    @Autowired
    private ICompanyService companyService;

    @Test
    public void test1() {
        CompanyVo companyVo = new CompanyVo();

        companyVo.setBrief("test");
        companyVo.setCeo("Xu Li Test");
        companyVo.setCompanyName("Best Of World Ltd.");
        companyVo.setDirectors("Zhang San, Li Si, Wang Wu");
        companyVo.setSectorId((long) 1);
        companyVo.setSector("Finance");
        companyVo.setTurnover(10000000);

//        List<StockExchange> stockExchanges = new ArrayList<>();
//        StockExchange stockExchange = new StockExchange();
//        stockExchange.setStockExchangeId((long) 1);
//        stockExchange.setStockExchange("BSE");
//        stockExchanges.add(stockExchange);
//
//        companyVo.setStockExchanges(stockExchanges);

        companyService.add(companyVo);

    }

    @Test
    public void test2() {
        CompanyVo companyVo = new CompanyVo();

        companyVo.setBrief("test");
        companyVo.setCeo("Xu Li Test");
        companyVo.setCompanyName("Best Of World Ltd.");
        companyVo.setDirectors("Zhang San, Li Si, Wang Wu");
        companyVo.setSectorId((long) 1);
        companyVo.setSector("Finance");
        companyVo.setTurnover(10000000);

//        List<StockExchange> stockExchanges = new ArrayList<>();
//        StockExchange stockExchange = new StockExchange();
//        stockExchange.setStockExchangeId((long) 2);
//        stockExchange.setStockExchange("NSE");
//        stockExchanges.add(stockExchange);
//
//        StockExchange stockExchange2 = new StockExchange();
//        stockExchange2.setStockExchangeId((long) 1);
//        stockExchange2.setStockExchange("BSE");
//        stockExchanges.add(stockExchange2);
//
//        companyVo.setStockExchanges(stockExchanges);

        companyService.update((long) 2, companyVo);

    }
}
