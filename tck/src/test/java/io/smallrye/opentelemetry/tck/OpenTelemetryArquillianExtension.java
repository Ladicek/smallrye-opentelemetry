package io.smallrye.opentelemetry.tck;

import org.jboss.arquillian.container.test.spi.client.deployment.ApplicationArchiveProcessor;
import org.jboss.arquillian.core.spi.LoadableExtension;

public class OpenTelemetryArquillianExtension implements LoadableExtension {
    @Override
    public void register(ExtensionBuilder extensionBuilder) {
        extensionBuilder.service(ApplicationArchiveProcessor.class, OpenTelemetryDeploymentProcessor.class);
    }
}
