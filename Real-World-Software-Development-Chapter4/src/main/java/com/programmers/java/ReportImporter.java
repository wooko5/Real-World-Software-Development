package com.programmers.java;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import static com.programmers.java.Attributes.*;

class ReportImporter implements Importer { // 보고서 관련 문서를 임포트하는 클래스
    private static final String NAME_PREFIX = "Patient: ";

    @Override
    public Document importFile(final File file) throws IOException {
        final TextFile textFile = new TextFile(file);
        textFile.addLineSuffix(NAME_PREFIX, PATIENT);
        textFile.addLines(2, line -> false, BODY);

        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "REPORT");
        return new Document(attributes);
    }
}