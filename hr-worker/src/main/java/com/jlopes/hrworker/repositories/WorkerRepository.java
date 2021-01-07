package com.jlopes.hrworker.repositories;

import com.jlopes.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {



}
