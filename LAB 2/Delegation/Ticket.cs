using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Task_1;

namespace Task_1
{
    interface Ticket
    {
        bool bookTicket(Passenger passenger);
    }

// Train class that implements Ticket interface
    class Train: Ticket
    {
     private int trainNumber;
     private int availableSeats;
     public Train(int trainNumber, int availableSeats)
    {
        this.trainNumber = trainNumber;
        this.availableSeats = availableSeats;
    }
    public bool bookTicket(Passenger passenger)
    {
        if (availableSeats > 0)
        {
            availableSeats--;
            Console.WriteLine(" Ticket booked for passenger " + passenger.getName() + " on train " + trainNumber);
            return true;
        }
        else
        {
            Console.WriteLine("No available seats on train " + trainNumber);
            return false;
            }
        }
    }

 // Plane class that implements Ticket interface
    class Plane:Ticket
    {
    private int flightNumber;
    private int availableSeats;

    public Plane (int flightNumber, int availableSeats)
    {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    public bool bookTicket(Passenger passenger)
    {
        if (availableSeats > 0)
        {
            availableSeats--;
            Console.WriteLine(" Ticket booked for passenger " + passenger.getName() + " on flight " + flightNumber);
            return true;
        }
        else
        {
            Console.WriteLine("No available seats on flight " + flightNumber);
            return false;
        }
    }
    }

    class BookingManagement
    {
    public static void bookTicket(Ticket ticket, Passenger passenger)
        {
            ticket.bookTicket(passenger);
        }
    }
}
