package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Strlen {
    /**
     * Return length of given string
     * >>> strlen('')
     * 0
     * >>> strlen('abc')
     * 3
     *
     * > strlen("")
     * 0
     * > strlen("x")
     * 1
     * > strlen("asdasnakj")
     * 9
     */
    public static int strlen(String string) {
        return string.length();
    }

}