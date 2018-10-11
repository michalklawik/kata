package com.codewars;

public class MovieTickets {

    public static int movieTickets(int card, int ticket, double perc) {
        double redactedTicketTotal = card;
        double normalTicketTotal = 0;
        double redactedTicket = ticket;
        int i = 0;
        do {
            normalTicketTotal += ticket;
            redactedTicket *= perc;
            redactedTicketTotal += redactedTicket;
            i++;
        } while (Math.ceil(redactedTicketTotal) >= normalTicketTotal);
        return i;
    }
}
