// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {

    /**
    * Test case for {@link JCLO#usage()} method.
    */
    @Test
    void testUsage() {
        JCLO jclo = new JCLO(new TestObject());
        String usage = jclo.usage();
        String expected = "Usage: java JCLO_1Test [options]\n" +
        "  -a, --array-of-bytes <arg>   array of bytes\n" +
        "  -b, --array-of-chars <arg>   array of chars\n" +
        "  -c, --array-of-shorts <arg>  array of shorts\n" +
        "  -d, --array-of-ints <arg>    array of ints\n" +
        "  -e, --array-of-floats <arg>  array of floats\n" +
        "  -f, --array-of-doubles <arg> array of doubles\n" +
        "  -g, --array-of-longs <arg>   array of longs\n" +
        "  -h, --array-of-strings <arg> array of strings\n" +
        "  -i, --array-of-objects <arg> array of objects\n" +
        "  -j, --array-of-arrays <arg>  array of arrays\n" +
        "  -k, --array-of-booleans <arg> array of booleans\n" +
        "  -l, --array-of-bytes-2 <arg> array of bytes\n" +
        "  -m, --array-of-chars-2 <arg> array of chars\n" +
        "  -n, --array-of-shorts-2 <arg> array of shorts\n" +
        "  -o, --array-of-ints-2 <arg>   array of ints\n" +
        "  -p, --array-of-floats-2 <arg> array of floats\n" +
        "  -q, --array-of-doubles-2 <arg> array of doubles\n" +
        "  -r, --array-of-longs-2 <arg>  array of longs\n" +
        "  -s, --array-of-strings-2 <arg> array of strings\n" +
        "  -t, --array-of-objects-2 <arg> array of objects\n" +
        "  -u, --array-of-arrays-2 <arg>  array of arrays\n" +
        "  -v, --array-of-booleans-2 <arg> array of booleans\n" +
        "  -w, --array-of-bytes-3 <arg> array of bytes\n" +
        "  -x, --array-of-chars-3 <arg> array of chars\n" +
        "  -y, --array-of-shorts-3 <arg> array of shorts\n" +
        "  -z, --array-of-ints-3 <arg>   array of ints\n" +
        "  -A, --array-of-floats-3 <arg> array of floats\n" +
        "  -B, --array-of-doubles-3 <arg> array of doubles\n" +
        "  -C, --array-of-longs-3 <arg>  array of longs\n" +
        "  -D, --array-of-strings-3 <arg> array of strings\n" +
        "  -E, --array-of-objects-3 <arg> array of objects\n" +
        "  -F, --array-of-arrays-3 <arg>  array of arrays\n" +
        "  -G, --array-of-booleans-3 <arg> array of booleans\n" +
        "  -H, --array-of-bytes-4 <arg> array of bytes\n" +
        "  -I, --array-of-chars-4 <arg> array of chars\n" +
        "  -J, --array-of-shorts-4 <arg> array of shorts\n" +
        "  -K, --array-of-ints-4 <arg>   array of ints\n" +
        "  -L, --array-of-floats-4 <arg> array of floats\n" +
        "  -M, --array-of-doubles-4 <arg> array of doubles\n" +
        "  -N, --array-of-longs-4 <arg>  array of longs\n" +
        "  -O, --array-of-strings-4 <arg> array of strings\n" +
        "  -P, --array-of-objects-4 <arg> array of objects\n" +
        "  -Q, --array-of-arrays-4 <arg>  array of arrays\n" +
        "  -R, --array-of-booleans-4 <arg> array of booleans\n" +
        "  -S, --array-of-bytes-5 <arg> array of bytes\n" +
        "  -T, --array-of-chars-5 <arg> array of chars\n" +
        "  -U, --array-of-shorts-5 <arg> array of shorts\n" +
        "  -V, --array-of-ints-5 <arg>   array of ints\n" +
        "  -W, --array-of-floats-5 <arg> array of floats\n" +
        "  -X, --array-of-doubles-5 <arg> array of doubles\n" +
        "  -Y, --array-of-longs-5 <arg>  array of longs\n" +
        "  -Z, --array-of-strings-5 <arg> array of strings\n" +
        "  -aa, --array-of-objects-5 <arg> array of objects\n" +
        "  -ab, --array-of-arrays-5 <arg>  array of arrays\n" +
        "  -ac, --array-of-booleans-5 <arg> array of booleans\n" +
        "  -ad, --array-of-bytes-6 <arg> array of bytes\n" +
        "  -ae, --array-of-chars-6 <arg> array of chars\n" +
        "  -af, --array-of-shorts-6 <arg> array of shorts\n" +
        "  -ag, --array-of-ints-6 <arg>   array of ints\n" +
        "  -ah, --array-of-floats-6 <arg> array of floats\n" +
        "  -ai, --array-of-doubles-6 <arg> array of doubles\n" +
        "  -aj, --array-of-longs-6 <arg>  array of longs\n" +
        "  -ak, --array-of-strings-6 <arg> array of strings\n" +
        "  -al, --array-of-objects-6 <arg> array of objects\n" +
        "  -am, --array-of-arrays-6 <arg>  array of arrays\n" +
        "  -an, --array-of-booleans-6 <arg> array of booleans\n" +
        "  -ao, --array-of-bytes-7 <arg> array of bytes\n" +
        "  -ap, --array-of-chars-7 <arg> array of chars\n" +
        "  -aq, --array-of-shorts-7 <arg> array of shorts\n" +
        "  -ar, --array-of-ints-7 <arg>   array of ints\n" +
        "  -as, --array-of-floats-7 <arg> array of floats\n" +
        "  -at, --array-of-doubles-7 <arg> array of doubles\n" +
        "  -au, --array-of-longs-7 <arg>  array of longs\n" +
        "  -av, --array-of-strings-7 <arg> array of strings\n" +
        "  -aw, --array-of-objects-7 <arg> array of objects\n" +
        "  -ax, --array-of-arrays-7 <arg>  array of arrays\n" +
        "  -ay, --array-of-booleans-7 <arg> array of booleans\n" +
        "  -az, --array-of-bytes-8 <arg> array of bytes\n" +