package com.bkn.amazonclient.account_service;

import com.bkn.amazonclient.account_service.model.Account;
import com.bkn.amazonclient.account_service.repository.AccountRepository;
import com.bkn.amazonclient.account_service.service.AccountServiceImpl;
 import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountServiceApplicationTests {

    @InjectMocks
    private AccountServiceImpl accountService;

    @Mock
    private AccountRepository repository;


    @Test
    public void getAllAccountsTest() {
//        Mockito.when(repository.findAll()).thenReturn(Stream.of(new Account("aaaa","Shema","Bradyn"))
//                .collect(Collectors.toList()));

        Mockito.when(repository.findAll()).thenReturn(Stream.of(
                Account.builder().firstName("Matt").lastName("Shama").build(),
                Account.builder().firstName("Bradyn").lastName("Shema").build())
                .collect(Collectors.toList()));
        assertEquals(2 ,accountService.getAllAccounts().size());
    }

    @Test
    public void saveAccountTest() {

        Account account1 = Account.builder().id("90").firstName("Briella").lastName("Shamika").build();
        Mockito.when(repository.save(account1)).thenReturn(account1);
        assertEquals(account1,accountService.saveAccount(account1));
     }

    @Test
    public void findAccountByIdTest() {
        Account acc = Account.builder().id("111").firstName("Briella").lastName("Shamika").build();
        Mockito.when(repository.findById("111")).thenReturn(Optional.of(acc));
        assertEquals(acc,accountService.findAccountById("111"));
     }

    @Test
    public void deleteAccountByIdTest() {
        Account acc = Account.builder().id("222").firstName("Ildephonse").lastName("Bikino").build();
        accountService.deleteAccountById("222");
        verify(repository, times(1)).deleteById("222");
    }

    @Test
    void contextLoads() {
    }

}
