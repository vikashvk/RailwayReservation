package com.rs.dao;

import com.rs.bean.Passenger;

/**
 * @author v2
 *
 */
public interface IReservationDao {
/**
 * @param pnrno is primary key and unique for enquiry
 * @return
 */
public Passenger findByPNRNo(String pnrno );
}
