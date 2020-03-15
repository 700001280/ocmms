package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.common.Currency;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CurrencyRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Currency.class)
public interface CurrencyRepository extends DetachableJpaRepository<Currency, Long>, CurrencyRepositoryCustom {
}
