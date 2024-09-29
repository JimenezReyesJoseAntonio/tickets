package com.example.ticket.registration;

public record Registration(
        Integer id,
        Integer productId,
        String ticketCode,
        String attendeeName
) {
}
