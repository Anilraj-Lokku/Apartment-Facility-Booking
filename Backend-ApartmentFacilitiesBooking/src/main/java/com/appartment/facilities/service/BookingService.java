package com.appartment.facilities.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appartment.facilities.dto.BookingDto;
import com.appartment.facilities.dto.CreateBookingResponseDto;

@Service
public interface BookingService {
	
	CreateBookingResponseDto createBooking(BookingDto bookingDto) 
	List<BookingDto> getAllBooking();
	String approveOrRejectBooking(int bookingId,boolean isApproved)
	BookingDto getBookingById(int bookingId) 
	BookingDto cancelBooking(int bookingId) 
}
