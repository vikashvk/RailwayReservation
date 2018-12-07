package com.rs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.bean.Passenger;
import com.rs.dao.IReservationDao;
import com.rs.exception.HandleException;

/**
 * @author v2
 *
 */
@Service
public class ReservationServiceImpl implements IReservationService {
	@Autowired
	IReservationDao dao;

	/* (non-Javadoc)
	 * @see com.rs.service.IReservationService#findByPNRNo(java.lang.String)
	 */
	@Override
	public Passenger findByPNRNo(String pnrno)  {
		return dao.findByPNRNo(pnrno);
	}

}
