package com.byoutline.kickmaterial.events;

import com.byoutline.kickmaterial.model.EmailAndPass;
import com.byoutline.ottocachedfield.events.ResponseEventWithArgImpl;

/**
 * Created by Sebastian Kacprzak <sebastian.kacprzak at byoutline.com> on 31.03.15.
 */
public class AccessTokenFetchingFailedEvent extends ResponseEventWithArgImpl<Exception, EmailAndPass> {
}
