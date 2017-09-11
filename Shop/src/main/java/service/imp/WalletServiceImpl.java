package service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.WalletDao;
import model.Wallet;
import service.WalletService;

@Transactional
@Service("walletService")
public class WalletServiceImpl implements WalletService{

	@Autowired
	private WalletDao walletDao;
	
	public void update(Wallet wallet) {
		walletDao.update(wallet);
	}

}
