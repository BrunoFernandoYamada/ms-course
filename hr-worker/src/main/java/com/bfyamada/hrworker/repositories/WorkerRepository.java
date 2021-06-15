package com.bfyamada.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bfyamada.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
