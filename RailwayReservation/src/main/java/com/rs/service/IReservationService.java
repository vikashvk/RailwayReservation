package com.rs.service;

import com.rs.bean.Passenger;
import com.rs.exception.HandleException;

public interface IReservationService {

/**
 * @param pnrno  is primary key and unique for enquiry
 * @return
 */
public Passenger findByPNRNo(String pnrno ) ;
}
