package com.example.demo.repository;

import com.example.demo.model.PurchaseRecord;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by song on 2017/10/23.
 */
@RepositoryRestResource
@CrossOrigin
public interface PurchaseRecordRepository extends PagingAndSortingRepository<PurchaseRecord, Long> {
}
