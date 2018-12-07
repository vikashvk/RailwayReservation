package com.rs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.rs.bean.Passenger;
import com.rs.exception.HandleException;

/**
 * @author v2
 *
 */
@Repository
public class ReservationDaoImpl implements IReservationDao {
	@Autowired
	MongoTemplate mongo;

	/* (non-Javadoc)
	 * @see com.rs.dao.IReservationDao#findByPNRNo(java.lang.String)
	 */
	@Override
	public Passenger findByPNRNo(String pnrno) {
		Passenger p = null;
		p = mongo.findById(pnrno, Passenger.class);
		if (p == null) {
			throw new HandleException("PNR Not Found Wrong PnrNo : " + pnrno);
		}
		return p;
	}

}
