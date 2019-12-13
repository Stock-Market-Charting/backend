package com.smc.company.repository;

import com.smc.company.entity.IpoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IpoDetailsRepository extends JpaRepository<IpoDetails, Long> {
    Optional<IpoDetails> findByCompanyCodeAndStockExchangeName(String companyCode, String stockExchangeName);
}
