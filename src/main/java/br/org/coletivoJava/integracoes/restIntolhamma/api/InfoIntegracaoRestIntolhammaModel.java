package br.org.coletivoJava.integracoes.restIntolhamma.api;

import javax.inject.Qualifier;
import br.org.coletivoJava.integracoes.ollama.api.chat.FabApiRestOllhamaAgenteModel;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InfoIntegracaoRestIntolhammaModel {

	FabApiRestOllhamaAgenteModel tipo();
}