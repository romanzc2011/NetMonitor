import { Sidebar, Menu, MenuItem, SubMenu } from "react-pro-sidebar";
import {useEffect, useState} from "react";
import { Routes, Route } from "react-router-dom";

export default function AppSidebar() {
  return (
    <Sidebar>
      <Menu>
        <MenuItem>Dashboard</MenuItem>
        <SubMenu label="Management">
          <MenuItem>Users</MenuItem>
          <MenuItem>Projects</MenuItem>
        </SubMenu>
        <MenuItem>Devices</MenuItem>
        <MenuItem>Analytics</MenuItem>
        <MenuItem>Topology</MenuItem>
        <MenuItem>Settings</MenuItem>
      </Menu>
    </Sidebar>
  );
}