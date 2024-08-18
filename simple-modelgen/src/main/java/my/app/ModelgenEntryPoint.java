package my.app;

import com.google.auto.service.AutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@AutoService(Processor.class)
@SupportedAnnotationTypes({
        "jakarta.persistence.Entity", "javax.persistence.Entity"
})
public class ModelgenEntryPoint extends AbstractProcessor {

    private static final Logger log = LoggerFactory.getLogger(ModelgenEntryPoint.class);

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        log.debug("Инициирована генерации данных для модели...");

        return false;
    }
}
