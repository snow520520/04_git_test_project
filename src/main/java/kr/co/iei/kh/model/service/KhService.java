package kr.co.iei.kh.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.iei.kh.model.dao.KhDao;
import kr.co.iei.kh.model.vo.Kh;

@Service
public class KhService {
	@Autowired
	private KhDao khDao;

	public Kh searchKh(Kh k) {
		Kh kh = khDao.searchKh(k);
		return kh;
	}
	
	
}
