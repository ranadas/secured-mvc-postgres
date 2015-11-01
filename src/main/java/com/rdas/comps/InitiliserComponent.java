package com.rdas.comps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by rdas on 30/10/2015.
 */
@Component
public class InitiliserComponent implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger log = LoggerFactory.getLogger(InitiliserComponent.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("\n\n{} \n\n", "InitiliserComponent Loading init data");
    }
}
