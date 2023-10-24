// ParameterBeanTest.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains ten unit test cases for the {@link ParameterBean#size()} method.
*/
class ParameterBeanTest {

    /**
     * Test method for {@link ParameterBean#size()}.
     */
    @Test
    void testSize() {
        ParameterBean parameterBean = new ParameterBean();
        parameterBean.addSearchParameter("name", "value");
        assertEquals(1, parameterBean.size());
    }
}

// ParameterBean.java
package org.heal.module.search;

import java.util.*;

public class ParameterBean {

    /**
     * Accessor method, returns the searchParameter size
     *
     * @return int
     */
    public int size() {
        return searchParameters.size();
    }
}

// ParameterBeanTest.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It