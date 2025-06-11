package br.org.coletivoJava.integracoes.restIntollama.api;

import javax.inject.Qualifier;
import br.org.coletivoJava.integracoes.ollama.api.chat.FabApiRestOllamaChat;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InfoIntegracaoRestIntollamaChat {

	FabApiRestOllamaChat tipo();
}