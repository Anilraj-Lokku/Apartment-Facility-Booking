package com.appartment.facilities.service.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.appartment.facilities.dto.BookingDto;
import com.appartment.facilities.entity.Booking;

import io.jsonwebtoken.lang.Arrays;

@SpringBootTest
public class BookingServiceImplTest {
@Test
    public void testGetAllBooking() {
        Booking booking = new Booking();
        booking.setId(1);
        booking.setFacilityId(1);
        booking.setResidentId(1);

        when(bookingRepository.findAll()).thenReturn(Arrays.asList(booking));

        List<BookingDto> bookings = bookingService.getAllBooking();

        assertEquals(1,bookings.size());
    }
}
