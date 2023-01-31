package br.com.bta.projic.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import br.com.bta.projic.model.OrientadoresProjeto;

public class Projeto_OrientadoresProjetoSerializer extends JsonSerializer<OrientadoresProjeto> {

    @Override
    public void serialize(OrientadoresProjeto orientadoresProjeto, JsonGenerator jsonGenerator, SerializerProvider serializer)
            throws IOException {
            var orientador =  orientadoresProjeto.getOrientador();

            jsonGenerator.writeStartObject();
            jsonGenerator.writeObjectField("id", orientador.getId());
            jsonGenerator.writeStringField("tipoOrientador", orientadoresProjeto.getTipoOrientador().name());
            jsonGenerator.writeStringField("nome", orientador.getNome());
            jsonGenerator.writeStringField("ra", orientador.getNome());
            jsonGenerator.writeStringField("currLattes", orientador.getCurrLattes());
            jsonGenerator.writeStringField("email", orientador.getEmail());
            jsonGenerator.writeEndObject();
        
    }
    
}
