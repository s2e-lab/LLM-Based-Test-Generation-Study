// PlayerConfiguration_0Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {

    /**
     * Test method for {@link PlayerConfiguration#copy()}.
     */
    @Test
    void testCopy() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.ROUND_DELAY = 100;
        config.PLAYER_DELAY = 200;
        config.ACTION_DELAY = 300;
        config.SHOW_MOVETARGETS = true;
        config.SHOW_SHOOTLINE = true;
        final PlayerConfiguration copy = config.copy();
        assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
        assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
        assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
    }
}

// PlayerConfiguration_1Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_1Test {
		
    /**
     * Test method for {@link PlayerConfiguration#copy()}.
     */
    @Test
    void testCopy() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.ROUND_DELAY = 100;
        config.PLAYER_DELAY = 200;
        config.ACTION_DELAY = 300;
        config.SHOW_MOVETARGETS = true;
        config.SHOW_SHOOTLINE = true;
        final PlayerConfiguration copy = config.copy();
        assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
        assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
        assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
    }
}

// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_2Test {
		
    /**
     * Test method for {@link PlayerConfiguration#copy()}.
     */
    @Test
    void testCopy() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.ROUND_DELAY = 100;
        config.PLAYER_DELAY = 200;
        config.ACTION_DELAY = 300;
        config.SHOW_MOVETARGETS = true;
        config.SHOW_SHOOTLINE = true;
        final PlayerConfiguration copy = config.copy();
        assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
        assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
        assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
    }
}

// PlayerConfiguration_3Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_3Test {
		
    /**
     * Test method for {@link PlayerConfiguration#copy()}.
     */
    @Test
    void testCopy() {
        final PlayerConfiguration config = new PlayerConfiguration();
        config.ROUND_DELAY = 100;
        config.PLAYER_DELAY = 200;
        config.ACTION_DELAY = 300;
        config.SHOW_MOVETARGETS = true;
        config.SHOW_SHOOTLINE = true;
        final PlayerConfiguration copy = config.copy();
        assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
        assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
        assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
        assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
        assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
    }
}

// PlayerConfiguration_4Test.java
package de.outstare.fortbattleplayer.player;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of