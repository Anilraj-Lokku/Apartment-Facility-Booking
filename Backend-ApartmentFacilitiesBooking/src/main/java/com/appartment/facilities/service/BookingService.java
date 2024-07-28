package com.appartment.facilities.service;

import java.util.List;
<<<<<<< HEAD

=======
<<<<<<< HEAD

import com.appartment.facilities.dto.BookingDto;
import com.appartment.facilities.dto.CreateBookingResponseDto;
import com.appartment.facilities.exception.BookingException;

public class BookingService {
	 CreateBookingResponseDto createBooking(BookingDto bookingDto) throws BookingException;
	List<BookingDto> getAllBooking();
	String approveOrRejectBooking(int bookingId,boolean isApproved) throws BookingException;
	BookingDto getBookingById(int bookingId) throws BookingException;
	BookingDto cancelBooking(int bookingId) throws BookingException;
=======
>>>>>>> d67dde192e347172ebacde65d0dfcc2411d6e89a

>>>>>>> babbb6e0daeb4be4959d6887d149f272728bc3bd
import org.springframework.stereotype.Service;

import com.appartment.facilities.dto.BookingDto;
import com.appartment.facilities.dto.CreateBookingResponseDto;

@Service
public interface BookingService {
	
<<<<<<< HEAD
	CreateBookingResponseDto createBooking(BookingDto bookingDto) extend BookingException ;
	List<BookingDto> getAllBooking();
	String approveOrRejectBooking(int bookingId,boolean isApproved) ;
	BookingDto getBookingById(int bookingId) ;
	BookingDto cancelBooking(int bookingId) ;
=======
	CreateBookingResponseDto createBooking(BookingDto bookingDto) 
	List<BookingDto> getAllBooking();
	String approveOrRejectBooking(int bookingId,boolean isApproved)
	BookingDto getBookingById(int bookingId) 
	BookingDto cancelBooking(int bookingId) 
>>>>>>> babbb6e0daeb4be4959d6887d149f272728bc3bd
}
