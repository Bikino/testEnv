package com.bkn.amazonclient.account_service.repository;

import com.bkn.amazonclient.account_service.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,String> {


}
