package com.hdd.repository;

import com.hdd.domain.Systemlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemlogRepo extends JpaRepository<Systemlog, String>, JpaSpecificationExecutor
{

}
