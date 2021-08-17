package com.programmers.java;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import static com.programmers.java.Attributes.*;
import static java.util.stream.Collectors.toList;

// tag::classDefinition[]
class TextFile { // default 접근자로서 패키지영역에서만 접근가능, 텍스트 파일의 데이터를 추출하는 클래스
    private final Map<String, String> attributes;
    private final List<String> lines;

    // class continues ...
// end::classDefinition[]

    TextFile(final File file) throws IOException {
        attributes = new HashMap<>();
        attributes.put(PATH, file.getPath());
        lines = Files.lines(file.toPath()).collect(toList());
    }

    Map<String, String> getAttributes() {
        return attributes;
    }

    // tag::addLines[]
    int addLines(
            final int start,
            final Predicate<String> isEnd,
            final String attributeName) {

        final StringBuilder accumulator = new StringBuilder();
        int lineNumber;
        for (lineNumber = start; lineNumber < lines.size(); lineNumber++) {
            final String line = lines.get(lineNumber);
            if (isEnd.test(line)) {
                break;
            }

            accumulator.append(line);
            accumulator.append("\n");
        }
        attributes.put(attributeName, accumulator.toString().trim());
        return lineNumber;
    }
    // end::addLines[]

    // tag::addLineSuffix[]
    void addLineSuffix(final String prefix, final String attributeName) {
        for(final String line: lines) {
            if (line.startsWith(prefix)) {
                attributes.put(attributeName, line.substring(prefix.length()));
                break;
            }
        }
    }
    // end::addLineSuffix[]
}
