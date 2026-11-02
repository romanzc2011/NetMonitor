package com.roman.netmonitor.devices.services;

import com.roman.netmonitor.Query;
import com.roman.netmonitor.devices.DeviceRepository;
import com.roman.netmonitor.devices.model.Device;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDeviceService implements Query<Void, List<Device>> {
>
    private final DeviceRepository deviceRepository;

    public GetDeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public ResponseEntity<List<Device>> execute(Void input) {
        List<Device> devices = deviceRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(devices);
    }
}
