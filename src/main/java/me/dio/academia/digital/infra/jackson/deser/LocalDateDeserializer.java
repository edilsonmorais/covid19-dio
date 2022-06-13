package me.dio.academia.digital.infra.jackson.deser;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalDateDeserializer extends StdDeserializer<LocalDate>{
	

	private static final long serialVersionUID = -4589164298310392227L;
	

	protected LocalDateDeserializer() {
		super(LocalDate.class);
	}
	
	@Override
	public LocalDate deserialize(JsonParser parser, final DeserializationContext ctxt) throws IOException, JacksonException {
		return LocalDate.parse(parser.readValueAs(String.class));
	}

}
