package com.ashokit;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateSerialzer extends StdSerializer<Date> {

    public CustomDateSerialzer() {
        this(null);
    }

    protected CustomDateSerialzer(Class<Date> t) {
        super(t);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void serialize(Date dateValue, JsonGenerator gen, SerializerProvider provider) throws IOException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        gen.writeString(sdf.format(dateValue));
    }
}

