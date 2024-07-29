package com.appartment.facilities.repository;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appartment.facilities.entity.Resident;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Integer> {
	Optional<Resident> findByUserName(String userName);

}
