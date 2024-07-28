package com.appartment.facilities.service.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.appartment.facilities.dto.BookingDto;
import com.appartment.facilities.entity.Booking;
import com.appartment.facilities.exception.BookingException;

import io.jsonwebtoken.lang.Arrays;

@SpringBootTest
public class BookingServiceImplTest {
@Test
    public void testGetBookingById() throws BookingException {
        Booking booking = new Booking();
        booking.setId(1);
        booking.setFacilityId(1);
        booking.setResidentId(1);

        when(bookingRepository.findById(1)).thenReturn(Optional.of(booking));

        BookingDto bookingDto = bookingService.getBookingById(1);

        assertEquals(1, bookingDto.getId());
       }
    @Test
    public void testGetBookingById() throws BookingException {
        Booking booking = new Booking();
        booking.setId(1);
        booking.setFacilityId(1);
        booking.setResidentId(1);

        when(bookingRepository.findById(1)).thenReturn(Optional.of(booking));

        BookingDto bookingDto = bookingService.getBookingById(1);

        assertEquals(1, bookingDto.getId());
       
     }
    @Test
    public void testGetBookingById() throws BookingException {
        Booking booking = new Booking();
        booking.setId(1);
        booking.setFacilityId(1);
        booking.setResidentId(1);

        when(bookingRepository.findById(1)).thenReturn(Optional.of(booking));

        BookingDto bookingDto = bookingService.getBookingById(1);

        assertEquals(1, bookingDto.getId());
   }
}
