package com.programmers.java;

import java.io.File;
import java.io.IOException;

// tag::importer[]
interface Importer { // 임포트할 문서의 종류를 추상화한 인터페이스
    Document importFile(File file) throws IOException;
}
// end::importer[]