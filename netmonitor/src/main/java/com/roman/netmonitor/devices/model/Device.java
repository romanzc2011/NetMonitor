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
    @Column(name="ID")
    private Integer id;

    @Column(name="UUID")
    private UUID uuid;

    @Column(name="DEVICE_NAME")
    private String deviceName;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="TYPE")
    private String type;

    @Column(name="IP_ADDRESS")
    private String ipAddress;

    @Column(name="MAC_ADDRESS")
    private String macAddress;

    @Column(name="CPU_USAGE")
    private Integer cpuUsage;

    @Column(name="RAM_USAGE")
    private Integer ramUsage;

    @Column(name="DISK_USAGE")
    private Integer diskUsage;

    @Column(name="STATUS")
    @Enumerated(EnumType.STRING)
    private DeviceStatus status;

    public Device(
            Integer id,
            UUID uuid,
            String deviceName,
            String description,
            String type,
            String ipAddress,
            String macAddress,
            Integer cpuUsage,
            Integer ramUsage,
            Integer diskUsage,
            DeviceStatus status
    ) {
        this.id = id;
        this.uuid = uuid;
        this.deviceName = deviceName;
        this.description = description;
        this.type = type;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
        this.cpuUsage = cpuUsage;
        this.ramUsage = ramUsage;
        this.diskUsage = diskUsage;
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public void setRamUsage(Integer ramUsage) {
        this.ramUsage = ramUsage;
    }

    public void setDiskUsage(Integer diskUsage) {
        this.diskUsage = diskUsage;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public Integer getCpuUsage() {
        return cpuUsage;
    }

    public Integer getRamUsage() {
        return ramUsage;
    }

    public Integer getDiskUsage() {
        return diskUsage;
    }

    public DeviceStatus getStatus() {
        return status;
    }
}
