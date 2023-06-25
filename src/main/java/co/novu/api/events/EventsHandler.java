package co.novu.api.events;

import co.novu.api.events.requests.TriggerEventRequest;
import co.novu.api.events.responses.TriggerEventResponse;
import co.novu.common.base.NovuConfig;
import co.novu.common.rest.RestHandler;

public class EventsHandler {

    private final RestHandler restHandler;

    public EventsHandler(RestHandler restHandler) {
        this.restHandler = restHandler;
    }

    public TriggerEventResponse triggerEvent(TriggerEventRequest request, NovuConfig novuConfig) {
        return null;
    }
}