package bamboo.sample.account.component;

import bamboo.sample.account.models.AccountRepository;
import bamboo.sample.accountrouter.IAccount;

/**
 * Created by tangshuai on 2018/3/16.
 */

public class AccountComponentOutput implements IAccount {

    @Override
    public String getUserName() {
        return AccountRepository.getUserName();
    }
}
