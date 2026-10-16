package com.roman.netmonitor.devices.model;

import com.roman.netmonitor.devices.enums.DeviceStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, updatable = false)
    private UUID uuid;

    private String name;
    private String description;
    private String type;
    private String ipAddress;
    private String macAddress;
    private Integer cpuUsage;
    private Integer ramUsage;
    private Integer diskUsage;

    @Enumerated(EnumType.STRING)
    private DeviceStatus status;
}
