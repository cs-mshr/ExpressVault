# ExpressVault - v1
##### The cutting‐edge solution for seamless, secure, and efficient package management, providing hassle‐free deliveries and returns

## Problem Statement
Design a locker management system for an ecommerce store. The system should allow users to opt for delivery to a locker system near their location. The delivery person will place the package in a locker and generate an OTP for the user. The user can visit the locker, enter the OTP, and retrieve their package. The system should also support returning items by allowing users to place the item in the locker and sending an OTP to the delivery person. Additionally, the system should have the ability to view and vacate lockers that have been in use for more than three days.

## Solution

The solution is implemented using a Java-based RESTful API with the following main components:

- `LockerService`: Manages the allocation and activation of lockers for orders.
- `Customer`: Represents a customer entity.
- `DeliveryAgent`: Represents a delivery agent entity.
- `Parcel`: Represents a package entity.
- `ProgramController`: Contains the RESTful endpoints for assigning lockers to orders and customer interactions.

To assign a locker to an order, use the `/deliveryagent/assignLockerto/{order_id}` endpoint. The system will find an empty locker and activate it for the specified order.

To take an order from a locker, use the `/customers/getorder/{orderID}` endpoint. The system will mark the locker as available and provide the details of the picked order.

Please refer to the code for more details on the implementation, including code readability, extensibility, modularity, and testability.

## Getting Started

1. Clone the repository.
2. Build and run the application.
3. Use a REST client to interact with the provided endpoints.

## API Endpoints

- `GET /home`: Displays a welcome message.
- `POST /deliveryagent/assignLockerto/{order_id}`: Assigns a locker to an order.
- `POST /customers/getorder/{orderID}`: Takes an order from a locker.

  
![image](https://github.com/cs-mshr/ExpressVault/assets/95642555/60ab477c-97ed-4118-85b3-e701ad564bd9)


Please note that this is a high-level overview. 
