package com.project.backendProjetoSantander.repository;

import com.project.backendProjetoSantander.model.Stock;
import com.project.backendProjetoSantander.model.dto.StockDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    Optional<Stock> findByNameAndDate(String name, LocalDate date);

    @Query("SELECT stock " +
            "from Stock stock " +
            "WHERE stock.name = :name and stock.date = :date and stock.id <> :id")
    Optional<Stock> findByStockUpdate(String name, LocalDate date,Long id);

    @Query("SELECT stock " +
            "from Stock stock " +
            "WHERE stock.date = :date ")
    Optional<List<Stock>> findByToday(LocalDate date);
}
