package br.com.bta.projic.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class Projeto_PalavrasChaveSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String palavrasChave, JsonGenerator jsonGenerator, SerializerProvider serializer) throws IOException {
        var palavras = palavrasChave.split(",");
        
        jsonGenerator.writeArray(palavras, 0, palavras.length);
    }
    
}
