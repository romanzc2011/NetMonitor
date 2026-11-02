package com.roman.netmonitor.devices.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    // Dependency Injection
    private final CreateDeviceService createDeviceService;
    private final DeleteDeviceService deleteDeviceService;
    private final UpdateDeviceService updateDeviceService;
    private final GetDeviceService getDeviceService;

    public DeviceController(
            CreateDeviceService createDeviceService,
            DeleteDeviceService deleteDeviceService,
            UpdateDeviceService updateDeviceService,
            GetDeviceService getDeviceService
    ) {
        this.createDeviceService = createDeviceService;
        this.deleteDeviceService = deleteDeviceService;
        this.updateDeviceService = updateDeviceService;
        this.getDeviceService = getDeviceService;
    }

    // CREATE DEVICES
    @PostMapping
    public ResponseEntity<String> createDevices() {
        return createDeviceService.execute(null);
    }

    // GET DEVICES
    @GetMapping
    public ResponseEntity<String> getDevices() {
        return getDeviceService.execute(null);
    }

    // UPDATE DEVICES
    @PutMapping
    public ResponseEntity<String> updateDevices() {
        return updateDeviceService.execute(null);
    }

    // DELETE DEVICES
    @DeleteMapping
    public ResponseEntity<String> deleteDevices() {
        return deleteDeviceService.execute(null);
    }
}
