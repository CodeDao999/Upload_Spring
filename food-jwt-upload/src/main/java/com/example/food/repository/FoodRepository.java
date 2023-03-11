package com.example.food.repository;

import com.example.food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> {

}
