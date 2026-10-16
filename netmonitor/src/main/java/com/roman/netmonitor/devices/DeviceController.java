package com.roman.netmonitor.devices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    // GET DEVICES
    @GetMapping
    public ResponseEntity getDevices() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.emptyList());
    }
}
