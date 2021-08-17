package com.programmers.java;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import static com.programmers.java.Attributes.*;

class InvoiceImporter implements Importer { // 청구서 관련 문서를 임포트하는 클래스
    private static final String NAME_PREFIX = "Dear ";
    private static final String AMOUNT_PREFIX = "Amount: ";

    // tag::importFile[]
    @Override
    public Document importFile(final File file) throws IOException {
        final TextFile textFile = new TextFile(file);
        textFile.addLineSuffix(NAME_PREFIX, PATIENT);
        textFile.addLineSuffix(AMOUNT_PREFIX, AMOUNT);

        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "INVOICE");
        return new Document(attributes);
    }
    // end::importFile[]
}
