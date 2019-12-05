package com.softplan.app.service;

import com.softplan.app.domain.PizzaOrder;
import com.softplan.app.repository.PizzaOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing PizzaOrder.
 */
@Service
@Transactional
public class PizzaOrderService {

    private final Logger log = LoggerFactory.getLogger(PizzaOrderService.class);

    private final PizzaOrderRepository pizzaOrderRepository;

    public PizzaOrderService(PizzaOrderRepository pizzaOrderRepository) {
        this.pizzaOrderRepository = pizzaOrderRepository;
    }

    /**
     * Save a pizzaOrder.
     *
     * @param pizzaOrder the entity to save
     * @return the persisted entity
     */
    public PizzaOrder save(PizzaOrder pizzaOrder) {
        log.debug("Request to save PizzaOrder : {}", pizzaOrder);
        return pizzaOrderRepository.save(pizzaOrder);
    }

    /**
     * Get all the pizzaOrders.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Transactional(readOnly = true)
    public Page<PizzaOrder> findAll(Pageable pageable) {
        log.debug("Request to get all PizzaOrders");
        return pizzaOrderRepository.findAll(pageable);
    }


    /**
     * Get one pizzaOrder by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Transactional(readOnly = true)
    public Optional<PizzaOrder> findOne(Long id) {
        log.debug("Request to get PizzaOrder : {}", id);
        return pizzaOrderRepository.findById(id);
    }

    /**
     * Delete the pizzaOrder by id.
     *
     * @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete PizzaOrder : {}", id);
        pizzaOrderRepository.deleteById(id);
    }
}
