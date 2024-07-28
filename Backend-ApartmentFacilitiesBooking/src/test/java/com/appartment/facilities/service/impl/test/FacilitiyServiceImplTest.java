package com.appartment.facilities.service.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.appartment.facilities.entity.Booking;
import com.appartment.facilities.exception.BookingException;

@SpringBootTest
public class FacilitiyServiceImplTest {
    @Test
    public void testApproveOrRejectBooking() throws BookingException {
        Booking booking = new Booking();
        booking.setId(1);
        booking.setStatus("Pending");

        when(bookingRepository.findById(1)).thenReturn(Optional.of(booking));

        String result = bookingService.approveOrRejectBooking(1, true);

        assertEquals("booking with id:1 is accepted", result);
        verify(bookingRepository).save(any(Booking.class));
    }

}
