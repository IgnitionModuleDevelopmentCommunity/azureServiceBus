package org.ignitionmdc.azureservicebus;

import com.microsoft.windowsazure.Configuration;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.services.servicebus.ServiceBusConfiguration;
import com.microsoft.windowsazure.services.servicebus.ServiceBusContract;
import com.microsoft.windowsazure.services.servicebus.ServiceBusService;
import com.microsoft.windowsazure.services.servicebus.models.*;

/**
 * Created by kevin.mcclusky on 6/1/2017.
 */
public class ScriptFunctions {

    public static BrokeredMessage getBrokeredMessage(String body) {
        return new BrokeredMessage(body);
    }

    public static QueueInfo getQueueInfo(String path) {
        return new QueueInfo(path);
    }

    public static TopicInfo getTopicInfo(String path) {
        return new TopicInfo(path);
    }

    public static SubscriptionInfo getSubscriptionInfo(String name) {
        return new SubscriptionInfo(name);
    }

    public static RuleInfo getRuleInfo(String name) {
        return new RuleInfo(name);
    }

    public static ReceiveMessageOptions getDefaultReceiveMessageOptions() {
        return ReceiveMessageOptions.DEFAULT;
    }

    public static ReceiveMode getReceiveMode(String mode) throws Exception {
        if (mode.equals("PEEK_LOCK")) {
            return ReceiveMode.PEEK_LOCK;
        }
        else if (mode.equals("RECEIVE_AND_DELETE")) {
            return ReceiveMode.RECEIVE_AND_DELETE;
        }
        else {
            throw new Exception("No matching receive mode found");
        }
    }

}
