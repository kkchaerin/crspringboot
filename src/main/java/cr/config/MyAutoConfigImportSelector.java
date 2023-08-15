package cr.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
            "cr.config.autoconfig.DispatcherServletConfig",
            "cr.config.autoconfig.TomcatWebServerConfig",
        };
    }
}
