package com.roman.netmonitor.devices.services;

import com.roman.netmonitor.Command;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DeleteDeviceService implements Command<Void, String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Device Deleted");

    }
}
