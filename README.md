## Apartment Facilities Booking - Capstone Project-Team 3

**This Project Contains.**

## Modules

### User Module

- Handles user authentication and authorization.
- Manages user accounts, roles, and permissions.

### Facility Manager Module

- Allows facility managers to view, add, edit, and delete facilities.
- Manages facility details and updates.

### Resident Module

- Enables residents to view and book facilities.
- Manages resident information and booking requests.

### Booking Management Module

- Oversees the booking process, including creation, modification, and cancellation of bookings.
- Handles booking status and history.

## Entities

### Booking

- **id:** Integer
- **bookingDate:** Date
- **facilityId:** Integer
- **residentId:** Integer
- **eventDate:** Date
- **status:** String

### Facility

- **id:** Integer
- **name:** String
- **status:** String
- **description:** String
- **picture:** String

### Manager

- **id:** Integer
- **name:** String
- **phone:** String
- **email:** String

### Resident

- **id:** Integer
- **name:** String
- **flatNo:** String
- **flatType:** String
- **phone:** String
- **email:** String

### User

- **userName:** String
- **password:** String
- **role:** String
- **status:** String
