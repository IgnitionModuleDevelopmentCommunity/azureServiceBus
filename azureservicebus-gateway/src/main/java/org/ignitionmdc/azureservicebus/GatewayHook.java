package org.ignitionmdc.azureservicebus;

import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.ignition.gateway.model.AbstractGatewayModuleHook;
import com.inductiveautomation.ignition.gateway.model.GatewayContext;
import com.microsoft.windowsazure.services.servicebus.ServiceBusConfiguration;
import com.microsoft.windowsazure.services.servicebus.ServiceBusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GatewayHook extends AbstractGatewayModuleHook {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void setup(GatewayContext gatewayContext) {

    }

    @Override
    public void startup(LicenseState licenseState) {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        super.initializeScriptManager(manager);
        manager.addScriptModule("system.azure.servicebus.ServiceBusConfiguration", ServiceBusConfiguration.class);
        manager.addScriptModule("system.azure.servicebus.ServiceBusService", ServiceBusService.class);
        manager.addScriptModule("system.azure.servicebus", ScriptFunctions.class);
    }
}
