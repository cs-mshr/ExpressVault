package com.example.LockerSystem.Controller;

import com.example.LockerSystem.Entities.Customer;
import com.example.LockerSystem.Entities.DeliveryAgent;
import com.example.LockerSystem.Entities.Locker;
import com.example.LockerSystem.Entities.Parcel;
import com.example.LockerSystem.Service.*;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@NoArgsConstructor
public class ProgramController {

    @Autowired
    private LockerService lockerService;


    //---Welcome Page----
    @GetMapping("/home")
    public String Home(){
        return "Welcome to Locker Banking-APP";
    }


    //---Assign Locker to a order---\\
    @PostMapping("/deliveryagent/assignLockerto/{order_id}")
    public Locker AssignLocker(@PathVariable String order_id){

        Locker locker = lockerService.getEmptyLocker();
        System.out.println(locker);
        lockerService.activateLocker(locker , Integer.parseInt(order_id));

        return locker;
    }

    //---Customer take order---\\
    @PostMapping("/customers/getorder/{orderID}")
    public String takeOrder(@PathVariable Integer orderID){
        Locker locker = lockerService.findbyorderID(orderID);
        lockerService.markAvailable(locker);

        String s = "Order (order_id):" + String.valueOf(locker.getOrderId()) + "\nPicked from (locker no.) " + String.valueOf(locker.getLockerId());
        return s;
    }



}
