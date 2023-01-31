package br.com.bta.projic.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import br.com.bta.projic.model.Autor;

public class Projeto_AutorSerializer extends JsonSerializer<Autor> {

    @Override
    public void serialize(Autor autor, JsonGenerator jsonGenerator, SerializerProvider serializer) throws IOException {
        
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectField("id", autor.getId());
        jsonGenerator.writeStringField("nome", autor.getNome());
        jsonGenerator.writeStringField("ra", autor.getRa());
        jsonGenerator.writeEndObject();
    }
    
}
