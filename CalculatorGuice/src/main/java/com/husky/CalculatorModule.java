package com.husky;

import com.google.inject.AbstractModule;

class CalculatorModule extends AbstractModule {
    protected void configure() {
        bind(Action.class).to(CalculatorService.class);
    }
}