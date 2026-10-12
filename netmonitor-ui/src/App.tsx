import React from "react";
import Layout from "./components/Layout";
import { Routes, Route } from "react-router";
import Analytics from "./pages/Analytics";
import Devices from "./pages/Devices";
import Dashboard from "./pages/Dashboard";
const App: React.FC = () => {
  return (
    <div>
      <Layout>
        {/* Your main content goes here */}

        <Routes>
          <Route path="/dashboard" element={<Dashboard />} />
          <Route path="/devices" element={<Devices />} />
          <Route path="/analytics" element={<Analytics />} />
        </Routes>
      </Layout>
    </div>
  )
}

export default App