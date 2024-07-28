package com.appartment.facilities.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appartment.facilities.dto.BookingDto;
import com.appartment.facilities.dto.CreateBookingResponseDto;
import com.appartment.facilities.exception.BookingException;

@Service
public interface BookingService {
	
<<<<<<< HEAD
	CreateBookingResponseDto createBooking(BookingDto bookingDto);
	List<BookingDto> getAllBooking();
	String approveOrRejectBooking(int bookingId,boolean isApproved);
	BookingDto getBookingById(int bookingId);
	BookingDto cancelBooking(int bookingId);
=======
	CreateBookingResponseDto createBooking(BookingDto bookingDto) throws BookingException;
	List<BookingDto> getAllBooking();
	String approveOrRejectBooking(int bookingId,boolean isApproved) throws BookingException;
	BookingDto getBookingById(int bookingId) throws BookingException;
	BookingDto cancelBooking(int bookingId) throws BookingException;
>>>>>>> 1fafc250e544e6f25edf4d8ace1090653731dbb6
}
