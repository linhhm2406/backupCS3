package service;

import model.Account;

public interface AccountService {
    Account findByLoginName(String loginName);
}
