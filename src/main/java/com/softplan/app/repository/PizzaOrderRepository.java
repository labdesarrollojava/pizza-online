package com.softplan.app.repository;

import com.softplan.app.domain.PizzaOrder;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PizzaOrder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {

}
