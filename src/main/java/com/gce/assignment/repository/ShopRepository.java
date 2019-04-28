package com.gce.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gce.assignment.entity.Shop;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Integer>{

}
