import type {ReactNode} from "react";
import "../styles/App.css";
import Header from "./Header";
import NetMonitorSidebar from "./NetMonitorSidebar";

interface LayoutProps {
    children: ReactNode;
}

export default function Layout({ children }: LayoutProps) {
    return (
        <>
            <NetMonitorSidebar />
            <Header />
            <main className="main-content">
                {children}
            </main>
        </>
    );
}