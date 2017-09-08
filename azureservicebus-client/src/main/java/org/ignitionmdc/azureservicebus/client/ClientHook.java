package org.ignitionmdc.azureservicebus.client;

import com.inductiveautomation.ignition.client.model.ClientContext;
import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.common.script.ScriptManager;
import com.inductiveautomation.vision.api.client.AbstractClientModuleHook;
import com.microsoft.windowsazure.services.servicebus.ServiceBusConfiguration;
import com.microsoft.windowsazure.services.servicebus.ServiceBusService;
import org.ignitionmdc.azureservicebus.ScriptFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientHook extends AbstractClientModuleHook {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void startup(ClientContext context, LicenseState activationState) throws Exception {
        super.startup(context, activationState);
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        super.initializeScriptManager(manager);
        manager.addScriptModule("system.azure.servicebus.ServiceBusConfiguration", ServiceBusConfiguration.class);
        manager.addScriptModule("system.azure.servicebus.ServiceBusService", ServiceBusService.class);
        manager.addScriptModule("system.azure.servicebus", ScriptFunctions.class);
    }
}
