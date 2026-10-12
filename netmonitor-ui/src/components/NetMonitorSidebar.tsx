
import { Sidebar, Menu, MenuItem } from "react-pro-sidebar";
import { NavLink } from "react-router-dom";
import {
    LayoutDashboard,
    Server,
    Activity,
    Network,
    Settings,
    UserRound
} from "lucide-react";

import "../styles/Sidebar.css";

function NetMonitorSidebar() {
    return (
        <Sidebar
            width="240px"
            backgroundColor="#080d1f"
            rootStyles={{
                position: "fixed",
                top: "0",
                left: "0",
                borderRight: "1px solid #1e293b",
                height: "100vh",
            }}
        >
            <div className="sidebar-container">

                {/* Logo */}
                <div className="sidebar-header">
                    <Network size={32} color="#3b82f6" />
                    <div>
                        <h2>NetMonitor</h2>
                        <span>Network Platform</span>
                    </div>
                </div>

                {/* Navigation */}
                <Menu
                    menuItemStyles={{
                        button: {
                            color: "#94a3b8",
                            borderRadius: "8px",
                            margin: "4px 12px",
                            paddingLeft: "14px",
                            height: "40px",

                            "&:hover": {
                                backgroundColor: "#172554",
                                color: "#ffffff",
                            },

                            "&.active": {
                                backgroundColor: "#1d4ed8",
                                color: "#ffffff",
                            },
                        },
                        icon: {
                            minWidth: "30px",
                        },
                    }}
                >
                    <MenuItem
                        icon={<LayoutDashboard size={18} />}
                        component={<NavLink to="/dashboard" />}
                    >
                        Dashboard
                    </MenuItem>

                    <MenuItem
                        icon={<Server size={18} />}
                        component={<NavLink to="/devices" />}
                    >
                        Devices
                    </MenuItem>

                    <MenuItem
                        icon={<Activity size={18} />}
                        component={<NavLink to="/analytics" />}
                    >
                        Analytics
                    </MenuItem>

                    <MenuItem
                        icon={<Network size={18} />}
                        component={<NavLink to="/topology" />}
                    >
                        Topology
                    </MenuItem>

                    <MenuItem
                        icon={<Settings size={18} />}
                        component={<NavLink to="/settings" />}
                    >
                        Settings
                    </MenuItem>
                </Menu>

                {/* User footer */}
                <div className="sidebar-footer">
                    <div className="user-avatar">
                        <UserRound size={16} />
                    </div>

                    <div className="user-info">
                        <strong>Admin User</strong>
                        <span>admin@network.io</span>
                    </div>
                </div>

            </div>
        </Sidebar>
    );
}

export default NetMonitorSidebar;
  