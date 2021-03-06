package ru.vyarus.dropwizard.guice.cases.hkscope.support

import org.glassfish.hk2.api.Injectee
import org.glassfish.hk2.api.InjectionResolver
import org.glassfish.hk2.api.ServiceHandle
import ru.vyarus.dropwizard.guice.module.installer.feature.jersey.GuiceManaged

import javax.ws.rs.ext.Provider

/**
 * @author Vyacheslav Rusakov
 * @since 19.01.2016
 */
@Provider
@GuiceManaged
class GuiceInjectionResolver implements InjectionResolver<Ann> {

    @Override
    Object resolve(Injectee injectee, ServiceHandle root) {
        return null
    }

    @Override
    boolean isConstructorParameterIndicator() {
        return false
    }

    @Override
    boolean isMethodParameterIndicator() {
        return false
    }
}
