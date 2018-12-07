package com.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rs.bean.Passenger;
import com.rs.service.IReservationService;

/**
 * @author v2
 *
 */
@RestController
public class ReservationController {
	@Autowired
	IReservationService service;

	/**
	 * @param pnrno is primary key and unique for enquiry
	 * @return service interafce method
	 */
	@GetMapping(path = "/user/{pnrno}")
	public Passenger readByPnrNo(@PathVariable("pnrno") String pnrno)  {
		return service.findByPNRNo(pnrno);
	}
}
