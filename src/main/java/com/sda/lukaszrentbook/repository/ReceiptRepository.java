package com.sda.lukaszrentbook.repository;

import com.sda.lukaszrentbook.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {

}
