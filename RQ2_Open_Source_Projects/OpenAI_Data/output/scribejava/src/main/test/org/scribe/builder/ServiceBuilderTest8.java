// ServiceBuilderTest8.java
package org.scribe.builder;

import java.io.*;
import org.scribe.builder.api.*;
import org.scribe.exceptions.*;
import org.scribe.model.*;
import org.scribe.oauth.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServiceBuilder}.
* It contains ten unit test cases for the {@link ServiceBuilder#debug()} method.
*/
class ServiceBuilderTest8 {

		private static final String STREAM_IS_NULL = "The stream is null";
		private static final String STREAM_IS_NOT_NULL = "The stream is not null";
		private static final String STREAM_IS_NOT_SYSTEM_OUT = "The stream is not System.out";
		private static final String STREAM_IS_SYSTEM_OUT = "The stream is System.out";
		private static final String STREAM_IS_NOT_SYSTEM_ERR = "The stream is not System.err";
		private static final String STREAM_IS_SYSTEM_ERR = "The stream is System.err";
		private static final String STREAM_IS_NOT_SYSTEM_IN = "The stream is not System.in";
		private static final String STREAM_IS_SYSTEM_IN = "The stream is System.in";
		private static final String STREAM_IS_NOT_NULL_OUTPUT_STREAM = "The stream is not a NullOutputStream";
		private static final String STREAM_IS_NULL_OUTPUT_STREAM = "The stream is a NullOutputStream";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM = "The stream is not a NullPrintStream";
		private static final String STREAM_IS_NULL_PRINT_STREAM = "The stream is a NullPrintStream";
		private static final String STREAM_IS_NOT_NULL_INPUT_STREAM = "The stream is not a NullInputStream";
		private static final String STREAM_IS_NULL_INPUT_STREAM = "The stream is a NullInputStream";
		private static final String STREAM_IS_NOT_NULL_BYTE_ARRAY_OUTPUT_STREAM = "The stream is not a NullByteArrayOutputStream";
		private static final String STREAM_IS_NULL_BYTE_ARRAY_OUTPUT_STREAM = "The stream is a NullByteArrayOutputStream";
		private static final String STREAM_IS_NOT_NULL_BYTE_ARRAY_INPUT_STREAM = "The stream is not a NullByteArrayInputStream";
		private static final String STREAM_IS_NULL_BYTE_ARRAY_INPUT_STREAM = "The stream is a NullByteArrayInputStream";
		private static final String STREAM_IS_NOT_NULL_PIPED_OUTPUT_STREAM = "The stream is not a NullPipedOutputStream";
		private static final String STREAM_IS_NULL_PIPED_OUTPUT_STREAM = "The stream is a NullPipedOutputStream";
		private static final String STREAM_IS_NOT_NULL_PIPED_INPUT_STREAM = "The stream is not a NullPipedInputStream";
		private static final String STREAM_IS_NULL_PIPED_INPUT_STREAM = "The stream is a NullPipedInputStream";
		private static final String STREAM_IS_NOT_NULL_FILE_OUTPUT_STREAM = "The stream is not a NullFileOutputStream";
		private static final String STREAM_IS_NULL_FILE_OUTPUT_STREAM = "The stream is a NullFileOutputStream";
		private static final String STREAM_IS_NOT_NULL_FILE_INPUT_STREAM = "The stream is not a NullFileInputStream";
		private static final String STREAM_IS_NULL_FILE_INPUT_STREAM = "The stream is a NullFileInputStream";
		private static final String STREAM_IS_NOT_NULL_OBJECT_OUTPUT_STREAM = "The stream is not a NullObjectOutputStream";
		private static final String STREAM_IS_NULL_OBJECT_OUTPUT_STREAM = "The stream is a NullObjectOutputStream";
		private static final String STREAM_IS_NOT_NULL_OBJECT_INPUT_STREAM = "The stream is not a NullObjectInputStream";
		private static final String STREAM_IS_NULL_OBJECT_INPUT_STREAM = "The stream is a NullObjectInputStream";
		private static final String STREAM_IS_NOT_NULL_DATA_OUTPUT_STREAM = "The stream is not a NullDataOutputStream";
		private static final String STREAM_IS_NULL_DATA_OUTPUT_STREAM = "The stream is a NullDataOutputStream";
		private static final String STREAM_IS_NOT_NULL_DATA_INPUT_STREAM = "The stream is not a NullDataInputStream";
		private static final String STREAM_IS_NULL_DATA_INPUT_STREAM = "The stream is a NullDataInputStream";
		private static final String STREAM_IS_NOT_NULL_FILTER_OUTPUT_STREAM = "The stream is not a NullFilterOutputStream";
		private static final String STREAM_IS_NULL_FILTER_OUTPUT_STREAM = "The stream is a NullFilterOutputStream";
		private static final String STREAM_IS_NOT_NULL_FILTER_INPUT_STREAM = "The stream is not a NullFilterInputStream";
		private static final String STREAM_IS_NULL_FILTER_INPUT_STREAM = "The stream is a NullFilterInputStream";
		private static final String STREAM_IS_NOT_NULL_BUFFERED_OUTPUT_STREAM = "The stream is not a NullBufferedOutputStream";
		private static final String STREAM_IS_NULL_BUFFERED_OUTPUT_STREAM = "The stream is a NullBufferedOutputStream";
		private static final String STREAM_IS_NOT_NULL_BUFFERED_INPUT_STREAM = "The stream is not a NullBufferedInputStream";
		private static final String STREAM_IS_NULL_BUFFERED_INPUT_STREAM = "The stream is a NullBufferedInputStream";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_1 = "The stream is not a NullPrintStream1";
		private static final String STREAM_IS_NULL_PRINT_STREAM_1 = "The stream is a NullPrintStream1";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_2 = "The stream is not a NullPrintStream2";
		private static final String STREAM_IS_NULL_PRINT_STREAM_2 = "The stream is a NullPrintStream2";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_3 = "The stream is not a NullPrintStream3";
		private static final String STREAM_IS_NULL_PRINT_STREAM_3 = "The stream is a NullPrintStream3";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_4 = "The stream is not a NullPrintStream4";
		private static final String STREAM_IS_NULL_PRINT_STREAM_4 = "The stream is a NullPrintStream4";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_5 = "The stream is not a NullPrintStream5";
		private static final String STREAM_IS_NULL_PRINT_STREAM_5 = "The stream is a NullPrintStream5";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_6 = "The stream is not a NullPrintStream6";
		private static final String STREAM_IS_NULL_PRINT_STREAM_6 = "The stream is a NullPrintStream6";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_7 = "The stream is not a NullPrintStream7";
		private static final String STREAM_IS_NULL_PRINT_STREAM_7 = "The stream is a NullPrintStream7";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_8 = "The stream is not a NullPrintStream8";
		private static final String STREAM_IS_NULL_PRINT_STREAM_8 = "The stream is a NullPrintStream8";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_9 = "The stream is not a NullPrintStream9";
		private static final String STREAM_IS_NULL_PRINT_STREAM_9 = "The stream is a NullPrintStream9";
		private static final String STREAM_IS_NOT_NULL_PRINT_STREAM_10 = "The stream is not a NullPrintStream10";
		private static final String STREAM_IS_NULL_PRINT_