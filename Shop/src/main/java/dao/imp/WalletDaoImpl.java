package dao.imp;

import org.springframework.stereotype.Repository;

import dao.WalletDao;
import model.Wallet;

@Repository("walletDao")
public class WalletDaoImpl extends BaseDaoImpl<Wallet> implements WalletDao{

}
